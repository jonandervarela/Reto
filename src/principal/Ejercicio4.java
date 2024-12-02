package principal;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;
		char opc = 0;
		// caso mcd
		int mayor;
		int mcd = 0;
		// caso mcm
		int mcm = 0;

		// caso factorial
		int i;
		int j;
		int f1;
		int f2;
		// caso div
		float div;
		// vars expo
		int ex = 1;

		// Un bucle para el menu, mientras que la opcion no sea "F", se repita y nos
		// muestre el menu
		// al terminar los procesos de cualquier otra opcion
		do {

			System.out.println("---Menu---------------");

			// bucle para pedir un numero que sea mayor que 0
			do {
				System.out.println("Introduce el primer numero, tiene que ser mayor o igual que 0");
				num1 = teclado.nextInt();
			} while (num1 < 0);

			// bucle para pedir un numero que sea mayor que 0
			do {
				System.out.println("Introduce el segundo numero, tiene que ser mayor o igual que 0");
				num2 = teclado.nextInt();
			} while (num2 < 0);

			System.out.println("a) MCD(Maximo comun divisor) ");
			System.out.println("b) MCM(minimo comun multiplo)");
			System.out.println("c) Factorial de ambos");
			System.out.println("d) División");
			System.out.println("e) Elevar el primer número al segundo sin usar la libreria Math");
			System.out.println("f) Salir");

			// introducir el valor de opc, para que siempre sea minuscula
			opc = teclado.next().toLowerCase().charAt(0);

			switch (opc) {
			case 'a':
				// Un if para definir que numero es el mayor
				if (num1 > num2) {
					mayor = num1;
				} else {
					mayor = num2;
				}
				// bucle para buscar el maximo comun divisor
				for (int cd = 1; cd <= mayor; cd++) {
					if (num1 % cd == 0 && num2 % cd == 0) {
						mcd = cd;
					}
				}
				System.out.println("El maximo comun divisor es : " + mcd);
				break;

			case 'b':
				// un if para definir que numero es el mayor
				if (num1 > num2) {
					mcm = num1;
				} else {
					mcm = num2;
				}
				// bucle para buscar el minimo comun divisor
				while (mcm % num1 != 0 || mcm % num2 != 0) {
					mcm++;
				}
				System.out.println("El mcm es : " + mcm);
				break;

			case 'c':
				f1 = 1;
				f2 = 1;
				// comprobar si el factorial es 0, ya que si es 0, siempre sera 1
				if (num1 == 0) {
					System.out.println("El factorial del primer numero es : " + f1);
				} else {
					for (i = 1; i < num1; i++) {
						f1 = i * f1;
					}
					f1 = f1 * num1;
					System.out.println("El factorial del primer numero es : " + f1);
				}
				// comprobar si el factorial es 0, ya que si es 0, siempre sera 1
				if (num2 == 0) {
					System.out.println("El factorial del segundo numero es : " + f2);
				} else {
					for (j = 1; j < num2; j++) {
						f2 = j * f2;
					}
					f2 = f2 * num2;
					System.out.println("El factorial del primer numero es : " + f2);
				}

				break;

			case 'd':
				if (num1 == 0 || num2 == 0) {
					System.out.println("No se puede dividir entre 0");
				} else {
					div = (float) num1 / num2;
					System.out.println("El resultado de la division es " + div);
				}
				break;

			case 'e':
				// iniciamos variable aqui para que se sustituya cada vez que entramos a esta
				// opcion
				ex = 1;
				if (num2 > 0) {
					for (int k = 0; k < num2; k++) {
						ex = ex * num1;
					}
					System.out.println("El resultado del exponente es : " + ex);
				} else {
					System.out.println("El resultado es 1");
				}

				break;

			case 'f':
				System.out.println("Adios");
				break;

			default:
				System.out.println("La opcion introducida no es valida");
				break;
			}

		} while (opc != 'f');
		teclado.close();
	}
}
