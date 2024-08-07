/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.email.mgt.cache;

import java.io.Serializable;
import java.util.Objects;

/**
 * This class represent cache key for {@link OrgNotificationTemplateCache}.
 */
public class OrgNotificationTemplateCacheKey implements Serializable {

    private String locale;
    private String templateType;
    private String channelName;

    public OrgNotificationTemplateCacheKey(String locale, String templateType, String channelName) {
        this.locale = locale;
        this.templateType = templateType.toLowerCase();
        this.channelName = channelName;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgNotificationTemplateCacheKey key = (OrgNotificationTemplateCacheKey) o;
        return Objects.equals(locale, key.locale) && Objects.equals(templateType, key.templateType) &&
                Objects.equals(channelName, key.channelName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(locale, templateType, channelName);
    }
}
