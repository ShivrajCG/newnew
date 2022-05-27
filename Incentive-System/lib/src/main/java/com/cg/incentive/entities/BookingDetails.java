package com.cg.incentive.entities;

import java.util.Date;

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
@Table(name = "bookingDetails")
public class BookingDetails {
	@Id
	@SequenceGenerator(name = "book_id", initialValue = 11100023, sequenceName = "book_id", allocationSize = 2)
	@GeneratedValue(generator = "book_id", strategy = GenerationType.SEQUENCE)
	private int bookingId;
	@OneToOne
	@JoinColumn(name = "customerId")
	private CustomerDetails custd;
	@OneToOne
	@JoinColumn(name = "dealerId")
	private CarDealer card;
	@Column
	private Date bookingDate;
	@OneToOne
	@JoinColumn(name = "carModel")
	private CarDetails cardet;
	@OneToOne
	@JoinColumn(name = "carChassisNo")
	private CarDetails cardet1;
	@OneToOne
	@JoinColumn(name = "carPrice")
	private CarDetails cardet2;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public CustomerDetails getCustd() {
		return custd;
	}

	public void setCustd(CustomerDetails custd) {
		this.custd = custd;
	}

	public CarDealer getCard() {
		return card;
	}

	public void setCard(CarDealer card) {
		this.card = card;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public CarDetails getCardet() {
		return cardet;
	}

	public void setCardet(CarDetails cardet) {
		this.cardet = cardet;
	}

	public CarDetails getCardet1() {
		return cardet1;
	}

	public void setCardet1(CarDetails cardet1) {
		this.cardet1 = cardet1;
	}

	public CarDetails getCardet2() {
		return cardet2;
	}

	public void setCardet2(CarDetails cardet2) {
		this.cardet2 = cardet2;
	}

}
