package com.softtech.backendapi.iam.domain.model.queries;

import com.softtech.backendapi.iam.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery(Roles name) {
}
