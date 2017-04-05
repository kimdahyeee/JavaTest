package com.javaEx.innerClassTest;

public class InnerClassTest1 {

	class Test1{
		int value = 1;
		public void plus(){
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerClassTest1 ict1 = new InnerClassTest1();
		Test1 t1 = ict1.new Test1();
		t1.plus();
		System.out.println(t1.value);
	}

}
