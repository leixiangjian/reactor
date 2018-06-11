package com.reactor.learn;

import reactor.core.publisher.Mono;

public class MonoLearn {

	public static void main(String[] args) {
		// ÉùÃ÷Óë¶©ÔÄ
		Mono.just(1).subscribe(System.out::println);
		
		Mono.error(new Exception("some error")).subscribe(
		        System.out::println,
		        System.err::println,
		        () -> System.out.println("Completed!")
		);
	}

}
