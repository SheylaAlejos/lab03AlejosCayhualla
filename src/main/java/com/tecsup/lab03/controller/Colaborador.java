package com.tecsup.lab03.controller;

import java.util.Scanner;

public class Colaborador {
	
	Scanner reader=new Scanner(System.in);
	int a=0;
	int b=0;
	int m;
	double d;
	public void multiplicacion() {
		 System.out.println("Numero 1 : ");
		 a= reader.nextInt();
		System.out.println("Numero 2 : ");
		b= reader.nextInt();
		
		m=a*b;
		System.out.println("Multiplicacion : " +m);

	}
	
	public void division() {
		 System.out.println("Numero 1 : ");
		 a= reader.nextInt();
		System.out.println("Numero2 : ");
		b= reader.nextInt();
		
		d=a/b;
		System.out.println("Division : " +d);

	}
	
	

}
