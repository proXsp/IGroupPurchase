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
package org.igrouppurchase.component.core.spring.initializer;

import org.igrouppurchase.component.base.log.ISimpleLog;
import org.igrouppurchase.component.base.log.LoggerFactory;
import org.igrouppurchase.component.core.entity.annotation.GEntity;
import org.igrouppurchase.component.core.entity.model.IModel;
import org.igrouppurchase.component.core.spring.ioc.utils.SpringUtils;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.MessageFormat;

/**
 * scan entity class.
 *
 * @author yuzhanchao
 * @date 2021/7/10 23:16
 */
@Component
public class EntityClassInitializer implements ResourceLoaderAware {

    private ISimpleLog LOG = LoggerFactory.getSimpleLog(EntityClassInitializer.class);

    private ResourceLoader resourceLoader;

    @Override public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    private String[] getScanPackages() {
        return SpringUtils.getPackagesToScan();
    }

    /**
     * 扫描模型.
     */
    private void scanModel() throws IOException, ClassNotFoundException {
        LOG.info(()->{
            return "Start initialize Entity Class.";
        });
        ClassLoader classLoader = EntityClassInitializer.class.getClassLoader();
        ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(resourceLoader);
        MetadataReaderFactory metaReader = new CachingMetadataReaderFactory(resourceLoader);

        String[] scanPackages = getScanPackages();
        for (String scanPackage : scanPackages) {
            LOG.debug(()->{
               return MessageFormat.format("Scanning path：{0} to initialize.", scanPackage);
            });

            Resource[] resources = resolver.getResources(scanPackage);

            for (Resource resource : resources) {
                MetadataReader reader = metaReader.getMetadataReader(resource);
                String className = reader.getClassMetadata().getClassName();
                Class<?> clz = classLoader.loadClass(className);
                if (!IModel.class.isAssignableFrom(clz)) {
                    continue;
               }
                GEntity domainEntity = clz.getAnnotation(GEntity.class);
                if (domainEntity == null) {
                    continue;
                }


            }
        }

        LOG.info(()->{
            return "End scan EntityModel.";
        });
    }
}
