package com.example.poo;

public class Persona extends Object {
	
	private String nombre;
	
	private String apellido;
	
	private int edad;
	
	
	public Persona (){
		this.nombre = "Este mi nombre por default";
		this.apellido = "Este mi apellido por default";
		this.edad = 10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Persona (String nombre, String apellido) {
		this.nombre = nombre; 
		this.apellido = apellido;
	}

	
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public String getNombreCompleto() {
		return this.nombre +" "+ this.apellido;
	}





	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public String getNombreCompleto() { return this.nombre + this.apellido; }
	 * 
	 * public String getNombre() { return nombre; }
	 * 
	 * public void setNombre(String nombre) { this.nombre = nombre; }
	 * 
	 * public String getApellido() { return apellido; }
	 * 
	 * public void setApellido(String apellido) { this.apellido = apellido; }
	 * 
	 * public int getEdad() { return edad; }
	 * 
	 * public void setEdad(int edad) { this.edad = edad; }
	 */
	
	
	

}
