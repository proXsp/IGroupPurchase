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
package org.igrouppurchase.component.base.log;

import org.slf4j.Logger;

/**
 * LoggerFactory.
 *
 * @author yuzhanchao
 * @date 2021/7/8 22:38
 */
public class LoggerFactory {

    /**
     * get logger impl.
     * @param name
     * @return
     */
    public static ILog getLog(String name) {
        Logger log = org.slf4j.LoggerFactory.getLogger(name);
        return new Log(log);
    }

    /**
     * get logger impl.
     * @param clz
     * @return
     */
    public static ILog getLog(Class<?> clz) {
        Logger log = org.slf4j.LoggerFactory.getLogger(clz);
        return new Log(log);
    }

    /**
     * get simple logger impl.
     * @param name
     * @return
     */
    public static ISimpleLog getSimpleLog(String name) {
        ILog log = getLog(name);
        return new SimpleLog(log);
    }

    /**
     * get simple logger impl.
     * @param clz
     * @return
     */
    public static ISimpleLog getSimpleLog(Class<?> clz) {
        ILog log = getLog(clz);
        return new SimpleLog(log);
    }
}
