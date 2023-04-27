package com.dte.vivek.services;

import java.util.Optional;

import com.dte.vivek.entities.Event;

public interface EventService {

	Optional<Event> getEventById(int id);

	int createEvent(Event event);

	void deleteEvent(int id);

	
	

	
}
