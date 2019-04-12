package com.mm.connectedworkflow;

import java.util.List;

import org.kie.api.task.UserGroupCallback;
import org.kie.internal.identity.IdentityProvider;

/**
 * This implementation mimics {@link JAASUserGroupCallbackImpl} that is used on JEE application servers.
 * This one is instead based on spring security and provides exact same features.
 *
 */
public class SpringSecurityUserGroupCallback implements UserGroupCallback {

    private IdentityProvider identityProvider;   
    
    public SpringSecurityUserGroupCallback(IdentityProvider identityProvider) {
        this.identityProvider = identityProvider;
    }

    @Override
    public boolean existsUser(String userId) {
        return true;
    }

    @Override
    public boolean existsGroup(String groupId) {
        return true;
    }

    @Override
    public List<String> getGroupsForUser(String userId) {
        return identityProvider.getRoles();
    }

}