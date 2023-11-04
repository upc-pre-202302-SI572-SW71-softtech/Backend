package com.softtech.backendapi.activity.domain.persistence;

import com.softtech.backendapi.activity.domain.entity.Activity;
import com.softtech.backendapi.agency.domain.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity,Integer> {
}