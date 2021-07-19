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
package org.igrouppurchase.component.core.entity.transfer;

import org.igrouppurchase.component.core.entity.model.IModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * AbstractDomainModelTransfer.
 *
 * @author yuzhanchao
 * @date 2021/7/19 21:22
 */
public abstract class AbstractDomainModelTransfer<P extends IModel, D extends IModel> {

    public abstract Optional<D> toDo(P po);

    public Optional<List<D>> toDoList(List<P> poList) {
        if (poList == null) {
            return Optional.empty();
        }
        List<D> doList = new ArrayList<>();
        poList.forEach(po-> toDo(po).map(doList::add));
        return Optional.of(doList);
    }
}
