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
package org.igrouppurchase.component.core.entity.model;

import java.io.Serializable;

/**
 * Tree Node Model.
 *
 * @author yuzhanchao
 * @date 2021/7/8 18:12
 */
public interface ITreeNode<ID extends Serializable> extends IIdModel<ID> {

    /**
     * 获取节点名称.
     * @return
     */
    String getName();

    /**
     * 设置节点名称.
     * @param name
     */
    void setName(String name);

    /**
     * 获取父级ID.
     * @return
     */
    ID getParentId();

    /**
     * 设置父级ID.
     * @param parentId
     */
    void setParentId(ID parentId);
}
