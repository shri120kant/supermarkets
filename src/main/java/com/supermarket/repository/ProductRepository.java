package com.supermarket.repository;

import org.springframework.data.repository.CrudRepository;

import com.supermarket.model.Admin;

public interface ProductRepository extends CrudRepository<Admin, Long> {

}
