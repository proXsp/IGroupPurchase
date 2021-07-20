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
package org.igrouppurchase.user.domain.impl;

import org.igrouppurchase.user.domain.IUserDomain;
import org.igrouppurchase.user.domain.dao.UserDao;
import org.igrouppurchase.user.domain.entity.UserDO;
import org.igrouppurchase.user.domain.entity.po.User;
import org.igrouppurchase.user.domain.transfer.UserDomainTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * TODO.
 *
 * @author yuzhanchao
 * @date 2021/7/19 20:37
 */
@Service
@Transactional
public class UserDomain implements IUserDomain {

    /**
     * user dao.
     */
    @Autowired
    private UserDao userDao;

    /**
     * UserDomainTransfer.
     */
    private UserDomainTransfer userDomainTransfer = new UserDomainTransfer();


    @Override
    public Optional<UserDO> find(String userId) {
        return userDao.findById(userId).flatMap(user -> userDomainTransfer.toDo(user));
    }

    @Override
    public Optional<String> findPassword(String userId) {
        return userDao.findById(userId).map(User::getPassword);
    }
}
