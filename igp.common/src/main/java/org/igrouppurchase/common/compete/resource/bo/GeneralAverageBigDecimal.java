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
package org.igrouppurchase.common.compete.resource.bo;

import java.math.BigDecimal;

/**
 * 通用大小数平均分配.
 *
 * @author yuzhanchao
 * @date 2021/7/26 16:30
 */
public class GeneralAverageBigDecimal extends BaseResource<String, BigDecimal> {

    /**
     * serial version.
     */
    private static final long serialVersionUID = 4045952825499011965L;

    /**
     * all of copies.
     */
    private BigDecimal[] allCopies;

    /**
     * Gets the value of allCopies.
     *
     * @return the value of allCopies
     */
    public BigDecimal[] getAllCopies() {
        return allCopies;
    }

    /**
     * Sets the allCopies.
     *
     * <p>You can use getAllCopies() to get the value of allCopies</p>
     *
     * @param allCopies allCopies
     */
    public void setAllCopies(BigDecimal[] allCopies) {
        this.allCopies = allCopies;
    }
}
