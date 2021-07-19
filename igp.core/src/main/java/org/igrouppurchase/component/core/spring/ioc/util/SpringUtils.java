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
package org.igrouppurchase.component.core.spring.ioc.util;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.domain.EntityScanPackages;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * SpringUtil.
 *
 * {@author yuzhanchao}
 * {@date 2021/7/8 22:02}
 */
public final class SpringUtils {

    /**
     * spring applicationcontext.
     */
    private static ApplicationContext applicationContext;

    /**
     * Gets the value of applicationContext.
     *
     * @return the value of applicationContext
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * Sets the applicationContext.
     *
     * <p>You can use getApplicationContext() to get the value of applicationContext</p>
     *
     * @param applicationContext applicationContext
     */
    public static void setApplicationContext(ApplicationContext applicationContext) {
        SpringUtils.applicationContext = applicationContext;
    }

    /**
     * get spring bean by name.
     * @param beanName bean name.
     * @return bean instance.
     */
    public static Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    /**
     * get spring bean by class.
     * @param clz bean class
     * @param <T> bean type.
     * @return bean instance.
     */
    public static <T> T getBean(Class<T> clz) {
        return applicationContext.getBean(clz);
    }

    /**
     * register bean.
     * @param name bean name.
     * @param clz bean impl.
     */
    public static void registerBean(String name, Class<?> clz) {
        ConfigurableApplicationContext ac = (ConfigurableApplicationContext)applicationContext;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) ac.getBeanFactory();
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(clz);
        beanFactory.registerBeanDefinition(name, beanDefinitionBuilder.getRawBeanDefinition());
    }

    /**
     * unregister Bean.
     * @param name bean name.
     */
    public static void unregisterBean(String name) {
        ConfigurableApplicationContext ac = (ConfigurableApplicationContext)applicationContext;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) ac.getBeanFactory();
        beanFactory.removeBeanDefinition(name);
    }

    /**
     * get spring scan paths;
     * @return packages.
     */
    public static String[] getPackagesToScan() {
        ConfigurableApplicationContext ac = (ConfigurableApplicationContext)applicationContext;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) ac.getBeanFactory();
        List<String> packages = EntityScanPackages.get(beanFactory).getPackageNames();
        if (packages.isEmpty() && AutoConfigurationPackages.has(beanFactory)) {
            packages = AutoConfigurationPackages.get(beanFactory);
        }

        return StringUtils.toStringArray(packages);
    }
}
