package com.gusdev.demo.services;

import com.gusdev.demo.models.Order;
import com.gusdev.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.ProviderNotFoundException;
import java.util.List;

@Service
public class OrderService {

    private OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository userRepository) {
        this.repository = userRepository;
    }

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        return repository.findById(id).orElseThrow(ProviderNotFoundException::new);
    }

}
