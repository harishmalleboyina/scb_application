package com.bootactuator.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "bike")
@Data
public class Bike implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bike_no")
	protected int bikeNo;
	@Column(name = "bike_model_nm")
	protected String bikeModelName;
	protected String manufacturer;
	@Column(name = "rta_registration_no")
	protected String rtaRegistrationNo;
	protected double price;

}
