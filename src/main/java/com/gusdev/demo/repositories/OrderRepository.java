package com.gusdev.demo.repositories;

import com.gusdev.demo.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
