package org.rima.practicas3;
import java.io.*;
import java.util.*;
public class P_Principal {

	public static void main(String[] args) 
								throws IOException{
		BufferedReader bf;
		int op;
		P_Agenda ag;
		bf=new BufferedReader(new InputStreamReader(System.in));
		ag=new P_Agenda();
		String r,n;
		long tel;
		do{
			System.out.println("1. Agregar persona");
			System.out.println("2. Buscar persona");
			System.out.println("3. Eliminar persona");
			System.out.println("4. Mostrar todas las persona");
			System.out.println("5. Salir");
			op=Integer.parseInt(bf.readLine());
			switch(op){
			case 1:
				System.out.println("Ingresa nombre");
				n=bf.readLine();
				System.out.println("Ingresa rut");
				r=bf.readLine();
				System.out.println("Ingresa telefono");
				tel=Long.parseLong(bf.readLine());
				if(ag.agregar(r, n, tel)){
					System.out.println("Persona se agrega correctamente");
			    }
				else{
					System.out.println("RUT repetido, la persona no se agrega");
					
				}
				break;
			case 2:
				System.out.println("Ingresa RUT");
				r=bf.readLine();
				P_Persona p=ag.recuperar(r);
				if(p!=null){
					System.out.println("Los datos son:");
					System.out.print("RUT:"+p.getRut()+" - ");
					System.out.print("Nombre:"+p.getNombre()+" - ");
					System.out.println("Teléfono:"+p.getTelefono());
				}
				break;
			case 3:
				System.out.println("Ingresa RUT");
				r=bf.readLine();
				if(ag.eliminar(r)){
					System.out.println("La persona ha sido eliminada");
				}
				else{
					System.out.println("Ese RUT no existe");
				}
				break;
			case 4:
				Enumeration<String> e=ag.total();
				while(e.hasMoreElements()){
					//se recuperar los rut uno a uno
					r=e.nextElement();
					//se pasa el rut al método recuperar para que de la persona
					P_Persona per=ag.recuperar(r);
					//imprime rut, nombre y teléfono
					System.out.println(per.getRut()+" - "+per.getNombre()+" - "+per.getTelefono());
				}
			}
		}while(op!=5);
}
}
