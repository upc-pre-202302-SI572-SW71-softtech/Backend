package com.softtech.backendapi.iam.application.internal.commandservices;

import com.softtech.backendapi.iam.domain.model.commands.SeedRolesCommand;
import com.softtech.backendapi.iam.domain.model.entities.Role;
import com.softtech.backendapi.iam.domain.model.valueobjects.Roles;
import com.softtech.backendapi.iam.domain.services.RoleCommandService;
import com.softtech.backendapi.iam.infrastructure.persistence.jpa.repositories.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class RoleCommandServiceImpl implements RoleCommandService {
    private final RoleRepository roleRepository;
    @Override
    public void handle(SeedRolesCommand command) {
        Arrays.stream(Roles.values()).forEach(role -> {
            if(!roleRepository.existsByName(role)) {
                roleRepository.save(new Role(Roles.valueOf(role.name())));
            }
        });
    }
}
