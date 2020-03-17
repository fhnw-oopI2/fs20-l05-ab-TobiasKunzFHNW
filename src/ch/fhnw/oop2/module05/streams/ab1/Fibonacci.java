package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Stream;

public class Fibonacci {
	public static void main(String[] args) {
		Stream.iterate(new Tuple<Integer>(0, 1), n -> new Tuple<>(n.t2, n.t1 + n.t2)).
				limit(30).
				forEach(n -> System.out.println(n.t2));
	}
}
