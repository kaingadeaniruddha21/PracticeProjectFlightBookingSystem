package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;


import com.mouritech.onlineflightticketbookingapplication.entity.Register;
import com.mouritech.onlineflightticketbookingapplication.exception.RegisterNotFoundException;

public interface RegisterService {
	ResponseEntity<List<Register>> getAllRegister();

	Register insertRegister(Register newRegister);
	
	Register getRegisterById(Long registerId) throws RegisterNotFoundException;

	Register updateRegisterById(Long registerId, Register register) throws RegisterNotFoundException;

	void deleteRegisterById(Long registerId) throws RegisterNotFoundException;
}
