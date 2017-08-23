package com.rudra.aks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository<CommonBO> extends JpaRepository<CommonBO, Integer>{
	
}
