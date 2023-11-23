package com.softtech.backendapi.iam.interfaces.rest.transform;

import com.softtech.backendapi.iam.domain.model.entities.Role;
import com.softtech.backendapi.iam.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toResourceFromEntity(Role role) {
        return new RoleResource(role.getId(), role.getStringName());
    }
}
