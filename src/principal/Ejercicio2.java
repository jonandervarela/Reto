package principal;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Para introducir al usuario con el teclado
		Scanner teclado = new Scanner(System.in);

		// Declaramos todas las variables
		int trabajadores, diasTrabajados, tareasCompletadasDia, tareasExtras;
		double sueldoSemanal, valorTarea = 12.50, costoTotal = 0, sueldoSinBonus, sueldoMaxConBonus;

		// Pedimos el número de trabajadores
		System.out.println("Introduce el número de trabajadores: ");
		trabajadores = teclado.nextInt();

		// Bucle para preguntarle a cada trabajador
		for (int i = 0; i < trabajadores; i++) {
			sueldoSemanal = 0;
			sueldoSinBonus = 0;

			System.out.println("Trabajador " + (i + 1) + ":");

			// Pedimos el número de días trabajados del trabajador correspondiente
			System.out.println("Introduce el número de días trabajados: ");
			diasTrabajados = teclado.nextInt();

			// Bucle para las tareas competadas en el dia del trabajador que corresponda
			for (int x = 0; x < diasTrabajados; x++) {
				System.out.println("Introduce el número de tareas completadas en el día " + (x + 1) + ": ");
				tareasCompletadasDia = teclado.nextInt();

				// Hacemos los calculos necesarios para si el numero de tareas completadas son
				// mas de 10
				if (tareasCompletadasDia > 10) {
					tareasExtras = tareasCompletadasDia - 10;
					sueldoSinBonus = sueldoSinBonus + 10 * valorTarea;
					sueldoSinBonus = sueldoSinBonus + tareasExtras * valorTarea * 1.1;
				} else {
					sueldoSinBonus = sueldoSinBonus + tareasCompletadasDia * valorTarea;
				}
			}
			/*
			 * Hacemos los calculos dependiendo si el sueldo semanal total no excede un 25%
			 * del sueldo calculado sin el bonus Le damos a sueldoSemanal los valores
			 * correspondientes dependiendo si necesita o no el bonus
			 */

			sueldoMaxConBonus = sueldoSinBonus * 1.25;
			if (sueldoSinBonus <= sueldoMaxConBonus) {
				sueldoSemanal = sueldoSinBonus;
			} else {
				sueldoSemanal = sueldoMaxConBonus;
			}

			System.out.println("Sueldo semanal del trabajador " + (i + 1) + ": " + sueldoSemanal + " €");

			// Metemos esta operacion dentro del bucle para que guarde el sueldo de cada
			// trabajador y los vaya sumando
			costoTotal = costoTotal + sueldoSemanal;
		}

		System.out.println("El costo total para la empresa es: " + costoTotal + " €");

		teclado.close();
	}
}