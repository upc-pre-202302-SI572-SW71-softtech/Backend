package com.softtech.backendapi.tip.service;

import com.softtech.backendapi.shared.service.CrudServiceImpl1;
import com.softtech.backendapi.tip.domain.entity.Tip;
import com.softtech.backendapi.tip.domain.persistence.TipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipServiceImpl extends CrudServiceImpl1<Tip> {
    @Autowired
    private TipRepository tipRepository;

    @Override
    protected JpaRepository<Tip, Integer> getRepository() {
        return tipRepository;
    }
}
