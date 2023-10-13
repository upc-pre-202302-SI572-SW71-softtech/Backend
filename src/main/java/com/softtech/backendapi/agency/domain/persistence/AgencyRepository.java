package com.softtech.backendapi.agency.domain.persistence;

import com.softtech.backendapi.agency.domain.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgencyRepository extends JpaRepository<Agency,Integer> {
}