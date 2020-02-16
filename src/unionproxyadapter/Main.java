package unionproxyadapter;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		int opcion;
		entrada=new Scanner(System.in);
		
		do {
		System.out.println("Digite una opción.");
		System.out.println("1. Carro a gasolina.");
		System.out.println("2. Carro eléctrico.");
		System.out.println("3. Salir.");
		
		opcion=entrada.nextInt();
		
		Proxy miProxy=new Proxy(opcion);
		miProxy.doAction();
		
		System.out.println();
		
		}while(opcion!=3);
	}

}
