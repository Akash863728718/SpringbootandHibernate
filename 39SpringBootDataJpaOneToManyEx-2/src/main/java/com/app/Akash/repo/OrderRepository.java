package com.app.Akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Akash.entity.Order;



public interface OrderRepository extends JpaRepository<Order , Integer>{

}
