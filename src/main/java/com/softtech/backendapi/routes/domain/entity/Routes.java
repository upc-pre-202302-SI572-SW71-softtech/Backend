package com.softtech.backendapi.routes.domain.entity;

import com.softtech.backendapi.devices.domain.entity.Localization;
import com.softtech.backendapi.devices.domain.entity.StatusDevice;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "routes")
public class Routes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "length")
    private Long length;

    @Column(name = "difficult")
    private Integer difficult;
}