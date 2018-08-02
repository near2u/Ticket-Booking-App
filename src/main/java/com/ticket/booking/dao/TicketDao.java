package com.ticket.booking.dao;

import org.springframework.data.repository.CrudRepository;

import com.ticket.booking.entity.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

	
}
