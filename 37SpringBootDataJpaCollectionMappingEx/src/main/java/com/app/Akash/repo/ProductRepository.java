package com.app.Akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Akash.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
