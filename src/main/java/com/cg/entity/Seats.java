package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seats {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String busId;
	@Column
	private LocalDate date;
	
	//seats
	@Column
	private String seat1;
	@Column
	private String seat2;
	@Column
	private String seat3;
	@Column
	private String seat4;
	@Column
	private String seat5;
	
	public Seats() {
			// TODO Auto-generated constructor stub
	}

	public Seats(int id, String busId, LocalDate date, String seat1, String seat2, String seat3, String seat4,
			String seat5) {
		this.id = id;
		this.busId = busId;
		this.date = date;
		this.seat1 = seat1;
		this.seat2 = seat2;
		this.seat3 = seat3;
		this.seat4 = seat4;
		this.seat5 = seat5;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getSeat1() {
		return seat1;
	}

	public void setSeat1(String seat1) {
		this.seat1 = seat1;
	}

	public String getSeat2() {
		return seat2;
	}

	public void setSeat2(String seat2) {
		this.seat2 = seat2;
	}

	public String getSeat3() {
		return seat3;
	}

	public void setSeat3(String seat3) {
		this.seat3 = seat3;
	}

	public String getSeat4() {
		return seat4;
	}

	public void setSeat4(String seat4) {
		this.seat4 = seat4;
	}

	public String getSeat5() {
		return seat5;
	}

	public void setSeat5(String seat5) {
		this.seat5 = seat5;
	}
	
	
	
	
	
	
	
}
