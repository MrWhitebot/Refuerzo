package String2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner array = new Scanner(System.in);
		System.out.println("Introduce tu String: ");
		String cadena = array.nextLine();
		int i = 0;
		cadena = cadena.toLowerCase();
		while (i < cadena.length()) {

			if (cadena.charAt(i) != 'a' && cadena.charAt(i) != 'e' && cadena.charAt(i) != 'i' && cadena.charAt(i) != 'o'
					&& cadena.charAt(i) != 'u') {

				System.out.print(cadena.charAt(i));

			}
			i++;
		}

	}
}
