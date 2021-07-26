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
package org.igrouppurchase.common.compete.resource.impl.manager;

import org.igrouppurchase.common.compete.resource.IResourceManager;
import org.igrouppurchase.common.compete.resource.IResourceStrategy;
import org.igrouppurchase.common.compete.resource.constant.ResourceManagerConstant;
import org.igrouppurchase.component.core.spring.ioc.util.SpringUtils;

/**
 * 资源策略.
 *
 * @author yuzhanchao
 * @date 2021/7/26 17:34
 */
public class ResourceStrategy implements IResourceStrategy {

    public static class Config {
        /**
         * 是否分布式资源.
         */
        private boolean distributedResource;

        /**
         * Gets the value of distributedResource.
         *
         * @return the value of distributedResource
         */
        public boolean getDistributedResource() {
            return distributedResource;
        }

        /**
         * Sets the distributedResource.
         *
         * <p>You can use getDistributedResource() to get the value of distributedResource</p>
         *
         * @param distributedResource distributedResource
         */
        public void setDistributedResource(boolean distributedResource) {
            this.distributedResource = distributedResource;
        }
    }

    public ResourceStrategy(Config config) {
        this.config = config;
        init();
    }

    /**
     * config.
     */
    private Config config;

    /**
     * resource manager.
     */
    private IResourceManager manager;

    private void init () {
        setManager(this.config.getDistributedResource());
    }

    /**
     * set manager.
     * @param distributed is distributed.
     */
    public void setManager(boolean distributed) {
        if (distributed) {
            this.manager = (IResourceManager)SpringUtils.getBean(ResourceManagerConstant.DISTRIBUTED_MANAGER);
        } else {
            this.manager = (IResourceManager)SpringUtils.getBean(ResourceManagerConstant.DISTRIBUTED_MANAGER);
        }
    }

    /**
     * get manager.
     * @return resource manager.
     */
    @Override
    public IResourceManager getManager() {
        return this.manager;
    }

}
