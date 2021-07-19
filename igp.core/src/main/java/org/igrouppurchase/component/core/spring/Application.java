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
package org.igrouppurchase.component.core.spring;

import org.igrouppurchase.component.core.spring.ioc.util.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Application Runner.
 *
 * @author yuzhanchao
 * @date 2021/7/8 22:06
 */
public class Application {

    /**
     * run spring boot application.
     * @param primarySource primary source.
     * @param args arguments.
     * @return application context.
     */
    public static ConfigurableApplicationContext run(Class<?> primarySource, String... args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(primarySource, args);
        SpringUtils.setApplicationContext(applicationContext);
        return applicationContext;
    }
}
