package org.rima.practicas3;
import java.util.*;
public class Uso_Enum {

	//enum Talla {MINI, MEDIANA, GRANDE, MUY_GRANDE};
	enum Talla{  //Es una variable objeto de tipo ENUM que permite almacenar un grupo
				//de valores y solo se podr� almacenar ese grupo de valores y ning�n otro
		MINI("S"), MEDIANA("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private Talla(String abreviatura){
			this.abreviatura=abreviatura;
		}
		public String dimeAbreviatura(){
			return abreviatura;
		}
		private String abreviatura;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingresa una talla: MINI, MEDIANA, GRANDE, MUY_GRANDE");
		String entrada_datos=entrada.next().toUpperCase(); //M�todo TOUPPERCASE pasa a 
											//may�scula lo ingresado en min�scula
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos); //El m�todo "valueOf"
							//devuelve el nombre de la constante enumerada
		System.out.println("Talla="+la_talla);
		System.out.println("Abreviatura:"+la_talla.dimeAbreviatura());
	}

}
