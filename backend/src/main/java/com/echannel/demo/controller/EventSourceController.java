package com.echannel.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.echannel.demo.model.EventSource;
import com.echannel.demo.repository.EventSourceRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EventSourceController {

	@Autowired
	EventSourceRepository eventsRepository;

	@GetMapping("/echannels")
	public ResponseEntity<List<EventSource>> getAllEvents(@RequestParam(required = false) String comment) {
		try {
			List<EventSource> events = eventsRepository.findByStatus("unassigned");

			
			if (events.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(events, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/echannels/{id}")
	public ResponseEntity<EventSource> getEventSourceById(@PathVariable("id") long id) {
		Optional<EventSource> eventData = eventsRepository.findById(id);

		if (eventData.isPresent()) {
			return new ResponseEntity<>(eventData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/echannels")
	public ResponseEntity<EventSource> createEvent(@RequestBody EventSource events) {
		try {
			EventSource _eventsource = eventsRepository
					.save(new EventSource(events.getBusinessKey(), events.getPriority(), events.getSourceBu(),events.getDcpReference(),events.getDcpReference(),events.getAccountName(),events.getTransactionAmount(),events.getLockedBy(),events.getDebitAccountNumber(),events.getAccountCurrency(),events.getBeneficiaryName(),events.getCustInfoMkr(),events.getAccountInfoMkr(),events.getOutcome(),events.getExtension(), events.getContactPerson(),events.getCustomerCalledOn(),events.getComment(), events.getCreatedBy(),events.getCreatedOn(),events.getUpdatedBy(),events.getUpdatedOn(),events.getStatus()));
			return new ResponseEntity<>(_eventsource, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/echannels/{id}")
	public ResponseEntity<EventSource> updateEventProcced(@PathVariable("id") long id, @RequestBody EventSource events) {
		Optional<EventSource> eventData = eventsRepository.findById(id);

		if (eventData.isPresent()) {
			EventSource _events = eventData.get();
			_events.setStatus("Proceed");
			return new ResponseEntity<>(eventsRepository.save(_events), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/echannels/{id}")
	public ResponseEntity<HttpStatus> deleteEvent(@PathVariable("id") long id) {
		try {
			eventsRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/echannels")
	public ResponseEntity<HttpStatus> deleteAllEvents() {
		try {
			eventsRepository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/echannels/proceed")
	public ResponseEntity<List<EventSource>> findByStatus() {
		try {
			List<EventSource> tutorials = eventsRepository.findByStatus("Proceed");

			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}