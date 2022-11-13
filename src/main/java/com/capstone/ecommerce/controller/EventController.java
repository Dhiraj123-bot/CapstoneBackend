package com.capstone.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.ecommerce.models.Event;
import com.capstone.ecommerce.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	private EventService eService;
	
	@PostMapping("/addEvent")
	public Event addEvent(@RequestBody Event event) {
		return this.eService.addEvent(event);
	}
	
	@GetMapping("/events")
	public List<Event> getEvents() {
		return this.eService.getEvents();
	}
	
	@PutMapping("/events")
	public Event updateEvent(@RequestBody Event event) {
		return this.eService.updateEvent(event);
	}
	
	@DeleteMapping("/events/{eventId}")
	public ResponseEntity<HttpStatus>deleteEvent(@PathVariable String eventId) {
		try {
			this.eService.deleteEvent(Integer.parseInt(eventId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
