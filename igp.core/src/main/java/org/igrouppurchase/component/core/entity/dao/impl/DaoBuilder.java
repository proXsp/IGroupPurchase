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
package org.igrouppurchase.component.core.entity.dao.impl;

import org.igrouppurchase.component.base.log.ISimpleLog;
import org.igrouppurchase.component.base.log.LoggerFactory;
import org.igrouppurchase.component.core.entity.dao.IDao;
import org.igrouppurchase.component.core.entity.dao.ISimpleDao;
import org.igrouppurchase.component.core.entity.dao.exception.NullDaoImplException;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DAO Builder.
 *
 * @author yuzhanchao
 * @date 2021/7/9 9:01
 */
public class DaoBuilder {

    /**
     * entity manager.
     */
    private static EntityManager entityManager;

    /**
     * LOG.
     */
    private static ISimpleLog LOG = LoggerFactory.getSimpleLog(DaoBuilder.class);

    /**
     * CACHE.
     */
    private static final Map<String, IDao> SINGLETON = new ConcurrentHashMap<String, IDao>();

    /**
     * Sets the entityManager.
     *
     * @param entityManager entityManager
     */
    public static void setEntityManager(EntityManager entityManager) {
        DaoBuilder.entityManager = entityManager;
    }

    /**
     * Get Cache Dao.
     * @param entityName
     * @return
     */
    private static IDao getCacheDao(String entityName) {
        return SINGLETON.get(entityName);
    }

    /**
     *
     * @param entityName
     * @param clz
     * @param <T>
     * @return
     */
    public static <T> ISimpleDao<T> buildSimpleDao(String entityName, Class<T> clz) {
        Assert.notNull(clz, "Entity Class Must Not Be Null.");
        IDao dao = getCacheDao(entityName);
        if (dao == null) {
            synchronized (entityName) {
                dao = getCacheDao(entityName);
                if (dao == null) {
                    // do create when still null.
                    try {
                        dao = craeteProxyDao(SimpleDao.class.getConstructor(Class.class, EntityManager.class), clz,
                            entityManager);
                        SINGLETON.put(entityName, dao);
                    } catch (NoSuchMethodException e) {
                        LOG.error(() -> {return e;});
                    }
                }
            }
        }

        return (ISimpleDao)dao;
    }

    /**
     *
     * @param constructor
     * @param args
     * @param <T>
     * @return
     */
    private static <T> T craeteProxyDao(Constructor<T> constructor, Object...args) {
        T impl = BeanUtils.instantiateClass(constructor, args);

        if (impl == null) {
            throw new NullDaoImplException();
        }

        return impl;
    }
}
