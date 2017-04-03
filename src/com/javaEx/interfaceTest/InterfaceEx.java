package com.javaEx.interfaceTest;

public class InterfaceEx {

	public static void main(String[] args) {
		Calculator cal = new CalculatorImpl();
		int resultPlus = cal.plus(3, 9);
		int resultMulti = cal.multi(3, 9);
		System.out.println("resultPlus 값은 : " + resultPlus);
		System.out.println("resultMulti 값은 : " + resultMulti);
		
		int resultExecPlus = cal.execPlus(3, 9);
		System.out.println("dafault method 호출 결과 : " + resultExecPlus);
		
		int resultExecMulti = Calculator.execMulti(3, 9);
		System.out.println("static method 호출 결과 : " + resultExecMulti);
	}
}
