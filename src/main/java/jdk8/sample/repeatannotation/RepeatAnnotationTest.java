package jdk8.sample.repeatannotation;

import org.junit.Test;

public class RepeatAnnotationTest {

	@Test
	public void test1() {
		Names names = Teather.class.getAnnotation(Names.class);
		Name[] nameArr = names.value();
		for (Name name : nameArr) {
			System.out.println(name.value());
		}
	}

	@Test
	public void test2() {
		Name[] nameArr = Student.class.getAnnotationsByType(Name.class);
		for (Name name : nameArr) {
			System.out.println(name.value());
		}
	}
}