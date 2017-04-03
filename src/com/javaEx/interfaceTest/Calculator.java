package com.javaEx.interfaceTest;

public interface Calculator {
	public int plus(int pre, int post);
	public int multi(int pre, int post);
	
	default int execPlus(int pre, int post){
		return pre + post;
	}
	
	static int execMulti(int pre, int post){
		return pre * post;
	}
}
