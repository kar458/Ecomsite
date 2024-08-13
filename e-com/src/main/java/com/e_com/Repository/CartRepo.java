package com.e_com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.e_com.Model.cart;



@Repository
public interface CartRepo extends JpaRepository<cart, Long> {
	
}