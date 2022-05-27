package com.cg.incentive.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "incentivedetails")
public class IncentiveDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int incentiveId;
	@OneToOne
	@JoinColumn(name = "bookingId")
	private BookingDetails bd;
	@OneToOne
	@JoinColumn(name = "dealerId")
	private CarDealer cd;
	@Column(name = "targetSales")
	private double targetSales;
	@Column(name = "actualSales")
	private double actualSales;
	@Column(name = "incentiveRate")
	private double incentiveRate;
	@Column(name = "incentive")
	private double incentive;

	public int getIncentiveId() {
		return incentiveId;
	}

	public void setIncentiveId(int incentiveId) {
		this.incentiveId = incentiveId;
	}

	public BookingDetails getBd() {
		return bd;
	}

	public void setBd(BookingDetails bd) {
		this.bd = bd;
	}

	public CarDealer getCd() {
		return cd;
	}

	public void setCd(CarDealer cd) {
		this.cd = cd;
	}

	public double getTargetSales() {
		return targetSales;
	}

	public void setTargetSales(double targetSales) {
		this.targetSales = targetSales;
	}

	public double getActualSales() {
		return actualSales;
	}

	public void setActualSales(double actualSales) {
		this.actualSales = actualSales;
	}

	public double getIncentiveRate() {
		return incentiveRate;
	}

	public void setIncentiveRate(double incentiveRate) {
		this.incentiveRate = incentiveRate;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

}