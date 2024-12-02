package principal;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		char opc;
		String nom;
		float fn;
		float fci;
		float fd;
		float res;
		float mr = 0;
		String nomGuard = null;

		// bucle para que siempre me pida atletas hasta que ya no quiera introducir más
		do {
			System.out.println("Introduce el nombre del atleta: ");
			nom = teclado.next();

			System.out.println("Introduce la frecuencia natural: ");
			fn = teclado.nextFloat();

			System.out.println("Introduce la frecuencia despues de una carrera intensa: ");
			fci = teclado.nextFloat();

			System.out.println("Introduce la frecuencia de descanso: ");
			fd = teclado.nextFloat();

			// formula para calcula la recuperacion del atleta
			res = ((fci - fd) * 100) / fn;
			System.out.println("El atleta " + nom + " tuvo una recuperacion del :" + res);

			if (res >= 100) {
				System.out.println("Atleta en excelente condición");
			} else if (res >= 60 && res <= 99) {
				System.out.println("Atleta en buena condición, pero necesita mejorar");
			} else {
				System.out.println("Atleta en mala condición, requiere atención médica");
			}

			if (res > mr) {
				nomGuard = nom;
				mr = res;
				res = 0;
			}

			// preguntar si quiero introducir otro atleta o no, luego un bucle para
			// comprobar si la respuesta
			// es Si o no, asi mismo definimos la variable 'opc' para poder salir del bucle
			// principal
			System.out.println("Quieres introducir otro atletas(S/N) : ");
			opc = teclado.next().toUpperCase().charAt(0);
			while (opc != 'S' && opc != 'N') {
				System.out.println("introduce S(Si) o N(No)");
				opc = teclado.next().toUpperCase().charAt(0);
			}

		} while (opc == 'S');

		System.out.println("El nombre del atleta " + nomGuard);
		System.out.println("Con recuperacion de : " + mr);
		teclado.close();
	}

}
