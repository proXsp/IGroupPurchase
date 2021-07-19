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
package org.igrouppurchase.component.login.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * token authentication.
 *
 * @author yuzhanchao
 * @date 2021/7/19 16:05
 */
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override protected void doFilterInternal(HttpServletRequest httpServletRequest,
        javax.servlet.http.HttpServletResponse httpServletResponse, javax.servlet.FilterChain filterChain)
        throws ServletException, IOException {

    }
}
