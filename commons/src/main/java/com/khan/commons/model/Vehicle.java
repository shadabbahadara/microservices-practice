package com.khan.commons.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vehicle {

	@Id
	@GeneratedValue
	private int id;
	private String make;
	private String model;
	private String type;
	private int year;
}
