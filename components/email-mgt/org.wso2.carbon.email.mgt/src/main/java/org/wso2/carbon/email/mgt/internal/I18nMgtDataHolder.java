/*
 * Copyright (c) 2016-2024, WSO2 LLC. (http://www.wso2.com).
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

package org.wso2.carbon.email.mgt.internal;

import org.wso2.carbon.identity.governance.model.NotificationTemplate;
import org.wso2.carbon.identity.organization.management.application.OrgApplicationManager;
import org.wso2.carbon.identity.organization.management.service.OrganizationManager;
import org.wso2.carbon.light.registry.mgt.service.LightRegistryMgtService;
import org.wso2.carbon.registry.core.service.RegistryService;
import org.wso2.carbon.user.core.service.RealmService;

import java.util.ArrayList;
import java.util.List;

public class I18nMgtDataHolder{
    private RealmService realmService;
    private RegistryService registryService;
    private LightRegistryMgtService registryResourceMgtService;
    private OrganizationManager organizationManager;
    private OrgApplicationManager sharedAppManager;
    private List<NotificationTemplate> defaultEmailTemplates = new ArrayList<>();
    private List<NotificationTemplate> defaultSMSTemplates = new ArrayList<>();

    private static I18nMgtDataHolder instance = new I18nMgtDataHolder();

    private I18nMgtDataHolder() {
    }

    public static I18nMgtDataHolder getInstance() {
        return instance;
    }

    public RealmService getRealmService() {
        if (realmService == null) {
            throw new RuntimeException("Realm Service has not been set. Component has not initialized properly.");
        }
        return realmService;
    }

    public void setRealmService(RealmService realmService) {
        this.realmService = realmService;
    }

    public RegistryService getRegistryService() {
        if (registryService == null) {
            throw new RuntimeException("Registry Service has not been set. Component has not initialized properly.");
        }
        return registryService;
    }

    public void setRegistryService(RegistryService registryService) {
        this.registryService = registryService;
    }

    public LightRegistryMgtService getRegistryResourceMgtService() {
        if (registryResourceMgtService == null) {
            throw new RuntimeException("Registry Resource Mgt Service has not been set." +
                    "Component has not initialized properly.");
        }
        return registryResourceMgtService;
    }

    public void setRegistryResourceMgtService(LightRegistryMgtService registryResourceMgtService) {
        this.registryResourceMgtService = registryResourceMgtService;
    }

    public void setDefaultEmailTemplates(List<NotificationTemplate> defaultEmailTemplates) {

        this.defaultEmailTemplates = defaultEmailTemplates;
    }

    public List<NotificationTemplate> getDefaultEmailTemplates() {

        return defaultEmailTemplates;
    }

    public void setDefaultSMSTemplates(List<NotificationTemplate> defaultEmailTemplates) {

        this.defaultSMSTemplates = defaultEmailTemplates;
    }

    public List<NotificationTemplate> getDefaultSMSTemplates() {

        return defaultSMSTemplates;
    }

    /**
     * Set the organization manager.
     *
     * @param organizationManager Organization manager.
     */
    public void setOrganizationManager(OrganizationManager organizationManager) {

        this.organizationManager = organizationManager;
    }

    /**
     * Get the organization manager.
     *
     * @return Organization manager.
     */
    public OrganizationManager getOrganizationManager() {

        return organizationManager;
    }

    /**
     * Get the shared application manager.
     *
     * @return Shared application manager.
     */
    public OrgApplicationManager getSharedAppManager() {

        return sharedAppManager;
    }

    /**
     * Set the shared application manager.
     *
     * @param sharedAppManager Shared application manager.
     */
    public void setSharedAppManager(OrgApplicationManager sharedAppManager) {

        this.sharedAppManager = sharedAppManager;
    }
}
