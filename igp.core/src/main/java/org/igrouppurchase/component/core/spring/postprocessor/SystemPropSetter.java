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
package org.igrouppurchase.component.core.spring.postprocessor;

import org.igrouppurchase.component.core.util.PropertyUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * init system property.
 *
 * @author yuzhanchao
 * @date 2021/7/10 12:04
 */
public class SystemPropSetter implements EnvironmentPostProcessor {

    @Override public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        setSystemProp(environment);
    }

    private void setSystemProp(ConfigurableEnvironment evn) {
        PropertyUtils.setEnvironment(evn);
    }

}
