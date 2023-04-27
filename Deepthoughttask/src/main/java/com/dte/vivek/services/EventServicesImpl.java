package com.dte.vivek.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dte.vivek.daos.EventDao;
import com.dte.vivek.entities.Event;

@Service

public class EventServicesImpl implements EventService {

    @Autowired
    private EventDao eventDao;

	@Override
	public Optional<Event> getEventById(int id) {
		
		return eventDao.findById(id);
	}

	@Override
	public int createEvent(Event event) {
		Event savedEvent = eventDao.save(event);
	    return savedEvent.getUid();
	}

	@Override
	public void deleteEvent(int id) {
			
		eventDao.deleteById(id);
	}

	


    

	
}
