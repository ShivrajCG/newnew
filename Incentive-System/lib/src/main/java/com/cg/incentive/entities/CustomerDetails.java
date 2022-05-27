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
@Table(name = "customerdetails")
public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerID;
	@Column(name = "customername", length = 30)
	private String customerName;
	@Column(name = "customernumber", length = 10)
	private char cutomerNumber;
	@Column(name = "cutomermail", length = 40)
	private String customerMail;

	@OneToOne
	@JoinColumn(name = "dealerID")
	private CarDealer deal;

	public CarDealer getDeal() {
		return deal;
	}

	public void setDeal(CarDealer deal) {
		this.deal = deal;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public char getCutomerNumber() {
		return cutomerNumber;
	}

	public void setCutomerNumber(char cutomerNumber) {
		this.cutomerNumber = cutomerNumber;
	}

	public String getCustomerMail() {
		return customerMail;
	}

	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerID=" + customerID + ", customerName=" + customerName + ", cutomerNumber="
				+ cutomerNumber + ", customerMail=" + customerMail + ", deal=" + deal + "]";
	}

}
