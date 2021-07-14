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
import org.slf4j.Marker;

/**
 * ILog.
 *
 * @author yuzhanchao
 * @date 2021/7/8 22:37
 */
public interface ILog {

    String ROOT_LOGGER_NAME = "ROOT";

    String getName();

    boolean isTraceEnabled();

    void trace(String var1);

    void trace(String var1, Object var2);

    void trace(String var1, Object var2, Object var3);

    void trace(String var1, Object... var2);

    void trace(String var1, Throwable var2);

    boolean isTraceEnabled(Marker var1);

    void trace(Marker var1, String var2);

    void trace(Marker var1, String var2, Object var3);

    void trace(Marker var1, String var2, Object var3, Object var4);

    void trace(Marker var1, String var2, Object... var3);

    void trace(Marker var1, String var2, Throwable var3);

    boolean isDebugEnabled();

    void debug(String var1);

    void debug(String var1, Object var2);

    void debug(String var1, Object var2, Object var3);

    void debug(String var1, Object... var2);

    void debug(String var1, Throwable var2);

    boolean isDebugEnabled(Marker var1);

    void debug(Marker var1, String var2);

    void debug(Marker var1, String var2, Object var3);

    void debug(Marker var1, String var2, Object var3, Object var4);

    void debug(Marker var1, String var2, Object... var3);

    void debug(Marker var1, String var2, Throwable var3);

    boolean isInfoEnabled();

    void info(String var1);

    void info(String var1, Object var2);

    void info(String var1, Object var2, Object var3);

    void info(String var1, Object... var2);

    void info(String var1, Throwable var2);

    boolean isInfoEnabled(Marker var1);

    void info(Marker var1, String var2);

    void info(Marker var1, String var2, Object var3);

    void info(Marker var1, String var2, Object var3, Object var4);

    void info(Marker var1, String var2, Object... var3);

    void info(Marker var1, String var2, Throwable var3);

    boolean isWarnEnabled();

    void warn(String var1);

    void warn(String var1, Object var2);

    void warn(String var1, Object... var2);

    void warn(String var1, Object var2, Object var3);

    void warn(String var1, Throwable var2);

    boolean isWarnEnabled(Marker var1);

    void warn(Marker var1, String var2);

    void warn(Marker var1, String var2, Object var3);

    void warn(Marker var1, String var2, Object var3, Object var4);

    void warn(Marker var1, String var2, Object... var3);

    void warn(Marker var1, String var2, Throwable var3);

    boolean isErrorEnabled();

    void error(String var1);

    void error(String var1, Object var2);

    void error(String var1, Object var2, Object var3);

    void error(String var1, Object... var2);

    void error(String var1, Throwable var2);

    boolean isErrorEnabled(Marker var1);

    void error(Marker var1, String var2);

    void error(Marker var1, String var2, Object var3);

    void error(Marker var1, String var2, Object var3, Object var4);

    void error(Marker var1, String var2, Object... var3);

    void error(Marker var1, String var2, Throwable var3);

}
