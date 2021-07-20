/**
 * Copyright 2021-2030 IGroupPurchase
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.igrouppurchase.user.context;

import org.igrouppurchase.component.login.entity.dto.LoginDTO;
import org.igrouppurchase.user.domain.IUserDomain;
import org.igrouppurchase.user.domain.dao.UserDao;
import org.igrouppurchase.user.domain.entity.po.User;
import org.igrouppurchase.user.exception.NoSuchUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * user context.
 *
 * @author yuzhanchao
 * @date 2021/7/19 20:31
 */
@Service
@Transactional
public class UserContext implements IUserContext {

    /**
     * user domain.
     */
    @Autowired
    private IUserDomain userDomain;

    /**
     * user dao.
     */
    @Autowired
    private UserDao userDao;

    /**
     * PasswordEncoder.
     */
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String login(LoginDTO loginDTO) throws NoSuchUserException {
        String userId = loginDTO.getUserName();
        String password = loginDTO.getPassword();
        String encodedPassword = userDomain.findPassword(userId).orElse(null);
        if (encodedPassword == null) {
            throw new NoSuchUserException(userId);
        }

        if (passwordEncoder.matches(password, encodedPassword)) {
            // generate token and record TODO.
        } else {
            throw new NoSuchUserException(userId);
        }

        return null;
    }

    @Override
    public boolean register(User user) {
        // OTHER AUTH TODO.

        user.setPassword(encodePassword(user.getPassword()));
        userDao.save(user);
        return true;
    }

    /**
     * encode password.
     * @param password password.
     * @return encode password.
     */
    private String encodePassword(final String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
