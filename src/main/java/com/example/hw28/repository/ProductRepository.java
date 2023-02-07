package com.example.hw28.repository;

import com.example.hw28.model.Product;
import org.springframework.data.repository.CrudRepository;

/*
 *
 * @author Roman Netesa
 *
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
