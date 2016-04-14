package jdk8.sample.lambda;

public class ThreadTest {
	public static void main(String[] args) {
		new Thread(() -> System.out.print("Hello")).start();
	}
}
