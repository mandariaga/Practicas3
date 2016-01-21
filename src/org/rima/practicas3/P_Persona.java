package org.rima.practicas3;

public class P_Persona {
	//datos miembro donde se guarda la información de una persona
	private String rut;
	private String nombre;
	private long telefono;
	//métodos de acceso a los datos
	public void setRut(String r){
		rut=r;
	}
	public String getRut(){
		return rut;
	}
	public void setNombre(String n){
		nombre=n;
	}
	public String getNombre(){
		return nombre;
	}
	public void setTelefono(long t){
		telefono=t;
	}
	public long getTelefono(){
		return telefono;
	}

}
