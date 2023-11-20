package com.softtech.backendapi.iam.domain.services;

import com.softtech.backendapi.iam.domain.model.entities.Role;
import com.softtech.backendapi.iam.domain.model.queries.GetAllRolesQuery;
import com.softtech.backendapi.iam.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
    List<Role> handle(GetAllRolesQuery query);
    Optional<Role> handle(GetRoleByNameQuery query);

}
