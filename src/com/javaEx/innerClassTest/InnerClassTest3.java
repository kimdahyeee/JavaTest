package com.javaEx.innerClassTest;

public class InnerClassTest3 {

	public void exec(){
		class Test3{
			int value = 1;
			public void plus(){
				value++;
			}
		}
		Test3 t3 = new Test3();
		t3.plus();
		System.out.println(t3.value);
	}
	public static void main(String[] args) {
		InnerClassTest3 ict3 = new InnerClassTest3();
		ict3.exec();
	}

}
