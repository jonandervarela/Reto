package principal;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int num;
		int mult1;
		int mult2;
		int i;

		// Introducir el numero entra 50 y 350
		System.out.println("Introduce un número entre 50 y 350");
		num = teclado.nextInt();

		// Un bucle para que el usuario siempre introduzco un numero entrea 50 y 350, y
		// no otro fuera del rango
		while (num < 50 || num > 350) {
			System.out.println("Numero no valido, por favor introduce un número entre 50 y 350");
			num = teclado.nextInt();
		}

		// Introducir el primer numero
		System.out.println("Introduce un número entre 1 y 10");
		mult1 = teclado.nextInt();

		// Un bucle para que el usuario solo meta un numero del 1 al 10
		while (mult1 < 1 || mult1 > 10) {
			System.out.println("Numero no valido, por favor introduce un número entre 1 y 10");
			mult1 = teclado.nextInt();
		}

		// Introducir el segundo numero
		System.out.println("Introduce otro número entre 1 y 10");
		mult2 = teclado.nextInt();

		// Un bucle para que el usuario solo meta un numero del 1 al 10 y tambien sea
		// distinto del primero
		while ((mult2 < 1 || mult2 > 10) || mult2 == mult1) {
			System.out.println("Numero no valido, por favor introduce un número distinto del primero entre 1 y 10");
			mult2 = teclado.nextInt();
		}

		// Un bucle para mostrar los multiplos de los numeros introducidos que esten
		// entre 1 y el numero que introdujimos al inicio
		for (i = 1; i <= num; i++) {
			if (i % mult1 == 0 && i % mult2 == 0) {
				System.out.println(i);
			}
			teclado.close();
		}

	}

}
