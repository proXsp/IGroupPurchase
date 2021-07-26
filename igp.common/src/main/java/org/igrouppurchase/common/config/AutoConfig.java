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
package org.igrouppurchase.common.config;

import org.igrouppurchase.common.compete.resource.IResourceStrategy;
import org.igrouppurchase.common.compete.resource.impl.manager.ResourceStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置.
 *
 * @author yuzhanchao
 * @date 2021/7/26 17:36
 */
@Configuration
public class AutoConfig {

    /**
     * resource strategy.
     * @return resource strategy.
     */
    @Bean
    public IResourceStrategy resourceStrategy() {
        ResourceStrategy.Config config = new ResourceStrategy.Config();
        configResourceStrategy(config);

        return new ResourceStrategy(config);
    }

    /**
     * configResourceStrategy.
     * @param config config.
     */
    protected void configResourceStrategy(ResourceStrategy.Config config) {
        // TODO.
    }
}
