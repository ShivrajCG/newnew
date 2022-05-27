package com.cg.incentive.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cardetails")
public class CarDetails {
	@Id
	@SequenceGenerator(name = "chassis_seq", initialValue = 12000290, sequenceName = "chassis_seq", allocationSize = 2)
	@GeneratedValue(generator = "chassis_seq", strategy = GenerationType.SEQUENCE)
	private int carChassisNo;
	@Column(name = "carmodel", length = 30)
	private String carModel;
	@Column
	private double carprice;
	@Column(name = "specification", length = 100)
	private String carspecifications;

	public int getCarChassisNumber() {
		return carChassisNo;
	}

	public void setCarChassisNumber(int carChassisNumber) {
		this.carChassisNo = carChassisNumber;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public double getPrice() {
		return carprice;
	}

	public void setPrice(double price) {
		this.carprice = price;
	}

	public String getSpecifications() {
		return carspecifications;
	}

	public void setSpecifications(String specifications) {
		this.carspecifications = specifications;
	}

}
