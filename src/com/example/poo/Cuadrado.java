package com.example.poo;

public class Cuadrado extends FiguraGeometrica{
	
	private int lado;
	
	public Cuadrado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public int calcularArea() {
		return lado * lado;
		
	}
	
	

}
