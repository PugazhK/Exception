package StackoverFlowExp;

public class Stackoverflow {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		Stackoverflow sf = new Stackoverflow();
		sf.findA();
	}
}

