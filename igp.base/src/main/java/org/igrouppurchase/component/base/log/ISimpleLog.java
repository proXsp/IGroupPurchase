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

/**
 * Simple Log Interface.
 *
 * @author yuzhanchao
 * @date 2021/7/8 22:59
 */
public interface ISimpleLog {

    void error(StringGetter getMessager);

    void error(Getter<Throwable> getter);

    void warn(StringGetter getMessager);

    void info(StringGetter getMessager);

    void debug(StringGetter getMessager);
}
