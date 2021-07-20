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
package org.igrouppurchase.user.domain.entity;

import org.igrouppurchase.component.core.entity.model.IIdModel;
import org.igrouppurchase.component.core.entity.model.impl.Model;
import org.igrouppurchase.user.domain.type.Sex;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * User.
 *
 * @author yuzhanchao
 * @date 2021/7/19 19:59
 */
@MappedSuperclass
public class UserDO extends Model implements IIdModel<String> {

    /**
     * user id.
     */
    private String id;

    /**
     * nick name.
     */
    private String nickName;

    /**
     * real name.
     */
    private String realName;

    /**
     * sex.
     */
    private Sex sex;

    /**
     * phone number.
     */
    private Integer phoneNumber;

    /**
     * account status
     */
    private Integer accountStatus;

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    @Override
    @Id
    @Column(name = "C_USERID", length=18)
    public String getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * <p>You can use getId() to get the value of id</p>
     *
     * @param id id
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the value of nickName.
     *
     * @return the value of nickName
     */
    @Column(name = "C_NICKNAME", length = 32)
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the nickName.
     *
     * <p>You can use getNickName() to get the value of nickName</p>
     *
     * @param nickName nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Gets the value of realName.
     *
     * @return the value of realName
     */
    @Column(name = "C_REALNAME", length = 10)
    public String getRealName() {
        return realName;
    }

    /**
     * Sets the realName.
     *
     * <p>You can use getRealName() to get the value of realName</p>
     *
     * @param realName realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Gets the value of sex.
     *
     * @return the value of sex
     */
    @Enumerated
    @Column(name = "C_SEX", length = 1)
    public Sex getSex() {
        return sex;
    }

    /**
     * Sets the sex.
     *
     * <p>You can use getSex() to get the value of sex</p>
     *
     * @param sex sex
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * Gets the value of phoneNumber.
     *
     * @return the value of phoneNumber
     */
    @Column(name = "C_PHONENUMBER", length = 13)
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phoneNumber.
     *
     * <p>You can use getPhoneNumber() to get the value of phoneNumber</p>
     *
     * @param phoneNumber phoneNumber
     */
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Gets the value of accountStatus.
     *
     * @return the value of accountStatus
     */
    @Column(name = "C_ACCOUNTSTATUS", length = 2, columnDefinition = "int default 0")
    public Integer getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the accountStatus.
     *
     * <p>You can use getAccountStatus() to get the value of accountStatus</p>
     *
     * @param accountStatus accountStatus
     */
    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return super.toString()
            + "userId=" + id
            + "; nickName=" + this.nickName
            + "; realName=" + this.realName
            + "; sex=" + this.sex
            + "; phoneNumber=" + this.phoneNumber
            + "; accountStatus=" + this.accountStatus + "; ";
    }
}
