package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
		EvaluationService eval = new EvaluationService();
		
		String message = EvaluationService.SpeedConverter.printConversion(1.5);
		System.out.println(message);
		
		String thisBytes = eval.reverse("racecar");
		System.out.println(thisBytes);
		
		System.out.println(eval.getScrabbleScore("quirky"));
		
		System.out.println(eval.cleanPhoneNumber("+1 (613)-995-0253"));
		
		System.out.println(eval.calculatePrimeFactorsOf(2L));
		
	}

}
