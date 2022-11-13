package com.capstone.ecommerce.service;

import java.util.List;
import com.capstone.ecommerce.models.Event;

public interface EventService {
	public Event addEvent(Event event);
	
	public List<Event> getEvents();
	
	public Event updateEvent(Event event);
	
	public void deleteEvent(int eventId);
}
