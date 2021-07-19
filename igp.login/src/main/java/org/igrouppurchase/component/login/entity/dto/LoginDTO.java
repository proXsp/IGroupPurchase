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
package org.igrouppurchase.component.login.entity.dto;

/**
 * login dto.
 *
 * @author yuzhanchao
 * @date 2021/7/19 18:26
 */
public class LoginDTO {

    /**
     * username.
     */
    private String userName;

    /**
     * password.
     */
    private String password;

    /**
     * Gets the value of userName.
     *
     * @return the value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the userName.
     *
     * <p>You can use getUserName() to get the value of userName</p>
     *
     * @param userName userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the value of password.
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * <p>You can use getPassword() to get the value of password</p>
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
