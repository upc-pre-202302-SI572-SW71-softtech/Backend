package com.softtech.backendapi.devices.domain.service;

import com.softtech.backendapi.devices.domain.entity.DeviceParameters;
import com.softtech.backendapi.devices.domain.entity.StatusDevice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeviceParameterService {
    List<DeviceParameters> getAllParameters();

    DeviceParameters getById(Long id);

    DeviceParameters save(DeviceParameters entity);

    DeviceParameters update(DeviceParameters entity);

    void delete(Long id);
}
