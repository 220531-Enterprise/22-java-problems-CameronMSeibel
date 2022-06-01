package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
		EvaluationService eval = new EvaluationService();
		
		String message = EvaluationService.SpeedConverter.printConversion(1.5);
		System.out.println(message);
		
		int thisBytes = eval.sumFirstAndLastDigit(242);
		System.out.println(thisBytes);
		
	}

}
