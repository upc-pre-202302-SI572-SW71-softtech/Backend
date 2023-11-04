package com.softtech.backendapi.devices.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "device_parameters")
public class DeviceParameters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotNull -> aún no tenemos lo wareables
    @Column(name = "device_id")
    private Long deviceId;
    @Column(name = "humidity")
    private String humidity;
    @Column(name = "temperature")
    private String temperature;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "latitude", column = @Column(name = "latitude")),
            @AttributeOverride(name = "longitude", column = @Column(name = "longitude"))
    })
    private Localization localization;
    @Column(name = "heart_rate")
    private String heartRate;
    @Column(name = "status_device")
    private StatusDevice statusDevice;
}
