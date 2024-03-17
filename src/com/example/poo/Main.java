package com.example.poo;

public class Main {
	
	public static void main(String[] args) {
		
		
		FiguraGeometrica figura = new FiguraGeometrica();
		
		
		Rectangulo figura1 = new Rectangulo(5,2);
		
		Cuadrado figura2 = new Cuadrado(8);
		
		System.out.println("Area de figura : "+figura.calcularArea());
		System.out.println();
		
		System.out.println("Area de figura 1: "+figura1.calcularArea());
		System.out.println();
		
		System.out.println("Area de figura2: "+figura2.calcularArea());
		
		
		
		
		
		
	}

	

}
