package com.softtech.backendapi.devices.domain.service;

import com.softtech.backendapi.devices.domain.entity.Device;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface DeviceService {

    List<Device> getAll();

    Device getById(Long id);

    Device save(Device entity);
    Device update(Device entity);
    ResponseEntity<?> delete(Long id);
}
