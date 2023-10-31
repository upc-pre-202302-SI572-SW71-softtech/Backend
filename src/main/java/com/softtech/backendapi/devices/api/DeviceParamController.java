package com.softtech.backendapi.devices.api;

import com.softtech.backendapi.devices.domain.entity.DeviceParameters;
import com.softtech.backendapi.devices.domain.entity.StatusDevice;
import com.softtech.backendapi.devices.service.DeviceParametersServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/devices/param")
@Tag(name = "devices", description = "the devices API")
public class DeviceParamController {
    private final DeviceParametersServiceImpl deviceParameterService;

    public DeviceParamController(DeviceParametersServiceImpl deviceParameterService) {
        this.deviceParameterService = deviceParameterService;
    }

    @GetMapping("/{id}")
    public DeviceParameters getDeviceById(Long id) {
        return deviceParameterService.getById(id);
    }

    @PostMapping
    public DeviceParameters createDevice(DeviceParameters device) {
        return deviceParameterService.save(device);
    }

}
