package com.softtech.backendapi.iam.infrastructure.hashing.bcrypt;

import com.softtech.backendapi.iam.application.internal.outboundservices.hashing.HashingService;
import org.springframework.security.crypto.password.PasswordEncoder;


public interface BCryptHashingService extends HashingService, PasswordEncoder {
}
