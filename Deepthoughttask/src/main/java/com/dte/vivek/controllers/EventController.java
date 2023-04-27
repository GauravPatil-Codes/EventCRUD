package com.dte.vivek.controllers;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dte.vivek.entities.Event;
import com.dte.vivek.services.EventService;

@RestController
@RequestMapping("/api/v3/app/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping("/{id}")
	public Optional<Event> getById(@PathVariable("id")int id) {
		Optional<Event> event = eventService.getEventById(id);
	    return event;
		
	}
	
	@PostMapping
    	public ResponseEntity<Integer> createEvent(@RequestBody Event event) {
    	    // Save the event to the database and return its ID
    	    int eventId = eventService.createEvent(event);
    	    return ResponseEntity.ok(eventId);
    	}

    @PutMapping({"/id"})
    public ResponseEntity<Integer> updateEvent(@RequestBody Event event) {
	    // Save the event to the database and return its ID
	    int eventId = eventService.createEvent(event);
	    return ResponseEntity.ok(eventId);
    }
	
	
	@DeleteMapping({"/{id}"})
	public void deleteById(@PathVariable("id")int id)
	{
			eventService.deleteEvent(id);
	}
   
}


