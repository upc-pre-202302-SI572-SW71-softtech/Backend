package com.softtech.backendapi.devices.api;

import com.softtech.backendapi.devices.domain.entity.Device;
import com.softtech.backendapi.devices.domain.service.DeviceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/devices")
@Tag(name = "devices", description = "the devices API")
public class DeviceController {
    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/{id}")
    public Device getDeviceById(Long id) {
        return deviceService.getById(id);
    }

    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAll();
    }

    @PostMapping
    public ResponseEntity<Device> createDevice(Device device) {
        return new ResponseEntity<>(deviceService.save(device), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDevice(Long id) {
        return deviceService.delete(id);
    }

}
