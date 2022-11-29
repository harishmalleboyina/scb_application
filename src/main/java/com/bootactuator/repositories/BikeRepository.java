package com.bootactuator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootactuator.entities.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {
	BikeModelName findByRtaRegistrationNo(String rtaRegistrationNo);
}
