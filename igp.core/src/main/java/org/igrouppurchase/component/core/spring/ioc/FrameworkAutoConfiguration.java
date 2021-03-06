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
package org.igrouppurchase.component.core.spring.ioc;

import org.igrouppurchase.component.core.entity.dao.impl.DaoBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Auto Configuration for components.
 *
 * {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration}
 * @author yuzhanchao
 * @date 2021/7/8 22:22
 */
@Configuration
@ComponentScan(basePackages = {"org.igrouppurchase.component.core.spring.aware",
    "org.igrouppurchase.component.core.spring.initializer",
    "org.igrouppurchase.**.config",
    "org.igrouppurchase.**.dao",
    "org.igrouppurchase.**.context",
    "org.igrouppurchase.**.service"})
public class FrameworkAutoConfiguration {

    /**
     * hold entitymanager.
     * @param entityManager entityManager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        DaoBuilder.setEntityManager(entityManager);
    }

}
