package com.softtech.backendapi.tip.domain.persistence;

import com.softtech.backendapi.tip.domain.entity.Tip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipRepository extends JpaRepository<Tip,Integer> {
}
