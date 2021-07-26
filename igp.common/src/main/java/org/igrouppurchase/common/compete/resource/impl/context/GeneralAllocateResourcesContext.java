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
package org.igrouppurchase.common.compete.resource.impl.context;

import org.igrouppurchase.common.compete.resource.IAllocateResourcesContext;
import org.igrouppurchase.common.compete.resource.IResourceManager;
import org.igrouppurchase.common.compete.resource.IResourceStrategy;
import org.igrouppurchase.common.compete.resource.bo.IResourceBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 通用资源分配场景.
 *
 * @author yuzhanchao
 * @date 2021/7/26 16:11
 */
@Service
public class GeneralAllocateResourcesContext implements IAllocateResourcesContext {

    @Autowired
    private IResourceStrategy resourceStrategy;

    private IResourceManager getResourceManager() {
        return resourceStrategy.getManager();
    }

    public void createResource(IResourceBO resource) {

    }

}
