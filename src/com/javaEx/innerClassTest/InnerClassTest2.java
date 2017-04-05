package com.javaEx.innerClassTest;

public class InnerClassTest2 {

	static class Test2{
		int value = 1;
		public void plus(){
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerClassTest2.Test2 t2 = new InnerClassTest2.Test2();
		t2.plus();
		System.out.println(t2.value);
	}

}
