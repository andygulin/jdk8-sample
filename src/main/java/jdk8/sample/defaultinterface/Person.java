package jdk8.sample.defaultinterface;

public interface Person {

	default void man() {
		System.out.println("i am man...");
	}

	default void woman() {
		System.out.println("i am woman...");
	}
}
