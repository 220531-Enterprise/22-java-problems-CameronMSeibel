package com.revature.eval.java.core;

public class Tester {

	public static void main(String[] args) {
		EvaluationService eval = new EvaluationService();
		
		String message = EvaluationService.SpeedConverter.printConversion(100);
		System.out.println(message);
		
	}

}
