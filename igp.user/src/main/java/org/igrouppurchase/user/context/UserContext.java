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

import org.igrouppurchase.component.base.log.ILog;
import org.igrouppurchase.component.base.log.LoggerFactory;
import org.igrouppurchase.user.domain.IUserDomain;
import org.igrouppurchase.user.domain.dao.UserDao;
import org.igrouppurchase.user.domain.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

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
     * log.
     */
    private final ILog LOG = LoggerFactory.getLog(UserContext.class);

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

    @Override
    public boolean register(User user) {
        // OTHER AUTH TODO.
        try {
            user.setPassword(encodePassword(user.getPassword()));
            userDao.save(user);
        } catch (Throwable e) {
            if (LOG.isErrorEnabled()) {
                LOG.error("用户注册失败：", e);
            }
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return false;
        }
        return true;
    }

    /**
     * encode password.
     * @param password
     * @return
     */
    private String encodePassword(final String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
