package com.test;

public class ProgramaExecutarElMeuNom {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElMeuNombre nombre1 = new ElMeuNombre (5);
		ElMeuNombre nombre2 = new ElMeuNombre (8);

		System.out.println("El nombre1 = " + nombre1.getNombre());
		System.out.println("El nombre2 = " + nombre2.getNombre());
		System.out.println("El nombre1 + nombre2 = " + nombre1.suma(nombre2).getNombre());
		System.out.println("El nombre1 - nombre2 = " + nombre1.resta(nombre2).getNombre());
		System.out.println("El nombre1 * nombre2 = " + nombre1.multi(nombre2).getNombre());
		System.out.println("El nombre1 / nombre2 = " + nombre1.div(nombre2).getNombre());

		}

	
}
