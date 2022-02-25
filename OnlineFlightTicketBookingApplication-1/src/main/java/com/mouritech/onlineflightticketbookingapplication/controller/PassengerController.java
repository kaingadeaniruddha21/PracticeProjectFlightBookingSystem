package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlineflightticketbookingapplication.entity.Booking;
import com.mouritech.onlineflightticketbookingapplication.entity.Passenger;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.BookingNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.PassengerNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.BookingRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.PassengerRepository;
import com.mouritech.onlineflightticketbookingapplication.service.BookingService;
import com.mouritech.onlineflightticketbookingapplication.service.PassengerService;

@RestController// (@Controller + @ResponseBody)
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("passenger/api/v1")
public class PassengerController {
	
	@Autowired
	private PassengerService passengerService;
	@Autowired
	PassengerRepository passengerRepository;
// create passenger rest api	
	@GetMapping("/passengers")
	public ResponseEntity<List<Passenger>> getAllPassenger(){
		return passengerService.getAllPassenger();
	}
// get all passenger rest api   
	@PostMapping("/passengers")
	public Passenger insertPassenger(@RequestBody Passenger newPassenger) {
		
		return passengerService.insertPassenger(newPassenger);
		
	}
// get passenger by id rest api
	@GetMapping("passengers/{pid}")
	public Passenger getPassengerById(@PathVariable("pid") Long passengerId) 
			throws PassengerNotFoundException{
		return passengerService.getPassengerById(passengerId);
				
		
	}
// update passenger by id rest api
	@PutMapping("passengers/{pid}")
	public Passenger updatePassengerById(@PathVariable("pid") Long passengerId,@RequestBody Passenger passenger) 
			throws PassengerNotFoundException{
		return passengerService.updatePassengerById(passengerId, passenger);
		
		
	}
	
// delete passenger rest api
@DeleteMapping("passengers/{id}")
	public String deletePassengerById(@PathVariable("id") Long passengerId)
			throws PassengerNotFoundException{
		passengerService.deletePassengerById(passengerId);
		 return "deleted the passenger";
		
	}
	
	
}
