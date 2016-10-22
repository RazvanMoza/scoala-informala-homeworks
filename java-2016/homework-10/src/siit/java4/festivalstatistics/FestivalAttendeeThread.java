/**
 * In the class we have a thread that receives a ticket and a gate , and put's the data from the ticket into the queve from the gate
 */
package siit.java4.festivalstatistics;

import java.util.Random;

public class FestivalAttendeeThread extends Thread {

	private TicketType ticket;
	private FestivalGate gate;
	private Random r = new Random();

	public FestivalAttendeeThread(TicketType ticket, FestivalGate gate) {
		this.ticket = ticket;
		this.gate = gate;
	}

	@Override
	public void run() {
		try {
			synchronized (gate.ticketQueue) {
				gate.validate(ticket);
				gate.ticketQueue.notify();
			}
			Thread.sleep(r.nextInt(100) + 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
