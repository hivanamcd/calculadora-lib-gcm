package com.gcm;


public class Calculadora {
	
	public int soma(int x, int y) {
		return x+y;
	}
	
	public int subtracao(int x, int y) {
		return x-y;
	}
	
	public int multiplicacao(int x, int y) {
		return x*y;
	}
	
	public int divisao(int x, int y) {
		if(y!=0)
			return x/y;
		else
			return 0;
	}

}
