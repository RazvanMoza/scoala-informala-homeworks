package siit.java4.festivalstatistics;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FestivalGateUnitTest {

	@Test
	public void testLengthOfList() throws InterruptedException {

		FestivalGate gate = new FestivalGate();
		for (int i = 0; i < 357; i++) {

			TicketType ticketType = TicketType.getRandomTicket();
			FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
			festivalAttendee.start();
			festivalAttendee.join();
		}
		assertEquals(gate.ticketQueue.size(), 357);

	}

}
