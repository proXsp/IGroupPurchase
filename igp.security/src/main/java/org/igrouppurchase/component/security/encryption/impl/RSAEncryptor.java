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
package org.igrouppurchase.component.security.encryption.impl;

import org.apache.commons.codec.binary.Base64;
import org.igrouppurchase.component.base.log.ILog;
import org.igrouppurchase.component.base.log.LoggerFactory;
import org.igrouppurchase.component.security.encryption.IEncryptor;
import org.igrouppurchase.component.security.encryption.Secret;
import org.igrouppurchase.component.security.encryption.exception.EncryptionException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/**
 * RSA.
 *
 * @author yuzhanchao
 * @date 2021/7/19 11:40
 */
class RSAEncryptor implements IEncryptor {

    /**
     * Log.
     */
    private ILog LOG = LoggerFactory.getLog(RSAEncryptor.class);

    /**
     * byte encode.
     */
    private static final String ENCODE = "UTF-8";

    @Override
    public String encryption(final Secret secret) {
        String publicKey = secret.getKey();
        String content = secret.getContent();
        String result;

        //base64编码的公钥
        byte[] decoded = Base64.decodeBase64(publicKey);
        RSAPublicKey pubKey;
        try {
            pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
            Cipher cipher = Cipher.getInstance("RSA");
            cipher.init(Cipher.ENCRYPT_MODE, pubKey);

            result = Base64.encodeBase64String(cipher.doFinal(content.getBytes(ENCODE)));
        } catch (InvalidKeySpecException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | UnsupportedEncodingException | IllegalBlockSizeException | BadPaddingException e) {
            if (LOG.isErrorEnabled()) {
                LOG.error("encryption exception is：", e);
            }
            throw new EncryptionException();
        }

        return result;
    }

    @Override
    public String decrypt(final Secret secret) {
        return null;
    }
}
