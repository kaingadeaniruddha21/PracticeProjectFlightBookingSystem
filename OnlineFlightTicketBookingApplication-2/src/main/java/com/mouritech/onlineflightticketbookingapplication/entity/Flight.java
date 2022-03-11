package com.mouritech.onlineflightticketbookingapplication.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "flight_info")
@EntityListeners(AuditingEntityListener.class)
public class Flight {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id", length = 64)
	private String flightId;
	

	@Column(name = "flight_Name")
	private String flightName;
	
	@Column(name = "departure_Loc")
	private String departureLoc;
	
	@Column(name = "arrival_Loc")
	private String arrivalLoc;
	
	@Column(name = "total_Seats")
	private Long totalSeats;
	
	@Column(name = "fare")
	private String fare;
	
	@Column(name = "remaing_Seats")
	private Long remaingSeats; 
	
	@Column(name = "date")
	private Date date;
	
	public Flight(String flightName, String departureLoc, String arrivalLoc, Long totalSeats, String fare,
			Long remaingSeats, Date date, Location location) {
		super();
		this.flightName = flightName;
		this.departureLoc = departureLoc;
		this.arrivalLoc = arrivalLoc;
		this.totalSeats = totalSeats;
		this.fare = fare;
		this.remaingSeats = remaingSeats;
		this.date = date;
		this.location = location;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@ManyToOne(fetch = FetchType.LAZY,optional = false)
//	@JoinColumn(name="location_id",nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "location_id")
	
	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepartureLoc() {
		return departureLoc;
	}

	public void setDepartureLoc(String departureLoc) {
		this.departureLoc = departureLoc;
	}

	public String getArrivalLoc() {
		return arrivalLoc;
	}

	public void setArrivalLoc(String arrivalLoc) {
		this.arrivalLoc = arrivalLoc;
	}

	public Long getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Long totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	public Long getRemaingSeats() {
		return remaingSeats;
	}

	public void setRemaingSeats(Long remaingSeats) {
		this.remaingSeats = remaingSeats;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", departureLoc=" + departureLoc
				+ ", arrivalLoc=" + arrivalLoc + ", totalSeats=" + totalSeats + ", fare=" + fare + ", remaingSeats="
				+ remaingSeats + ", date=" + date + ", location=" + location + "]";
	}

	
	
}