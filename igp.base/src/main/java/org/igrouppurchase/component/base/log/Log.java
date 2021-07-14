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
 * Log Impl.
 *
 * @author yuzhanchao
 * @date 2021/7/8 23:29
 */
public class Log implements ILog {

    private Logger logger;

    public Log(Logger logger) {
        this.logger = logger;
    }

    @Override public String getName() {
        return this.logger.getName();
    }

    @Override public boolean isTraceEnabled() {
        return this.logger.isTraceEnabled();
    }

    @Override public void trace(String s) {
        this.logger.trace(s);
    }

    @Override public void trace(String s, Object o) {
        this.logger.trace(s, o);
    }

    @Override public void trace(String s, Object o, Object o1) {
        this.logger.trace(s, o, o1);
    }

    @Override public void trace(String s, Object... objects) {
        this.logger.trace(s, objects);
    }

    @Override public void trace(String s, Throwable throwable) {
        this.logger.trace(s, throwable);
    }

    @Override public boolean isTraceEnabled(Marker marker) {
        return this.logger.isTraceEnabled();
    }

    @Override public void trace(Marker marker, String s) {
        this.logger.trace(marker, s);
    }

    @Override public void trace(Marker marker, String s, Object o) {
        this.logger.trace(marker, s, o);
    }

    @Override public void trace(Marker marker, String s, Object o, Object o1) {
        this.logger.trace(marker, s, o, o1);
    }

    @Override public void trace(Marker marker, String s, Object... objects) {
        this.logger.trace(marker, s, objects);
    }

    @Override public void trace(Marker marker, String s, Throwable throwable) {
        this.logger.trace(marker, s, throwable);
    }

    @Override public boolean isDebugEnabled() {
        return this.logger.isDebugEnabled();
    }

    @Override public void debug(String s) {
        this.logger.debug(s);
    }

    @Override public void debug(String s, Object o) {
        this.logger.debug(s, o);
    }

    @Override public void debug(String s, Object o, Object o1) {
        this.logger.debug(s, o, o1);
    }

    @Override public void debug(String s, Object... objects) {
        this.logger.debug(s, objects);
    }

    @Override public void debug(String s, Throwable throwable) {
        this.logger.debug(s, throwable);
    }

    @Override public boolean isDebugEnabled(Marker marker) {
        return this.logger.isDebugEnabled();
    }

    @Override public void debug(Marker marker, String s) {
        this.logger.debug(marker, s);
    }

    @Override public void debug(Marker marker, String s, Object o) {
        this.logger.debug(marker, s, o);
    }

    @Override public void debug(Marker marker, String s, Object o, Object o1) {
        this.logger.debug(marker, s, o, o1);
    }

    @Override public void debug(Marker marker, String s, Object... objects) {
        this.logger.debug(marker, s, objects);
    }

    @Override public void debug(Marker marker, String s, Throwable throwable) {
        this.logger.debug(marker, s, throwable);
    }

    @Override public boolean isInfoEnabled() {
        return this.logger.isInfoEnabled();
    }

    @Override public void info(String s) {
        this.logger.info(s);
    }

    @Override public void info(String s, Object o) {
        this.logger.info(s, o);
    }

    @Override public void info(String s, Object o, Object o1) {
        this.logger.info(s, o, o1);
    }

    @Override public void info(String s, Object... objects) {
        this.logger.info(s, objects);
    }

    @Override public void info(String s, Throwable throwable) {
        this.logger.info(s, throwable);
    }

    @Override public boolean isInfoEnabled(Marker marker) {
        return this.logger.isInfoEnabled(marker);
    }

    @Override public void info(Marker marker, String s) {
        this.logger.info(marker, s);
    }

    @Override public void info(Marker marker, String s, Object o) {
        this.logger.info(marker, s, o);
    }

    @Override public void info(Marker marker, String s, Object o, Object o1) {
        this.logger.info(marker, s, o, o1);
    }

    @Override public void info(Marker marker, String s, Object... objects) {
        this.logger.info(marker, s, objects);
    }

    @Override public void info(Marker marker, String s, Throwable throwable) {
        this.logger.info(marker, s, throwable);
    }

    @Override public boolean isWarnEnabled() {
        return this.logger.isWarnEnabled();
    }

    @Override public void warn(String s) {
        this.logger.warn(s);
    }

    @Override public void warn(String s, Object o) {
        this.logger.warn(s, o);
    }

    @Override public void warn(String s, Object... objects) {
        this.logger.warn(s, objects);
    }

    @Override public void warn(String s, Object o, Object o1) {
        this.logger.warn(s, o, o1);
    }

    @Override public void warn(String s, Throwable throwable) {
        this.logger.warn(s, throwable);
    }

    @Override public boolean isWarnEnabled(Marker marker) {
        return this.logger.isWarnEnabled(marker);
    }

    @Override public void warn(Marker marker, String s) {
        this.logger.warn(marker, s);
    }

    @Override public void warn(Marker marker, String s, Object o) {
        this.logger.warn(marker, s, o);
    }

    @Override public void warn(Marker marker, String s, Object o, Object o1) {
        this.logger.warn(marker, s, o, o1);
    }

    @Override public void warn(Marker marker, String s, Object... objects) {
        this.logger.warn(marker, s, objects);
    }

    @Override public void warn(Marker marker, String s, Throwable throwable) {
        this.logger.warn(marker, s, throwable);
    }

    @Override public boolean isErrorEnabled() {
        return this.logger.isErrorEnabled();
    }

    @Override public void error(String s) {
        this.logger.error(s);
    }

    @Override public void error(String s, Object o) {
        this.logger.error(s, o);
    }

    @Override public void error(String s, Object o, Object o1) {
        this.logger.error(s, o, o1);
    }

    @Override public void error(String s, Object... objects) {
        this.logger.error(s, objects);
    }

    @Override public void error(String s, Throwable throwable) {
        this.logger.error(s, throwable);
    }

    @Override public boolean isErrorEnabled(Marker marker) {
        return this.logger.isErrorEnabled(marker);
    }

    @Override public void error(Marker marker, String s) {
        this.logger.error(marker, s);
    }

    @Override public void error(Marker marker, String s, Object o) {
        this.logger.error(marker, s, o);
    }

    @Override public void error(Marker marker, String s, Object o, Object o1) {
        this.logger.error(marker, s, o, o1);
    }

    @Override public void error(Marker marker, String s, Object... objects) {
        this.logger.error(marker, s, objects);
    }

    @Override public void error(Marker marker, String s, Throwable throwable) {
        this.logger.error(marker, s, throwable);
    }
}
