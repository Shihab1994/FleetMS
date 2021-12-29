package com.shihab.fleetms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shihab.fleetms.entities.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
