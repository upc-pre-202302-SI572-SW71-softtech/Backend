package com.softtech.backendapi.devices.domain.persistence;

import com.softtech.backendapi.devices.domain.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device,Long>{
}
