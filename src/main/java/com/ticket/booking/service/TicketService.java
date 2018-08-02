package com.ticket.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.booking.dao.TicketDao;
import com.ticket.booking.entity.Ticket;

@Service
public class TicketService {

	
	@Autowired
	private TicketDao ticketDao;
	
	
	public Ticket createNewTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.save(ticket);
	}


	public Ticket getTicketById(Integer ticketId) {
		// TODO Auto-generated method stub
		return ticketDao.findOne(ticketId);
	}

	
}
