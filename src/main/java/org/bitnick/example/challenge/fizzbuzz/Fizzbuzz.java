package org.bitnick.example.challenge.fizzbuzz;

public class Fizzbuzz {
	
	public String fizzbuzz(Integer number) {
		StringBuilder sb = new StringBuilder();
		
		Boolean isDivisbleBy3 = (number % 3 == 0);
		Boolean isDivisbleBy5 = (number % 5 == 0);
		
		if (!isDivisbleBy3 && !isDivisbleBy5) {
			sb.append(number);
		}
		
		if (isDivisbleBy3) {
			sb.append("Fizz");
		}
		
		if (isDivisbleBy5) {
			sb.append("Buzz");
		}

		return sb.toString();
	}
}
