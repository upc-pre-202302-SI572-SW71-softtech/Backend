package com.softtech.backendapi.devices.domain.persistence;

import com.softtech.backendapi.devices.domain.entity.DeviceParameters;
import com.softtech.backendapi.devices.domain.entity.StatusDevice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceParamaterRepository extends JpaRepository<DeviceParameters,Long> {
//    String getTemperature(Long id);
//    String getHumidity(Long id);
//    String getLocalisation(Long id);
//    StatusDevice getStatusDevice(Long id);
}
