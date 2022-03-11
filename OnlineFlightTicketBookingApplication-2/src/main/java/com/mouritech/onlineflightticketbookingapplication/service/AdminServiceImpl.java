package com.mouritech.onlineflightticketbookingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.onlineflightticketbookingapplication.entity.Admin;
import com.mouritech.onlineflightticketbookingapplication.entity.User;
import com.mouritech.onlineflightticketbookingapplication.exception.AdminNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.exception.UserNotFoundException;
import com.mouritech.onlineflightticketbookingapplication.repository.AdminRepository;
import com.mouritech.onlineflightticketbookingapplication.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adminRepository;

	@Override
	public ResponseEntity<List<Admin>> getAllAdmin() {
		List<Admin> admin = adminRepository.findAll();
		if(admin.isEmpty()) {
			return new ResponseEntity<List<Admin>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Admin>>(admin,HttpStatus.OK);
	}

	@Override
	public Admin insertAdmin(Admin newAdmin) {
		return adminRepository.save(newAdmin);
	}

	@Override
	public Admin getAdminById(Long adminId) throws AdminNotFoundException {
		return adminRepository.findById(adminId).orElseThrow(() -> new AdminNotFoundException("admin not found with id " + adminId));
	}

	@Override
	public Admin updateAdminById(Long adminId, Admin admin) throws AdminNotFoundException {
		Admin existingadmin = adminRepository.findById(adminId).orElseThrow(() -> new AdminNotFoundException("admin not found with id " + adminId));
//		existinguser.setUserId(user.getUserId());
//		existinguser.setUserName(user.getUserName());
//		existinguser.setPassword(user.getPassword());
//	    existinguser.setEmail(user.getEmail());
		existingadmin.setAdminId(admin.getAdminId());
		existingadmin.setAdminName(admin.getAdminName());
		existingadmin.setPassword(admin.getPassword());
	
		adminRepository.save(existingadmin);
		return existingadmin;
	}

	@Override
	public void deleteAdminById(Long adminId) throws AdminNotFoundException {
		Admin existingadmin = adminRepository.findById(adminId).orElseThrow(() -> new AdminNotFoundException("admin not found with id " + adminId));
		adminRepository.delete(existingadmin);
		
	}

	
}
