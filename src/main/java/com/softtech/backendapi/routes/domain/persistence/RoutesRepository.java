package com.softtech.backendapi.routes.domain.persistence;

import com.softtech.backendapi.routes.domain.entity.Routes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutesRepository extends JpaRepository<Routes, Integer> {
}
