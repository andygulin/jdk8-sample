package jdk8.sample.lambda;

import org.junit.Test;

public class InstanceTest {

	@Test
	public void test() {
		Car car = Car.create(Car::new);
		System.out.println(car);
	}
}
