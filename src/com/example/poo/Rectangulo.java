package com.example.poo;

public class Rectangulo extends FiguraGeometrica{
	
	
	private int ancho;
	
	private int alto;
	
	

	public Rectangulo(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	
	@Override
	public int calcularArea(){
		return this.ancho * this.alto;
		
	}
	
	@Override
	public int calcularPerimetro() {
		return (this.ancho *2) + (this.alto*2);
		
	}


	@Override
	public String toString() {
		
		return super.texto() + "Rectangulo";
	}
	
	
	
	
	
	
	
	
	

}
