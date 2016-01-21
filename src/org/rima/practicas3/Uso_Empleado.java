package org.rima.practicas3;
import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Empleado empleado1=new Empleado("Juan Blanco", 400000, 1930, 03, 21);
		Empleado empleado2=new Empleado("Ester Madariaga", 800000, 1945, 12, 9);
		Empleado empleado3=new Empleado("Esmeralda Miranda", 100000, 1905, 06, 14);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dime_nombre()+" Sueldo $ "+empleado1.dime_sueldo()
						+" Fecha de ingreso "+empleado1.dime_fecha_contrato());
		System.out.println("Nombre: "+empleado2.dime_nombre()+" Sueldo $ "+empleado2.dime_sueldo()
		+" Fecha de ingreso "+empleado2.dime_fecha_contrato());
		System.out.println("Nombre: "+empleado3.dime_nombre()+" Sueldo $ "+empleado3.dime_sueldo()
		+" Fecha de ingreso "+empleado3.dime_fecha_contrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Cesar", 900000, 2000, 07, 29);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Juan", 400000, 1930, 03, 21);
		misEmpleados[1]=new Empleado("Ester", 800000, 1945, 12, 9);
		misEmpleados[2]=new Empleado("Esmeralda", 100000, 1905, 06, 14);
		misEmpleados[3]=new Empleado("Nicolás");
		misEmpleados[4]=jefe_RRHH;  //Polimorfismo en acción. Principio de sustitución
		misEmpleados[5]=new Jefatura("Pedro", 2000000, 2010, 6, 1);
		
		Jefatura Jefa_Finanzas=(Jefatura) misEmpleados[5]; //CASTING O REFUNDICION
		
		Jefa_Finanzas.estableceIncentivo(3000);
		
		System.out.println(Jefa_Finanzas.tomar_decisiones("Dar más días de vacaciones"));
		
		System.out.println("El Jefe "+Jefa_Finanzas.dime_nombre()+" tiene un bonus de: "+
		Jefa_Finanzas.estable_bonus(500));
		
		System.out.println(misEmpleados[3].dime_nombre()+" tiene un bono de: "+
		misEmpleados[3].estable_bonus(200));

		/*for(int i=0;i<3;i++){
			misEmpleados[i].subeSueldo(5);
		}*/
		for(Empleado e:misEmpleados){
			e.subeSueldo(5);
		}
		/*for(int i=0;i<3; i++){
			System.out.println("Nombre: "+misEmpleados[i].dime_nombre()
					+" Sueldo "+misEmpleados[i].dime_sueldo()
					+" Fecha inicio "+misEmpleados[i].dime_fecha_contrato());
		}*/
		Arrays.sort(misEmpleados); // Este método "sort", de la clase "Arrays" obliga a 
									//utilizar la interfaz "Comparable"
		
		for(Empleado e:misEmpleados){
			System.out.println("Nombre: "+e.dime_nombre()
					+" Sueldo "+e.dime_sueldo()  //ENLAZADO DINAMICO, el intérprete de Java sabe a qué método de la clase padre u sub clase tiene que llamar
					+" Fecha inicio "+e.dime_fecha_contrato());
		}
	}
}
class Empleado implements Comparable, Trabajadores{  // Uso de interfaz predefinida 
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
	
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
}
	public double estable_bonus(double gratificacion){
		return Trabajadores.bonus_base+gratificacion;
	}
	//SOBRECARGA DE CONSTRUCTORES
	public Empleado(String nom){
		this(nom, 30000, 2000, 01, 01);
		
	}
	public String dime_nombre(){  //GETTER
		return nombre;
	}
	//public final double dime_sueldo(){  AL AGREGAR FINAL AL METODO, IMPIDE QUE SEA 
										//POR OTRO METODO
	public  double dime_sueldo(){  //GETTER
		return sueldo;
	}
	public Date dime_fecha_contrato(){  //GETTER
		return altaContrato;
	}
	public void subeSueldo(double porcentaje){  //SETTER
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	public int compareTo(Object miObjeto){
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo){  //Se puede cambiar "sueldo" por "Id" u otro
			return -1;
		}
		if (this.sueldo>otroEmpleado.sueldo){
			return 1;
		}
			return 0;
		}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	}

 class Jefatura extends Empleado implements Jefes{ //Al agregar "FINAL" al comienzo a la clase Jefatura se
									//detiene la cadena de la herencia
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		super(nom, sue, agno, mes, dia);
	}
	public String tomar_decisiones(String decision){
		return "Un miembro de la dirección ha tomado la decisión de: "+decision;
	}
	public double establece_bonus(double gratificacion){
		
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	public void estableceIncentivo(double b){  //método setter
		incentivo=b;
	}
	public double dime_sueldo(){
		double sueldoJefe=super.dime_sueldo();
		return sueldoJefe + incentivo;
		
	}
	private double incentivo;
}
