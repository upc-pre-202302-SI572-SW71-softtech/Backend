package com.softtech.backendapi.iam.domain.services;

import com.softtech.backendapi.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}
