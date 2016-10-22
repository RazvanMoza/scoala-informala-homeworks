/**
 * In this class we have a thread that starts every 5 seconds and if the list is not empty , it makes a statistic about the number of tickets
 */
package siit.java4.festivalstatistics;

public class FestivalStatisticsThread extends Thread {
	private FestivalGate gate;

	public FestivalStatisticsThread(FestivalGate gate) {
		this.gate = gate;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.sleep(5000);
				synchronized (gate.ticketQueue) {
					while (gate.ticketQueue.isEmpty()) {
						gate.ticketQueue.wait();
					}
					int total_tickets = 0;
					int full_tickets = 0;
					int full_vip_tickets = 0;
					int free_pas_tickets = 0;
					int one_day_tickets = 0;
					int one_day_vip_tickets = 0;

					for (TicketType t : gate.ticketQueue) {
						total_tickets = total_tickets + 1;
						switch (t) {
						case full:
							full_tickets = full_tickets + 1;
							break;
						case full_vip:
							full_vip_tickets = full_vip_tickets + 1;
							break;
						case free_pas:
							free_pas_tickets = free_pas_tickets + 1;
							break;
						case one_day:
							one_day_tickets = one_day_tickets + 1;
							break;
						case one_day_vip:
							one_day_vip_tickets = one_day_vip_tickets + 1;
							break;
						}
					}
					System.out.println(total_tickets + " people entered");
					System.out.println(full_tickets + " people have full tickets");
					System.out.println(free_pas_tickets + " have free passes");
					System.out.println(full_vip_tickets + " have full VIP passes");
					System.out.println(one_day_tickets + " have one-day passes");
					System.out.println(one_day_vip_tickets + " have one-day VIP passes");
					gate.ticketQueue.notify();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
