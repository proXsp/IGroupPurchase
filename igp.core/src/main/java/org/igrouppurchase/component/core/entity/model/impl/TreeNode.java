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

import org.igrouppurchase.component.core.entity.model.ITreeNode;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Tree Node Model.
 *
 * @author yuzhanchao
 * @date 2021/7/8 18:16
 */
@MappedSuperclass
public class TreeNode<ID extends Serializable> implements ITreeNode<ID> {

    /**
     * id.
     */
    private ID gid;

    /**
     * node name.
     */
    private String name;

    /**
     * parent id.
     */
    private ID parentId;

    /**
     * get current id.
     * @return id.
     */
    @Column(name="GID", length=72)
    @Id
    @Override
    public ID getId() {
        return this.gid;
    }

    /**
     * set current id.
     * @param id id.
     */
    @Override
    public void setId(ID id) {
        this.gid = id;
    }
    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    @Column(name="C_NAME", length=80)
    @Override public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * <p>You can use getName() to get the value of name</p>
     *
     * @param name name
     */
    @Override public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of parentId.
     *
     * @return the value of parentId
     */
    @Column(name="C_PARENTID", length=72)
    @Override public ID getParentId() {
        return parentId;
    }

    /**
     * Sets the parentId.
     *
     * <p>You can use getParentId() to get the value of parentId</p>
     *
     * @param parentId parentId
     */
    @Override public void setParentId(ID parentId) {
        this.parentId = parentId;
    }
}
