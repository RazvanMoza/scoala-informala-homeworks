/**
 * Enum class that has different types of tickets and a method that randomly generates a ticket from the enum 
 */
package siit.java4.festivalstatistics;

import java.util.Random;

public enum TicketType {

	full, full_vip, free_pas, one_day, one_day_vip;

	static final TicketType[] values = TicketType.values();
	static final Random random = new Random();

	public static TicketType getRandomTicket() {
		return values[random.nextInt(values.length)];
	}
}
