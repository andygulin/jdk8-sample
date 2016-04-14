package jdk8.sample.repeatannotation;

import java.lang.annotation.Repeatable;

@Repeatable(Names.class)
public @interface Name {
	String value();
}
