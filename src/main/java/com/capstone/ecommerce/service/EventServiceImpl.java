package com.capstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.ecommerce.dao.EventDao;
import com.capstone.ecommerce.models.Event;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventDao eDao;

	@Override
	public Event addEvent(Event event) {
		eDao.save(event);
		return event;
	}

	@Override
	public List<Event> getEvents() {
		return eDao.findAll();
	}

	@Override
	public Event updateEvent(Event event) {
		eDao.save(event);
		return event;
	}

	@Override
	public void deleteEvent(int eventId) {
		Event event = eDao.getReferenceById(eventId);
		eDao.delete(event);
	}
	
}
