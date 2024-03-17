package com.example.poo;

public class FiguraGeometrica {
	
	private int perimetro;
	
	private int area;
	
	
	
	
	
	public int calcularArea() {
		return area;
		
	}
	
	public int calcularPerimetro() {
		return perimetro;
		
	}

	@Override
	public String toString() {
		return "Este es la implementacion de la clase padre";
	}
	
	public String texto() {
		return "Hola soy una figura geometrica y soy: ";
	}
	
	
	
	

}
