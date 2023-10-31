package com.softtech.backendapi.devices.api;

import com.softtech.backendapi.devices.domain.entity.DeviceParameters;
import com.softtech.backendapi.devices.domain.entity.StatusDevice;
import com.softtech.backendapi.devices.domain.service.DeviceParameterService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/devices/param")
@Tag(name = "devices", description = "the devices API")
public class DeviceParamController {
    private final DeviceParameterService deviceParameterService;

    public DeviceParamController(DeviceParameterService deviceParameterService) {
        this.deviceParameterService = deviceParameterService;
    }

    // GET /api/devices/param/{id}
    @GetMapping("/{id}")
    public DeviceParameters getDeviceParamById(Long id) {
        return deviceParameterService.getById(id);
    }
    // GET /api/devices/param/{id}/temperature
    @GetMapping("/{id}/temperature")
    public String getTemperature(Long id) {
        return deviceParameterService.getTemperatureById(id);
    }
    // GET /api/devices/param/{id}/humidity
    @GetMapping("/{id}/humidity")
    public String getHumidity(Long id) {
        return deviceParameterService.getHumidityById(id);
    }
    // GET /api/devices/param/{id}/localisation
    @GetMapping("/{id}/localisation")
    public String getLocalisation(Long id) {
        return deviceParameterService.getLocalisationById(id);
    }
    // GET /api/devices/param/{id}/status
    @GetMapping("/{id}/status")
    public StatusDevice getStatus(Long id) {
        return deviceParameterService.getStatusById(id);
    }
    // POST /api/devices/param/{id}
    @PostMapping("/{id}")
    public DeviceParameters createDeviceParam(Long id) {
        return deviceParameterService.getById(id);
    }

}
