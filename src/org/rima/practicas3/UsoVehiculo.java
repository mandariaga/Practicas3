package org.rima.practicas3;
//import javax.swing.*;
public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Coche Renault=new Coche(); //INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE.
		
		// System.out.println("El coche tiene "+Renault.ruedas+" ruedas");
		
		/*Coche micoche=new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Ingresa color")); 
										//Paso de parámetros,al método se debe 
										//ingresar un argumento de tipo String
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene A/A"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del vehículo es: "+micoche.dime_precio());*/
	
		Coche micoche1=new Coche();
		micoche1.establece_color("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(500, 7);
		mifurgoneta1.establece_color("Azul");
		mifurgoneta1.configura_asientos("Si");
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales()+" "+micoche1.dime_color());
		System.out.println(mifurgoneta1.dime_datos_generales()+" "+mifurgoneta1.dimeDatosFurgoneta());
		
	}

}
