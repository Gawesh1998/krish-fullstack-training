package com.gawesh.r.rentcloud.profileservice.repository;

import com.gawesh.r.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {


}