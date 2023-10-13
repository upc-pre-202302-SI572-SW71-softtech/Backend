package com.softtech.backendapi.travel.service;

import com.softtech.backendapi.activity.domain.entity.Activity;
import com.softtech.backendapi.activity.domain.persistence.ActivityRepository;
import com.softtech.backendapi.shared.service.CrudServiceImpl1;
import com.softtech.backendapi.travel.domain.entity.Travel;
import com.softtech.backendapi.travel.domain.persistence.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TravelServiceImpl extends CrudServiceImpl1<Travel> {
    @Autowired
    private TravelRepository travelRepository;

    @Override
    protected JpaRepository<Travel,Integer> getRepository(){
        return travelRepository;
    }
}
