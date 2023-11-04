package com.softtech.backendapi.activity.service;

import com.softtech.backendapi.activity.domain.entity.Activity;
import com.softtech.backendapi.activity.domain.persistence.ActivityRepository;
import com.softtech.backendapi.shared.service.CrudServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


@Service
public class ActivityServiceImpl extends CrudServiceImpl<Activity> {
    @Autowired
    private ActivityRepository activityRepository;

    @Override
    protected JpaRepository<Activity,Integer> getRepository(){
        return activityRepository;
    }
}