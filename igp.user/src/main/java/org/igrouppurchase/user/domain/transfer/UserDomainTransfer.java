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
package org.igrouppurchase.user.domain.transfer;

import org.igrouppurchase.component.core.entity.transfer.AbstractDomainModelTransfer;
import org.igrouppurchase.user.domain.entity.UserDO;
import org.igrouppurchase.user.domain.entity.po.User;

import java.util.Optional;

/**
 * user domain transfer.
 *
 * @author yuzhanchao
 * @date 2021/7/19 21:21
 */
public class UserDomainTransfer extends AbstractDomainModelTransfer<User, UserDO> {

    @Override
    public Optional<UserDO> toDo(User po) {
        if (po == null) {
            return Optional.empty();
        }
        UserDO userDO = new UserDO();
        userDO.setId(po.getId());
        userDO.setNickName(po.getNickName());
        userDO.setRealName(po.getRealName());
        userDO.setPhoneNumber(po.getPhoneNumber());
        userDO.setSex(po.getSex());
        userDO.setLifeCycle(po.getLifeCycle());
        return Optional.of(userDO);
    }
}
