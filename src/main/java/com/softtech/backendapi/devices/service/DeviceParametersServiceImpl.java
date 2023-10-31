package com.softtech.backendapi.devices.service;

import com.softtech.backendapi.devices.domain.entity.DeviceParameters;
import com.softtech.backendapi.devices.domain.persistence.DeviceParamaterRepository;
import com.softtech.backendapi.devices.domain.service.DeviceParameterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceParametersServiceImpl implements DeviceParameterService {
    private static final String ENTITY = "DeviceParameters";

    private final DeviceParamaterRepository deviceParamaterRepository;

    public DeviceParametersServiceImpl(DeviceParamaterRepository deviceParamaterRepository) {
        this.deviceParamaterRepository = deviceParamaterRepository;
    }

    @Override
    public DeviceParameters getById(Long id) {
        return deviceParamaterRepository.getById(id);
    }
    @Override
    public DeviceParameters save(DeviceParameters entity) {
        return deviceParamaterRepository.save(entity);
    }

    @Override
    public DeviceParameters update(DeviceParameters entity) {
        return deviceParamaterRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        deviceParamaterRepository.deleteById(id);
    }
}
