/**
 * In this class we a have a linkedlist in which threads will put data , and from which another thread will generate raports  
 */
package siit.java4.festivalstatistics;

import java.util.LinkedList;

public class FestivalGate {
	LinkedList<TicketType> ticketQueue = new LinkedList<>();

	public void validate(TicketType ticket) {
		ticketQueue.add(ticket);
	}

}
