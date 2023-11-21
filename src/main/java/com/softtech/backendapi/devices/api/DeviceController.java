package com.softtech.backendapi.devices.api;

import com.softtech.backendapi.devices.domain.entity.Device;
import com.softtech.backendapi.devices.domain.service.DeviceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/devices")
@Tag(name = "devices", description = "the devices API")
public class DeviceController {
    private final DeviceService deviceService;
    private final Logger log = LoggerFactory.getLogger(DeviceController.class);

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/{id}")
    public Device getDeviceById(@PathVariable Long id) {
        return deviceService.getById(id);
    }

    @GetMapping
    public List<Device> getAllDevices() {
        return deviceService.getAll();
    }

    @PostMapping
    public ResponseEntity<Object> createDevice(@RequestBody Device device) {
        try {
            var deviceCreated = new Device(device.getId(),1, device.getName());
            Device savedDevice = deviceService.save(deviceCreated);
            return new ResponseEntity<>(savedDevice, HttpStatus.CREATED);
        } catch (Exception e) {
            log.error("Exception during device creation", e);
            String errorMessage = "An error occurred during device creation. " + e.getMessage();
            return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDevice(@PathVariable Long id) {
        return deviceService.delete(id);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return new ResponseEntity<>("An error occurred during device creation.", HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
