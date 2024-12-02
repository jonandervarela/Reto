package principal;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Para introducir al usuario con el teclado
		Scanner teclado = new Scanner(System.in);
		// Declaramos random para el numero aleatorio
		Random numRandom = new Random();

		// Declaramos las variables necesarias
		int numAleatorio, numMin, numMax, num = 0, oportunidades, rango, intentos, intento;

		/*
		 * Se mete en un do while por si el usuario pone que el numero maximo es menor
		 * al numero minimo hacerle que vuelva a introducir los numeros poniendole en el
		 * mensaje que no puede hacer eso
		 */
		do {
			// Preguntar al usuario el numero maximo y el minimo
			System.out.println("Introduce el numero mínimo: ");
			numMin = teclado.nextInt();

			System.out.println("Introduce el numero máximo: ");
			numMax = teclado.nextInt();

			if (numMin > numMax) {
				System.out.println("El número mínimo no puede ser mayor que el número máximo.");
			}

		} while (numMin >= numMax);

		// Ponemos la formula para que se genere el numero aleatorio entre los dos
		// numeros que nos ha dado el usuario
		numAleatorio = numRandom.nextInt((numMax - numMin) + 1) + numMin;
		// Ponemos la formula del rango
		rango = numMax - numMin + 1;
		/*
		 * Ponemos las oportunidades dependiendo del rango entre el numero minimo y el
		 * maximo y le mostramos el mensaje de las oportunidades que tiene
		 */
		if (rango <= 10) {
			oportunidades = 4;
		} else if (rango <= 50) {
			oportunidades = 6;
		} else {
			oportunidades = 9;
		}

		System.out.println("Tienes " + oportunidades + " oportunidades para adivinar el número.");

		intentos = 0;
		intento = intentos + 1;
		// Introducimos el while para que haga el bucle de dentro si todavia le quedan
		// oportunidades y si no ha acertado el numero
		while (intentos < oportunidades && num != numAleatorio) {
			intento = intentos + 1;
			System.out.print("Introduce tu intento" + intento + ": ");
			num = teclado.nextInt();
			intentos++;
			// Le mostramos un mensaje dependiendo si ha acertado el numero o le decimos si
			// el numero es mayor o menor
			if (num == numAleatorio) {
				System.out.println("Numero correcto. Has utilizado " + intentos + " intentos.");
			} else if (num < numAleatorio) {
				System.out.println("El número es mayor");
			} else {
				System.out.println("El número es menor");
			}
			// Le mostramos el mensaje cuando haya alcanzado el limite de oportunidades
			if (intentos == oportunidades && num != numAleatorio) {
				System.out.println("Has alcanzado el limite de oportunidades. El número era " + numAleatorio);
			}

		}
		teclado.close();
	}

}
