package com.mouritech.onlineflightticketbookingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlineflightticketbookingapplication.entity.Admin;
import com.mouritech.onlineflightticketbookingapplication.entity.Register;
import com.mouritech.onlineflightticketbookingapplication.repository.AdminRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.RegisterRepository;
import com.mouritech.onlineflightticketbookingapplication.service.AdminService;
import com.mouritech.onlineflightticketbookingapplication.service.RegisterService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("register/api/v1")
public class RegisterController {
	@Autowired
	RegisterRepository registerRepository;
	@Autowired
	private RegisterService registerService;
	
//	@GetMapping("/admin")
//	public ResponseEntity<List<Admin>> getAllAdmin(){
//		return adminService.getAllAdmin();
//	}
	@PostMapping("/register")
	public Register insertAdmin(@RequestBody Register newRegister) {
		
		return registerService.insertRegister(newRegister);
		
	}
}
