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

/**
 * Confidential Object To Encryption Or Decrypt.
 *
 * @author yuzhanchao
 * @date 2021/7/19 11:33
 */
public class Secret {

    /**
     * content to be encryption or decrypt.
     */
    private String content;

    /**
     * key.
     */
    private String key;

    /**
     * Gets the value of content.
     *
     * @return the value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the content.
     *
     * <p>You can use getContent() to get the value of content</p>
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Gets the value of key.
     *
     * @return the value of key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * <p>You can use getKey() to get the value of key</p>
     *
     * @param key key
     */
    public void setKey(String key) {
        this.key = key;
    }
}
