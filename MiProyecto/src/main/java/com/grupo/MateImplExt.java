package com.grupo;

public class MateImplExt extends MatematicasImpl  implements Matematicas{
	
	public int multiplica(int a, int b){
		return a*b;
	}
	
	public double division(int a, int b){
		return a/b;
	}

}
