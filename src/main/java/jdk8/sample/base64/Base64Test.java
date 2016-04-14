package jdk8.sample.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.junit.Test;

public class Base64Test {

	@Test
	public void test() {
		String str = Base64.getEncoder().encodeToString("abc".getBytes(StandardCharsets.UTF_8));
		System.out.println(str);

		byte[] b = Base64.getDecoder().decode(str);
		System.out.println(new String(b, StandardCharsets.UTF_8));
	}
}
