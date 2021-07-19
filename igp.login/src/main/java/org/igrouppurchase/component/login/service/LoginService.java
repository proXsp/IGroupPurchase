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
package org.igrouppurchase.component.login.service;

import org.igrouppurchase.component.base.rest.Response;
import org.igrouppurchase.component.login.domain.ILoginContext;
import org.igrouppurchase.component.login.entity.dto.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Login Service.
 *
 * @author yuzhanchao
 * @date 2021/7/19 18:09
 */
@RestController
public class LoginService {

    /**
     * loginContext.
     */
    @Autowired
    private ILoginContext loginContext;

    @PostMapping("/login")
    public Response<String> login(@RequestBody LoginDTO loginDTO) {
        return loginContext.login(loginDTO);
    }
}
