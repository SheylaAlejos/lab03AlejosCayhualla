package com.tecsup.lab03.controller;
import java.util.Scanner;
public class Responsable {

Scanner reader = new Scanner(System.in);
	int a=0;
	int b=0; 
	int suma;
	int resta;

 public void suma(){
	 System.out.println("Numero 1:");
	 a = reader.nextInt();
	 System.out.println("Numero 2:");
	 b = reader.nextInt();
	 suma=a+b;
	 
	 System.out.println("La suma es " +suma);

 }
 public void resta() {
	
	 resta=a-b;
	 System.out.println("Numero 1:");
	 a = reader.nextInt();
	 System.out.println("Numero 2:");
	 b = reader.nextInt();
	 resta=a-b;
	 System.out.println("La resta es " +resta);
 }
 
}