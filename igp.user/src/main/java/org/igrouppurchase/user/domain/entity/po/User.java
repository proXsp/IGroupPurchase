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
package org.igrouppurchase.user.domain.entity.po;

import org.igrouppurchase.user.domain.entity.UserDO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User.
 *
 * @author yuzhanchao
 * @date 2021/7/19 19:59
 */
@Entity
@Table(name = "IGP_USER")
public class User extends UserDO {

    /**
     * password
     */
    private String password;

    /**
     * Gets the value of password.
     *
     * @return the value of password
     */
    @Column(name = "C_PASSWORD", length=72)
    public String getPassword() {
        return password;
    }

    /**
     * Sets the passWord.
     *
     * <p>You can use getPassWord() to get the value of passWord</p>
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
