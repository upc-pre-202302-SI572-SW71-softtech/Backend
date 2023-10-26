package com.softtech.backendapi.user.domain.persistence;

import com.softtech.backendapi.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
