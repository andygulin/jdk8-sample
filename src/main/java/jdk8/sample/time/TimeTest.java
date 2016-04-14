package jdk8.sample.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.Test;

public class TimeTest {

	@Test
	public void instant() {
		Instant instant = Instant.now();
		System.out.println(instant);
		System.out.println(instant.getEpochSecond());
		System.out.println(instant.toEpochMilli());
	}

	@Test
	public void zonedDateTime() {
		ZonedDateTime dateTime = ZonedDateTime.now();
		System.out.println(dateTime);
	}

	@Test
	public void localDateTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}

	@Test
	public void clock() {
		Clock clock = Clock.systemUTC();
		System.out.println(clock.millis());
	}

	@Test
	public void convert() {
		Instant instant = Instant.now();
		Date date = Date.from(instant);
		System.out.println(date);
	}
}
