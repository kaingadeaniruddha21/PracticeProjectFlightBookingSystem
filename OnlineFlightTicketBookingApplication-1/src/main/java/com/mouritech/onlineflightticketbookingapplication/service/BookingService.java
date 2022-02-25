package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.Date;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;

import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.FightBookedAlreadyExistsException;
import com.mouritech.onlineflightticketbookingapplication.exception.PassengerNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;



public interface BookingService {
	
	Booking insertBooking(Booking newBooking);
    
	Booking showBookingById(String bookingId) throws BookingNotFoundException;

	List<Booking> showAllBookings();

	Booking updateBookingById(String bookingId, Booking booking) throws BookingNotFoundException;

	void deleteBookingById(String bookingId) throws BookingNotFoundException;

	 
	ResponseEntity<List<Booking>> getAllBookingByUserId(Long userId) throws UserNotFoundException;
//	ResponseEntity<Booking> createBooking(Long userId, Booking newBooking) throws UserNotFoundException;
	//ResponseEntity<Booking> createBooking(Long userId, Long passengerId,Booking newBooking) throws UserNotFoundException,PassengerNotFoundException;
	ResponseEntity<Booking> createBooking(Long userId, Booking newBooking) throws UserNotFoundException;


	

//	Booking getFightBookedByUser(Long userId, String fightBooked) throws FightBookedAlreadyExistsException;

}
