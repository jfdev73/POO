package com.example.poo;

public class Alumno extends Persona{
	
	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	@Override
	public String toString() {
		return matricula;
	}
	
	
	

}
