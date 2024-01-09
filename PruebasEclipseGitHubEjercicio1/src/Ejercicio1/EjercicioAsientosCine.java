package Ejercicio1;

import java.util.Scanner;

public class EjercicioAsientosCine {

	public static void main(String[] args) {
		/*1.Sistema de Reserva de Asientos para Cine 
		 * 
   - Descripción: Crear un sistema de consola para reservar asientos en una sala de cine. 
   El programa debe mostrar una matriz que represente los asientos (libres y ocupados) y permitir al usuario seleccionar asientos para reservarlos.
   - Retos: Manejar correctamente la entrada del usuario, actualizar y mostrar el estado actual de los asientos, 
   y gestionar situaciones como asientos ya reservados o entradas inválidas.*/
		
		String asientos[][] = new String [10][10];
		for(int i=1; i<10; i++) {
			asientos[0][0]= String.valueOf(0);
			asientos[0][i]= String.valueOf(i);
			asientos[i][0]= String.valueOf(i);
		}
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				asientos[i][j]="L";
			}
			
		}
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
		Scanner sc = new Scanner(System.in);
		System.out.println("Pulse '1' para seleccionar un asiento o '0' para salir");
		int seleccionar = sc.nextInt();
		
		do {
			System.out.println("Introduzca el numero de asiento del 1 al 9 para seleccionar la fila.");
			int asientof = sc.nextInt();
			System.out.println("Introduzca el numero de asiento del 1 al 9 para seleccionar la columna.");
			int asientoc = sc.nextInt();
			asientos[asientof][asientoc]="O";
			for (int i = 0; i < 10; i++) {
	            for (int j = 0; j < 10; j++) {
	                System.out.print(asientos[i][j] + " ");
	            }
	            System.out.println();
	        }
			System.out.println("Pulse '1' para seleccionar un asiento o '0' para salir");
			seleccionar = sc.nextInt();
		} while (seleccionar ==1);
		System.out.println("Gracias por seleccionar sus asientos, disfrute la función.");
		
	}

}
