package com.softtech.backendapi.agency.service;

import com.softtech.backendapi.agency.domain.entity.Agency;
import com.softtech.backendapi.agency.domain.persistence.AgencyRepository;
import com.softtech.backendapi.shared.service.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;



@Service
public class AgencyServiceImpl extends CrudServiceImpl<Agency> {
    @Autowired
    private AgencyRepository agencyRepository;

    @Override
    protected JpaRepository<Agency,Integer> getRepository(){
        return agencyRepository;
    }
}