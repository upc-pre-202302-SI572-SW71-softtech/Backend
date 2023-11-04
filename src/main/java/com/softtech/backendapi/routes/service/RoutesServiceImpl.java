package com.softtech.backendapi.routes.service;

import com.softtech.backendapi.routes.domain.entity.Routes;
import com.softtech.backendapi.routes.domain.persistence.RoutesRepository;
import com.softtech.backendapi.shared.service.CrudServiceImpl;
import com.softtech.backendapi.travel.domain.entity.Travel;
import com.softtech.backendapi.travel.domain.persistence.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoutesServiceImpl extends CrudServiceImpl<Routes> {
    @Autowired
    private RoutesRepository routesRepository;

    @Override
    protected JpaRepository<Routes,Integer> getRepository(){
        return routesRepository;
    }
}
