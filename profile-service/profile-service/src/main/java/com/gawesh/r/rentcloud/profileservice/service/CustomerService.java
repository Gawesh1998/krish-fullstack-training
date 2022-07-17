package com.gawesh.r.rentcloud.profileservice.service;

import com.gawesh.r.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {


    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();

}