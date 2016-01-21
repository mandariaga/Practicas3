package org.rima.practicas3;

public class Coche { 
	
	private int ruedas, largo, ancho, motor, peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	// TODAS LAS PROPIEDADES ESTAN ENCAPSULADOS PARA QUE SOLO ES POSIBLE ACCEDER A 
	//MODIFICARLAS A TRAVES DE LOS METODOS
	
	public Coche(){  //Método Constructor, tiene el mismo nombre de la clase y se encarga
					// de dar un estado inicial a los objetos
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso_plataforma=500;
				
	}
	public String dime_datos_generales(){  //METODO GETTER, función devolver el valor
											// de las propiedades de los objetos
		return "La plataforma del vehiculo tiene "+ruedas+" ruedas"+". Mide "+largo/100+
				" metros con un ancho de "+ancho+" cm y un peso de plataforma de "+
				peso_plataforma+" kg";
	}
	public void establece_color(String color_coche){  //METODO SETTER, debe recibir 
													  //un parámetro 
												      //"color_coche" de tipo String
		color=color_coche;
	}
	public String dime_color(){  //METODO GETTER
		return "El color del coche es "+color;
	}
	public void configura_asientos(String asientos_cuero){  //METODO SETTER, función
										//modificar el valor de las propiedades de un
										//objeto
		if(asientos_cuero.equalsIgnoreCase("si")){
			this.asientos_cuero=true;
		}else{
			this.asientos_cuero=false;
		}
		
	}
	public String dime_asientos(){  //METODO GETTER
		//La línea siguiente debiera ser asi: if(asientos_cuero){ ya que el interprete de 
		//Java entiende que esa variable es TRUE. Esto ocurre siempre con variables BOOLEAN
		if(asientos_cuero==true){
			return "El vehiculo tiene asientos de cuero";
		}else{
			return "El vehículo tiene asientos de serie";
		}
	}
	public void configura_climatizador(String climatizador){ // SETTER
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	public String dime_climatizador(){ //GETTER
		if(climatizador==true){
			return "El vehiculo tiene aire acondicionado";
		}else{
			return "El vehículo no tiene aire acondicionado";
		}
	}
	public String dime_peso_coche(){  // GETTER + SETTER, no se recomienda ambos
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true){
			peso_total=peso_total+50;
		}
		if(climatizador==true){
			peso_total=peso_total+20;
		}
		return "El peso del coche es "+peso_total;
	}
	public int dime_precio(){			//GETTER
		int precio_final=10000;
		if(asientos_cuero==true){
			precio_final+=2000;
		}
		if(climatizador==true){
			precio_final+=1500;
		}
		return precio_final;
	}

}
