package Ejercicio1;

import java.util.Scanner;

public class Arrays2 {

@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int a[] = new int[10];
		System.out.println("Introduce los elementos del Array:");
		for (int i = 0; i < 10; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {

			sum += a[i];

		}

		System.out.println("La suma de los elementos del array es: " + sum);
	}

}
