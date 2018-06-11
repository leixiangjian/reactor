package com.reactor.learn;

import reactor.core.publisher.Flux;

public class FluxLearn {

	public static void main(String[] args) {
		//声明流加上订阅
		Flux.just(1, 2, 3, 4, 5, 6).subscribe(System.out::print);
		System.out.println();
		Flux.just(1, 2, 3, 4, 5, 6).subscribe(
			    System.out::println,
			    System.err::println,
			    () -> System.out.println("Completed!"));
	}

}
