package com.ticket.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.booking.entity.Ticket;
import com.ticket.booking.service.TicketService;

@RestController
@RequestMapping(value="/api/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	
	
	@GetMapping(value="/")
	public String welcome(){
		return "Welcome to Ticket Booking Systems";
	}
	
	@PostMapping(value="/add")
	public Ticket createTicket(@RequestBody Ticket ticket){
		return ticketService.createNewTicket(ticket);
	}
	
	@GetMapping(value="/get/{ticketId}")
	public Ticket getTicket(@PathVariable ("ticketId") Integer ticketId){
		
		return ticketService.getTicketById(ticketId);
	}
	
	
	
}
