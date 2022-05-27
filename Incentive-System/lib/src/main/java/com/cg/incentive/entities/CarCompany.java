package com.cg.incentive.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carcompany")
public class CarCompany {
	@Id
	@Column(name = "carcompanyname", length = 30)
	private String carCompanyName;

	@Column(name = "carmodel", length = 30)
	List<String> carModel;
	List<Integer> carChasisno;

	public String getCarCompanyName() {
		return carCompanyName;
	}

	public void setCarCompanyName(String carCompanyName) {
		this.carCompanyName = carCompanyName;
	}

	public List<String> getCarModel() {
		return carModel;
	}

	public void setCarModel(List<String> carModel) {
		this.carModel = carModel;
	}

	public List<Integer> getCarChasisno() {
		return carChasisno;
	}

	public void setCarChasisno(List<Integer> carChasisno) {
		this.carChasisno = carChasisno;
	}

}
