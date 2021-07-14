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
package org.igrouppurchase.component.core.entity.model.impl;

import org.igrouppurchase.component.core.entity.model.IIdModel;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * the default impl for IIdModel.
 *
 * @author yuzhanchao
 * @date 2021/7/1 11:30
 */
@MappedSuperclass
public class IdModel<ID extends Serializable> implements IIdModel<ID> {

    /**
     * id.
     */
    private ID uid;

    /**
     * get current id.
     * @return id.
     */
    @Column(name="UID", length=36)
    @Id
    @Override
    public ID getId() {
        return uid;
    }

    /**
     * set current id.
     * @param id id.
     */
    @Override
    public void setId(ID id) {
        this.uid = id;
    }
}
