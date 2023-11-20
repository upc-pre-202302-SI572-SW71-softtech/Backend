package com.softtech.backendapi.iam.interfaces.rest.transform;

import com.softtech.backendapi.iam.domain.model.aggregates.User;
import com.softtech.backendapi.iam.interfaces.rest.resources.AuthenticatedUserResource;

public class AuthenticatedUserResourceFromEntityAssembler {
    public static AuthenticatedUserResource toResourceFromEntity(User user, String token) {
        return new AuthenticatedUserResource(user.getId(), user.getUsername(), token);
    }
}
