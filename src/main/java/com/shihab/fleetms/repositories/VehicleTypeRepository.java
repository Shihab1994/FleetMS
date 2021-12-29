package com.shihab.fleetms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shihab.fleetms.entities.VehicleType;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
