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
package org.igrouppurchase.component.security.encryption;

import org.igrouppurchase.component.security.encryption.exception.UnsupportedEncryptionType;
import org.igrouppurchase.component.security.encryption.impl.EncryptionEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * EncryptionBuilder.
 *
 * @author yuzhanchao
 * @date 2021/7/19 11:40
 */
public final class EncryptionBuilder {

    /**
     * builder option.
     */
    private static Map<String, Object> option = new HashMap<>();

    /**
     * key of encryption type in option.
     */
    private static final String ENCRYPTION_TYPE = "ENCRYPTION_TYPE";

    /**
     * set encryption type.
     * @param encryptionType encryption type.
     */
    public static void setType(EncryptionEnum encryptionType) {
        option.put(ENCRYPTION_TYPE, encryptionType);
    }

    /**
     * build encryptor.
     * @return encryptor.
     */
    public static IEncryptor bulid() {
        EncryptionEnum encryptionType = (EncryptionEnum)option.get(ENCRYPTION_TYPE);
        if (encryptionType == null) {
            throw new UnsupportedEncryptionType();
        }
        return encryptionType.getEncryptor();
    }
}
