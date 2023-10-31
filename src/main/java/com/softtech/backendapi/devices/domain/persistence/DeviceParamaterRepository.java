package com.softtech.backendapi.devices.domain.persistence;
import com.softtech.backendapi.devices.domain.entity.DeviceParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceParamaterRepository extends JpaRepository<DeviceParameters,Long> {
}
