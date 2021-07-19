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
package org.igrouppurchase.user.domain;

import org.igrouppurchase.user.domain.entity.UserDO;

import java.util.Optional;

/**
 * user context.
 *
 * @author yuzhanchao
 * @date 2021/7/19 20:32
 */
public interface IUserDomain {

    /**
     * find one by userId.
     * @param userId userId.
     * @return user domainModel optional.
     */
    Optional<UserDO> find(String userId);

    /**
     * find password by userId.
     * @param userId userId.
     * @return password.
     */
    Optional<String> findPassword(String userId);
}
