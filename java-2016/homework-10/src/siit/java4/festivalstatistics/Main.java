/**
 * The Main class
 */

package siit.java4.festivalstatistics;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		FestivalGate gate = new FestivalGate();

		FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);
		statsThread.start();

		for (int i = 0; i < 357; i++) {

			TicketType ticketType = TicketType.getRandomTicket();
			FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
			festivalAttendee.start();
			festivalAttendee.join();
		}

	}

}
