package com.softtech.backendapi.devices.service;

import com.softtech.backendapi.devices.domain.entity.Device;
import com.softtech.backendapi.devices.domain.persistence.DeviceRepository;
import com.softtech.backendapi.devices.domain.service.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    private static final String ENTITY = "Device";
    private final DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public List<Device> getAll() {
        return deviceRepository.findAll();
    }

    @Override
    public Device getById(Long id) {
        return deviceRepository.getById(id);
    }

    @Override
    public Device save(Device entity) {
        return deviceRepository.save(entity);
    }

    @Override
    public Device update(Device entity) {
        return deviceRepository.save(entity);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        return deviceRepository.findById(id)
                .map(device -> {
                    deviceRepository.delete(device);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new RuntimeException(ENTITY + " not found with id " + id));
    }
}
