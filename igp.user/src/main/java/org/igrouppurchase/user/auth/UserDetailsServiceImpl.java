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
package org.igrouppurchase.user.auth;

import org.igrouppurchase.user.domain.dao.UserDao;
import org.igrouppurchase.user.domain.entity.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Optional;

/**
 * UserDetailsService Impl.
 *
 * @author yuzhanchao
 * @date 2021/7/19 22:09
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    /**
     * user domain.
     */
    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userDao.findById(username);
        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException(username);
        }

        User user = userOptional.get();

        return new UserDetails() {
            @Override public String getPassword() {
                return user.getPassWord();
            }

            @Override public String getUsername() {
                return user.getId();
            }

            @Override public Collection<? extends GrantedAuthority> getAuthorities() {
                // TODO.
                return null;
            }

            @Override public boolean isAccountNonExpired() {
                // TODO.
                return false;
            }

            @Override public boolean isAccountNonLocked() {
                // TODO.
                return false;
            }

            @Override public boolean isCredentialsNonExpired() {
                // TODO.
                return false;
            }

            @Override public boolean isEnabled() {
                // TODO.
                return false;
            }
        };
    }
}
