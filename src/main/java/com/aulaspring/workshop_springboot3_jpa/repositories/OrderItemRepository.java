package com.aulaspring.workshop_springboot3_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.workshop_springboot3_jpa.entities.OrderItem;
import com.aulaspring.workshop_springboot3_jpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
