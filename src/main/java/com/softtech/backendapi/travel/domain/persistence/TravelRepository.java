package com.softtech.backendapi.travel.domain.persistence;

import com.softtech.backendapi.travel.domain.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer> {
}
