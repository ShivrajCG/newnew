package com.cg.incentive.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cardealer")
public class CarDealer {

	@Id
	@SequenceGenerator(name = "dealer_seq", initialValue = 44444, sequenceName = "dealer_seq", allocationSize = 1)
	@GeneratedValue(generator = "dealer_seq", strategy = GenerationType.SEQUENCE)
	private int dealerID;
	@Column(name = "dealername", length = 30)
	private String dealerName;

	@Column(name = "dealerbranch", length = 30)
	private String dealerBranch;

	@OneToOne
	@JoinColumn(name = "carCompanyName")
	private CarCompany comp;

	public int getDealerID() {
		return dealerID;
	}

	public void setDealerID(int dealerID) {
		this.dealerID = dealerID;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerBranch() {
		return dealerBranch;
	}

	public void setDealerBranch(String dealerBranch) {
		this.dealerBranch = dealerBranch;
	}

	@Override
	public String toString() {
		return "CarDealer [dealerID=" + dealerID + ", dealerName=" + dealerName + ", dealerBranch=" + dealerBranch
				+ "]";
	}

}