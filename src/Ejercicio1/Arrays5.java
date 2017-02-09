package Ejercicio1;

import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		String letras[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W","X", "Y", "Z" };
		System.out.println("Intruce una posición: ");
		int posicion = abc.nextInt();
		while (posicion != -1) {
			if (posicion >= 27) {
				System.out.println("Error");
			} else if (posicion <= 26) {
				System.out.println(letras[posicion]);
			} else if (posicion == -1) {
				break;
			}
			posicion = abc.nextInt();
		}
	}
}
