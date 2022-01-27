package com.org.gtstoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.gtstoft.entity.Customer;

@Repository
public interface DashboardRepo extends JpaRepository<Customer, Long>
{
	
}
