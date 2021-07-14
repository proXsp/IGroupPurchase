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
package org.igrouppurchase.component.core.spring.aware;

import org.igrouppurchase.component.base.log.ISimpleLog;
import org.igrouppurchase.component.base.log.LoggerFactory;
import org.igrouppurchase.component.core.spring.ioc.utils.SpringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * TODO.
 *
 * @author yuzhanchao
 * @date 2021/7/8 22:14
 */
@Component
public class ApplicationContextRegister implements ApplicationContextAware {

    /**
     * log.
     */
    private final ISimpleLog log = LoggerFactory.getSimpleLog(ApplicationContextRegister.class);

    /**
     *setApplicationContext.
     * @param applicationContext
     * @throws BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info(() -> {
            return "Set applicationcontext.";
        });
        SpringUtils.setApplicationContext(applicationContext);
    }
}
