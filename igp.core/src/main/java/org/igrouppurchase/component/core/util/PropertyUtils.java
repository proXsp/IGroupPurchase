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
package org.igrouppurchase.component.core.util;

import org.springframework.core.env.Environment;

/**
 * util for application property.
 *
 * @author yuzhanchao
 * @date 2021/7/10 21:58
 */
public final class PropertyUtils {

    /**
     * spring enviroment.
     * see {@link Environment}
     */
    private static Environment environment;

    /**
     * set environment.
     * @param environment environment.
     */
    public static void setEnvironment(Environment environment) {
        PropertyUtils.environment = environment;
    }

    /**
     * 获取配置属性.
     * @param name 属性名称.
     * @return 属性值.
     */
    public static String getProperty(String name) {
        String value = System.getProperty(name);
        if (value == null) {
            value = environment.getProperty(name);
        }
        return value;
    }

}
