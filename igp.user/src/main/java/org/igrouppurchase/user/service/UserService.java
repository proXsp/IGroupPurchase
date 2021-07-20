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
package org.igrouppurchase.user.service;

import org.apache.commons.lang3.StringUtils;
import org.igrouppurchase.component.base.i18n.I18nMessage;
import org.igrouppurchase.component.base.rest.Response;
import org.igrouppurchase.user.context.IUserContext;
import org.igrouppurchase.user.domain.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserService.
 *
 * @author yuzhanchao
 * @date 2021/7/19 20:30
 */
@RestController
@RequestMapping("/user/")
public class UserService {

    /**
     * user context;
     */
    @Autowired
    private IUserContext userContext;

    @PostMapping("register")
    public Response<Boolean> register(@RequestBody User user) {
        if (user == null || StringUtils.isAnyBlank(user.getId(), user.getPassword())) {
            return Response.of(false).setMessage(I18nMessage.getMessage("Incomplete registration information."));
        }
        boolean success = userContext.register(user);
        if (!success) {
            return Response.of(false).setMessage(I18nMessage.getMessage("register fail."));
        }
        return Response.of(true);
    }

}
