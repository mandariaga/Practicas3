package org.rima.practicas3;

public class Furgoneta extends Coche{
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int capacidad_carga, int plazas_extra){
		
		super(); //llama al constructor de la clase padre
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public String dimeDatosFurgoneta(){
		return "La capacidad de carga es: "+capacidad_carga+" Y las plazas son "+plazas_extra;
		
	}

}
