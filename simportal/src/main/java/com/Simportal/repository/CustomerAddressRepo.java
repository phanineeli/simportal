package com.Simportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Simportal.Entity.CustomerAddressEntity;

public interface CustomerAddressRepo extends JpaRepository<CustomerAddressEntity,Integer> {

}
