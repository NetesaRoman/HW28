package com.example.hw28.repository;

import com.example.hw28.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
 *
 * @author Roman Netesa
 *
 */
@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {
}
