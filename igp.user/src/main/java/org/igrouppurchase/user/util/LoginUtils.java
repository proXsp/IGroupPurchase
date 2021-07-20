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
package org.igrouppurchase.user.util;

import org.apache.commons.lang3.StringUtils;
import org.igrouppurchase.component.login.entity.dto.LoginDTO;
import org.igrouppurchase.user.constant.AuthConstant;

import javax.servlet.http.HttpServletRequest;

/**
 * LoginUtils.
 *
 * @author yuzhanchao
 * @date 2021/7/20 16:02
 */
public final class LoginUtils {

    /**
     * check is empty of login transfer object.
     * @param loginDTO login transfer object.
     * @return is data empty.
     */
    public static boolean isEmptyLoginDTO(final LoginDTO loginDTO) {
        return loginDTO == null || StringUtils.isAnyBlank(loginDTO.getUserName(), loginDTO.getPassword());
    }

    /**
     * resolve request token id.
     * @param request request.
     * @return token.
     */
    public static String resolveRequestTokenId(HttpServletRequest request) {
        String tokenId = request.getHeader(AuthConstant.HEAD_TOKEN_KEY);
        if (StringUtils.isBlank(tokenId)) {
            tokenId = request.getParameter(AuthConstant.PARAMETER_TOKEN_KEY);
        }
        return tokenId;
    }
}
