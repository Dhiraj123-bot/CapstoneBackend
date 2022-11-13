package com.capstone.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.ecommerce.models.Event;

public interface EventDao extends JpaRepository<Event, Integer> {

}
