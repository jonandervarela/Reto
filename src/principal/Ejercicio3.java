package principal;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);
		
		int cant;
		int b500=0;
		int b200=0;
		int b100=0;
		int b50=0;
		int b20=0;
		int b10=0;
		int b5=0;
		int m2=0;
		int m1=0;
		
		
		System.out.println("Introduce un número entero");
		System.out.println("Introduce un número");
		cant=teclado.nextInt();
		
		//bucle para que el usuario introduzca siempre un valor entero positivo
		while(cant<=0) {
			System.out.println("Introduce un número entero positivo");
			cant=teclado.nextInt();
		}
		
		//Bucles para calcular la cantidad de monedas o billetes
		while(cant-500>=0) {
			cant=cant-500;
			b500++;			
		}
			
		while(cant-200>=0) {
			cant=cant-200;
			b200++;			
		}
		while(cant-100>=0) {
			cant=cant-100;
			b100++;			
		}
		while(cant-50>=0) {
			cant=cant-50;
			b50++;			
		}
		while(cant-20>=0) {
			cant=cant-20;
			b20++;			
		}		
		while(cant-10>=0) {
			cant=cant-10;
			b10++;			
		}
		while(cant-5>=0) {
			cant=cant-5;
			b5++;			
		}
		while(cant-2>=0) {
			cant=cant-2;
			m2++;			
		}
		while(cant-1>=0) {
			cant=cant-1;
			m1++;			
		}
			
		//Con estos ifs, solo mostramos las monedas o billetes que se usaron en la resta de "Cantidad"
		if(b500>0) {
			System.out.println("Billetes de 500 : "+b500);
		}
		if(b200>0) {
			System.out.println("Billetes de 200 : "+b200);
		}
		if(b100>0) {
			System.out.println("Billetes de 100 : "+b100);
		}
		if(b50>0) {
			System.out.println("Billetes de 50 : "+b50);
		}
		if(b20>0) {
			System.out.println("Billetes de 20 : "+b20);
		}
		if(b10>0) {
			System.out.println("Billetes de 10 : "+b10);
		}
		if(b5>0) {
			System.out.println("Billetes de 5 : "+b5);
		}
		if(m2>0) {
			System.out.println("Monedas de 2 : "+m2);
		}
		if(m1>0) {
			System.out.println("Monedas de 1 : "+m1);
		}
		teclado.close();
	}

}
