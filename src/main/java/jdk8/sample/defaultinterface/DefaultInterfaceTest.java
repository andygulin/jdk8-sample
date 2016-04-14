package jdk8.sample.defaultinterface;

import org.junit.Test;

public class DefaultInterfaceTest {

	@Test
	public void test() {
		Person man = new Man();
		man.man();

		Person woman = new Woman();
		woman.woman();
	}
}
