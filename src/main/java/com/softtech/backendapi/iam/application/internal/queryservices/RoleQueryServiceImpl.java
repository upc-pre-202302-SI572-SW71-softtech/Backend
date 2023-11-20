package com.softtech.backendapi.iam.application.internal.queryservices;

import com.softtech.backendapi.iam.domain.model.entities.Role;
import com.softtech.backendapi.iam.domain.model.queries.GetAllRolesQuery;
import com.softtech.backendapi.iam.domain.model.queries.GetRoleByNameQuery;
import com.softtech.backendapi.iam.domain.services.RoleQueryService;
import com.softtech.backendapi.iam.infrastructure.persistence.jpa.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Role query service implementation
 * <p>
 *     This class is used to handle the role queries.
 * </p>
 * @see RoleQueryService
 * @see RoleRepository
 */
@Service
public class RoleQueryServiceImpl implements RoleQueryService {
    private final RoleRepository roleRepository;

    public RoleQueryServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public List<Role> handle(GetAllRolesQuery query) {
        return roleRepository.findAll();
    }


    @Override
    public Optional<Role> handle(GetRoleByNameQuery query) {
        return roleRepository.findByName(query.name());
    }
}
