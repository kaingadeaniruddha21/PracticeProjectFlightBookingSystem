package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Register;
import com.mouritech.onlineflightticketbookingapplication.exception.RegisterNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.AdminRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.RegisterRepository;
@Service
public class RegisterServiceImpl implements RegisterService{
	@Autowired
	RegisterRepository registerRepository;

	@Override
	public ResponseEntity<List<Register>> getAllRegister() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register insertRegister(Register newRegister) {
		return registerRepository.save(newRegister);
	}

	@Override
	public Register getRegisterById(Long registerId) throws RegisterNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register updateRegisterById(Long registerId, Register register) throws RegisterNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRegisterById(Long registerId) throws RegisterNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
