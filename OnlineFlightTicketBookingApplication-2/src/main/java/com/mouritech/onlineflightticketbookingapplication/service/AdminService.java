package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mouritech.onlineflightticketbookingapplication.entity.Admin;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.AdminNotFoundException;

public interface AdminService {
	
	ResponseEntity<List<Admin>> getAllAdmin();

	Admin insertAdmin(Admin newAdmin);
	
	Admin getAdminById(Long adminId) throws AdminNotFoundException;

	Admin updateAdminById(Long adminId, Admin admin) throws AdminNotFoundException;

	void deleteAdminById(Long adminId) throws AdminNotFoundException;
}

