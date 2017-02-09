package String4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner car = new Scanner(System.in);
		System.out.println("_INTRODUCE TU CADENA_ ");
		String cadena = car.nextLine();
		String cadena2 = cadena.toLowerCase();
		int i = 0;

		if (!cadena2.equalsIgnoreCase("bob")&&cadena2.charAt(i) == 'b'&& cadena2.charAt(cadena2.length()-1)=='b') {
		     //IgnoreCase SIRVE PARA QUE NO IMPORTE SI SON MAYUSCULAS O MINUSCULAS 
				System.out.println("TRUE");
			}
		else if (cadena2.contains("bob")) {
					System.out.println("SUPER BOB");
				}
			
		 else {
				System.out.println("FALSE");
		    
		} 
		
}
	
	}

