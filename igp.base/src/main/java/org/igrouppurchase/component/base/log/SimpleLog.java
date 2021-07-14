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

import org.igrouppurchase.component.base.function.Getter;
import org.igrouppurchase.component.base.function.StringGetter;

import java.util.function.Consumer;

/**
 * SimpleLog.
 *
 * @author yuzhanchao
 * @date 2021/7/8 22:59
 */
public final class SimpleLog implements  ISimpleLog {

    /**
     * log.
     */
    private ILog log;

    private static final String DEFAULT_ERROR_MESSAGE = "error occurred: ";

    /**
     * simple log.
     * @param log
     */
    public SimpleLog(ILog log) {
        this.log = log;
    }

    /**
     * error.
     * @param getMessager
     */
    @Override
    public void error(StringGetter getMessager) {
        if (this.log.isErrorEnabled()) {
            this.log.error(getMessager.get());
        }
    }

    /**
     * error.
     * @param getter
     */
    @Override
    public void error(Getter<Throwable> getter) {
        if (this.log.isErrorEnabled()) {
            this.log.error(DEFAULT_ERROR_MESSAGE, getter.get());
        }
    }

    /**
     * warn.
     * @param getMessager
     */
    @Override
    public void warn(StringGetter getMessager) {
        if (this.log.isWarnEnabled()) {
            this.log.warn(getMessager.get());
        }
    }

    /**
     * info.
     * @param getMessager
     */
    @Override
    public void info(StringGetter getMessager) {
        if (this.log.isInfoEnabled()) {
            this.log.info(getMessager.get());
        }
    }

    /**
     * debug.
     * @param getMessager
     */
    @Override
    public void debug(StringGetter getMessager) {
        if (this.log.isDebugEnabled()) {
            this.log.debug(getMessager.get());
        }
    }

}
