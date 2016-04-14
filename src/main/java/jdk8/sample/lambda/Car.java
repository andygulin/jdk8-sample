package jdk8.sample.lambda;

import java.util.function.Supplier;

public class Car {

	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}
}
