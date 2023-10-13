package com.softtech.backendapi.agency.service;

import com.softtech.backendapi.activity.domain.entity.Activity;
import com.softtech.backendapi.activity.domain.persistence.ActivityRepository;
import com.softtech.backendapi.agency.domain.entity.Agency;
import com.softtech.backendapi.agency.domain.persistence.AgencyRepository;
import com.softtech.backendapi.agency.domain.service.AgencyService;
import com.softtech.backendapi.shared.service.CrudServiceImpl;
import com.softtech.backendapi.shared.service.CrudServiceImpl1;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



//@Service
//public class AgencyServiceImpl extends CrudServiceImpl<Agency> implements AgencyService {
//    public AgencyServiceImpl(JpaRepository<Agency, Integer> repository) {
//        super(repository);
//    }
//}

@Service
public class AgencyServiceImpl extends CrudServiceImpl1<Agency> {
    @Autowired
    private AgencyRepository agencyRepository;

    @Override
    protected JpaRepository<Agency,Integer> getRepository(){
        return agencyRepository;
    }
}