package String3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INTRODUCE TU TEXTO: ");
		String cadena = sc.nextLine();
		int x = cadena.length();
		System.out.println(x);
		if (x % 2 == 0) {
			String cadena2 = cadena.substring(x / 2);
			String cadena3 = cadena.substring(0, x / 2);
			System.out.print(cadena2 + " " + cadena3);
		} else if (x % 2 != 0) {
			String cadena4 = cadena.substring((x / 2) + 1);
			String cadena5 = cadena.substring(0, (x / 2));
			String cadena6 = cadena.substring((x / 2), (x / 2) + 1);
			System.out.println(cadena4 + cadena6 + cadena5);
		}
	}

}
