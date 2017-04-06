package com.javaEx.innerClassTest;

public class InnerClassTest4 {

	public static void main(String[] args) {
//		ExecClass ec = new ExecExtendsClass();
//		ec.exec();
		
		ExecClass ec = new ExecClass() {
			
			@Override
			public void exec() {
				System.out.println("anonymous!");
			}
		};
		ec.exec();
	}

}
