package com.shihab.fleetms.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shihab.fleetms.entities.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
