package com.grupo;

/**
 * Hello world!
 * 
 */
public class App {

	String x = "";

	public static void main(String[] args) {

		System.out.println("Working with branch: DisplayData");
		System.out.println("--------------------------------");
		System.out.println("A=5 & B=10 Therefore");

		Matematicas ext = new MateImplExt();
		int a=5, b=10;
		
		System.out.println("Suma=" + ext.suma(a, b));
		System.out.println("Multi=" + ((MateImplExt)ext).multiplica(a, b));

	}
}
