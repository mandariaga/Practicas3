package org.rima.practicas3;

import java.util.Scanner;

public class GesionPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//crea instancia de clase Pila indicando el tipo específico String
		Pila<String> p=new Pila<String>();
		//variable que almacena la opción elegida
		int op;
		do{
			System.out.println("1.Agregar cadena");
			System.out.println("2.Quitar cadena");
			System.out.println("3.Mostrar todas");
			System.out.println("4.Salir");
			//recupera directamente como número la opción elegida
			op=sc.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("Ingresa cadena");
				String s=sc.next();
				p.agregar(s);
				break;
			case 2:
				p.quitar();
				break;
			case 3:
				imprime(p);
			}
			
		}while (op!=4);
	}
	public static void imprime(Pila p){
		//recorre la Pila y muestra su contenido
		for(int i=0;i<p.total();i++){
			System.out.println(p.obtener(i));
		}
	}

}
