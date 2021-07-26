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
package org.igrouppurchase.common.compete.resource.bo;

import org.igrouppurchase.common.compete.resource.type.ResourceTypeEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 礼物.
 *
 * @author yuzhanchao
 * @date 2021/7/26 16:02
 */
public class BaseResource<ID extends Serializable, DT extends Comparable<DT> > implements IResourceBO {

    /**
     * serial version.
     */
    private static final long serialVersionUID = -112065090699214918L;

    /**
     * id of resource.
     */
    private ID id;

    /**
     * 总计.
     */
    private DT total;

    /**
     * type of resource.
     */
    private ResourceTypeEnum type;

    /**
     * number of resource.
     */
    private Integer number;

    /**
     * expiration time.
     */
    private Date expiration;

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public ID getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * <p>You can use getId() to get the value of id</p>
     *
     * @param id id
     */
    public void setId(ID id) {
        this.id = id;
    }

    /**
     * Gets the value of total.
     *
     * @return the value of total
     */
    public DT getTotal() {
        return total;
    }

    /**
     * Sets the total.
     *
     * <p>You can use getTotal() to get the value of total</p>
     *
     * @param total total
     */
    public void setTotal(DT total) {
        this.total = total;
    }

    /**
     * Gets the value of type.
     *
     * @return the value of type
     */
    public ResourceTypeEnum getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * <p>You can use getType() to get the value of type</p>
     *
     * @param type type
     */
    public void setType(ResourceTypeEnum type) {
        this.type = type;
    }

    /**
     * Gets the value of number.
     *
     * @return the value of number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the number.
     *
     * <p>You can use getNumber() to get the value of number</p>
     *
     * @param number number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Gets the value of expiration.
     *
     * @return the value of expiration
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * Sets the expiration.
     *
     * <p>You can use getExpiration() to get the value of expiration</p>
     *
     * @param expiration expiration
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
