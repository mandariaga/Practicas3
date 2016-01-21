package org.rima.practicas3;

public class Prueba {

	public static void main(String[] args) {
		// USO DE PALABRA RESERVADA "STATIC", se puede aplicar tanto a variables,
		//constantes o m�todos; cuando se aplica quiere decir que esa variable, 
		//constante o m�todo, se convierte en una constante, variable o m�todo de Clase
		
		Empleados trabajador1=new Empleados("Juan");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Pedro");
		Empleados trabajador4=new Empleados("Nicol�s");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()
		+"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dimeIdSiguiente());
	}

}

class Empleados{
	public Empleados(String nom){
		nombre=nom;
		seccion="Administraci�n";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	public void cambiaSeccion(String seccion){ //setter
		this.seccion=seccion;
	}
	public String devuelveDatos(){ //getter
		return "El nombre es: "+nombre+" la secci�n es "+seccion+" y el Id="+Id;
	}
	public static String dimeIdSiguiente(){
		return "El IDSiguiente es: "+IdSiguiente;
		
	}
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
}
