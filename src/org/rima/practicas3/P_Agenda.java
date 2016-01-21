package org.rima.practicas3;
import java.util.*;
public class P_Agenda {
	//utiliza un hashtable para almacenar personas
	private Hashtable<String, P_Persona> tb=new Hashtable<String, P_Persona>();
	public boolean agregar(String r, String n, long t){
		//si la clave no existe, entonces crea el objeto persona y lo añade al hashtable,
		//utilizando el rut como clave
		if(!tb.containsKey(r)){
			P_Persona p=new P_Persona();
			p.setRut(r);
			p.setNombre(n);
			p.setTelefono(t);
			tb.put(r, p);
			return true;
		}
		else{
			return false;
		}
	}
	public boolean eliminar(String r){
		//si la clave existe, elimina la persona asociada
		if(tb.containsKey(r)){
			tb.remove(r);
			return true;
		}
		else{
			return false;
		}
	}
	public P_Persona recuperar(String r){
		if(tb.containsKey(r)){
			//devuelve la persona cuyo rut se indica
			return tb.get(r);
		}
		else{
			return null;
		}
	}
	public Enumeration<String> total(){
		return tb.keys();
	}

}
