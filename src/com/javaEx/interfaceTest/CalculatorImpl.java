package com.javaEx.interfaceTest;

public class CalculatorImpl implements Calculator {

	@Override
	public int plus(int pre, int post) {
		return pre + post;
	}

	@Override
	public int multi(int pre, int post) {
		return pre * post;
	}
	
}
