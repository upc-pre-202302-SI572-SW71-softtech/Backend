package com.softtech.backendapi.user.service;

import com.softtech.backendapi.shared.service.CrudServiceImpl;
import com.softtech.backendapi.travel.domain.entity.Travel;
import com.softtech.backendapi.travel.domain.persistence.TravelRepository;
import com.softtech.backendapi.user.domain.entity.User;
import com.softtech.backendapi.user.domain.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends CrudServiceImpl<User> {
    @Autowired
    private UserRepository userRepository;

    @Override
    protected JpaRepository<User,Integer> getRepository(){
        return userRepository;
    }
}
