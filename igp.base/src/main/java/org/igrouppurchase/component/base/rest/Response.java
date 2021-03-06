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
package org.igrouppurchase.component.base.rest;

import org.igrouppurchase.component.base.rest.constant.ResponseCode;

import java.io.Serializable;

/**
 * response.
 *
 * @author yuzhanchao
 * @date 2021/7/19 18:14
 */
public class Response<T> implements Serializable {

    /**
     * code.
     */
    private Integer code;

    /**
     * message.
     */
    private String message;

    /**
     * data.
     */
    private T data;

    /**
     * Gets the value of code.
     *
     * @return the value of code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * <p>You can use getCode() to get the value of code</p>
     *
     * @param code code
     * @return Response<T> this.
     */
    public Response<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * Gets the value of message.
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     *
     * <p>You can use getMessage() to get the value of message</p>
     *
     * @param message message
     * @return Response<T> this.
     */
    public Response<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Gets the value of data.
     *
     * @return the value of data
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * <p>You can use getData() to get the value of data</p>
     *
     * @param data data
     * @return Response<T> this.
     */
    public Response<T> setData(T data) {
        this.data = data;
        return this;
    }

    /**
     * of .
     * @param data response data.
     * @param <T> Type.
     * @return response.
     */
    public static <T> Response<T> of (T data) {
        Response<T> response = new Response<>();
        response.setData(data);
        response.setCode(ResponseCode.DEFAULT);
        return response;
    }
}
