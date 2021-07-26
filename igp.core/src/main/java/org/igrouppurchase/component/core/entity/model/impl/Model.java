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

import org.igrouppurchase.component.core.entity.model.IModel;

/**
 * model.
 *
 * @author yuzhanchao
 * @date 2021/7/19 20:54
 */
public class Model implements IModel {

    /**
     * serial version.
     */
    private static final long serialVersionUID = -3294912754997392209L;

    /**
     * LifeCycle Of Model.
     */
    private transient Integer lifeCycle;

    /**
     * Gets the value of lifeCycle.
     *
     * @return the value of lifeCycle
     */
    @Override
    public Integer getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Sets the lifeCycle.
     *
     * <p>You can use getLifeCycle() to get the value of lifeCycle</p>
     *
     * @param lifeCycle lifeCycle
     */
    @Override
    public void setLifeCycle(Integer lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    /**
     * to string.
     * @return string of this model.
     */
    @Override public String toString() {
        return "lifeCycle=" + lifeCycle + "; ";
    }
}
