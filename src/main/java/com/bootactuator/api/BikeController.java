package com.bootactuator.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootactuator.repositories.BikeRepository;

@RestController
@RequestMapping("/bike")
public class BikeController {
	@Autowired
	private BikeRepository bikeRepository;

	@GetMapping(value = "/model/{rtaRegistrationNo}")
	public String getBikeModelName(@PathVariable("rtaRegistrationNo") String rtaRegistrationNo) {
		return bikeRepository.findByRtaRegistrationNo(rtaRegistrationNo).getBikeModelName();
	}

}
