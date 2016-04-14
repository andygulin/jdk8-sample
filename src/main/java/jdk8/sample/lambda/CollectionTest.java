package jdk8.sample.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import org.junit.Test;

public class CollectionTest {

	@Test
	public void list() {
		List<String> list = Arrays.asList("andy", "gulin", "mary");

		list.forEach((n) -> System.out.println(n));
		list.forEach((final String n) -> System.out.println(n));
		list.forEach(n -> System.out.println(n));
		list.forEach(System.out::println);

		list.stream().map(String::toUpperCase).forEach(System.out::println);
	}

	@Test
	public void map() {
		Map<Long, String> map = new HashMap<>();
		map.put(1L, "aaa");
		map.put(2L, "bbb");
		map.put(3L, "ccc");
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}

	@Test
	public void join() {
		List<String> list = Arrays.asList("aa", "bb", "cc");
		System.out.println(String.join(",", list));

		StringJoiner joiner = new StringJoiner(",");
		System.out.println(joiner.add("aa").add("bb").add("cc").toString());

		joiner = new StringJoiner(",", "[", "]");
		System.out.println(joiner.add("aa").add("bb").add("cc").toString());
	}
}