package com.mouritech.onlineflightticketbookingapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlineflightticketbookingapplication.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	List<Admin> findByAdminId(Long adminId);
}
