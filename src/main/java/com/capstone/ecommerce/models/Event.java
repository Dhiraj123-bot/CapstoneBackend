package com.capstone.ecommerce.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Event {
	
	@Id
	private int eventId;
	private String eventName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date eventStart;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date eventEnd;

	public Event() {
		super();
	}

	public Event(int eventId, String eventName, Date eventStart, Date eventEnd) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventStart() {
		return eventStart;
	}

	public void setEventStart(Date eventStart) {
		this.eventStart = eventStart;
	}

	public Date getEventEnd() {
		return eventEnd;
	}

	public void setEventEnd(Date eventEnd) {
		this.eventEnd = eventEnd;
	}
	
}
