package org.rima.practicas3;

import java.util.ArrayList;

public class Pila <E>{
	//almacena la pila de objetos en un ArrayList
	private ArrayList<E> v=new ArrayList<E>();
	public void agregar(E s)
	{
		//si el objeto no existe, lo a�ade
		if(v.indexOf(s)==-1){
			v.add(s);
		}
	}
	public void quitar()
	{
		//elimina el �ltimo objeto ingresado
		v.remove(v.size()-1);
	}
	public E obtener(int p)
	{
		return v.get(p);
	}
	public int total()
	{
		//el tama�o de ArrayList determina el n�mero de elementos almacenados
		return v.size();
	}

}
