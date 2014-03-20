package com.grupo;

/**
 * Hello world!
 * 
 */
public class App {

	String x = "";

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("Testing update 1 in GIT");

		Matematicas ext = new MateImplExt();

		int resul = ((MateImplExt) ext).resta(10, 2);
		System.out.println("multi=" + ((MateImplExt) ext).multiplica(5, 2));

	}
}
