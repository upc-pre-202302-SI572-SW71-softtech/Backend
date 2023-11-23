package com.softtech.backendapi.iam.infrastructure.hashing.bcrypt.services;

import com.softtech.backendapi.iam.application.internal.outboundservices.hashing.HashingService;
import com.softtech.backendapi.iam.infrastructure.hashing.bcrypt.BCryptHashingService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class HashingServiceImpl implements BCryptHashingService {
    private final BCryptPasswordEncoder passwordEncoder;


    public HashingServiceImpl() {
        passwordEncoder = new BCryptPasswordEncoder();
    }


    @Override
    public String encode(CharSequence rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }


    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }
}
