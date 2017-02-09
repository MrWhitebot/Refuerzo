package Ejercicio1;

import java.util.Scanner;

public class Arrays6 {
	static Scanner num = new Scanner(System.in);
	static int[] sexo = new int[10];
	static int[] laboral = new int[10];
	static int[] sueldo = new int[10];

	public static void main(String[] args) {

		System.out.println("Introduce los datos: ");
		for (int i = 0; i < sexo.length; i++) {
			System.out.println("Introduce el sexo (Masculino=1, Femenino=2): ");
			sexo[i] = num.nextInt();
			System.out.println("Trabaja(1) o no trabaja(2): ");
			laboral[i] = num.nextInt();
			System.out.println("Introduce el sueldo, 600-2000 (0 si no trabaja): ");
			sueldo[i] = num.nextInt();

		}

		System.out.println("Porcentaje de Hombres" + porcentajeHombres() + "%");
		System.out.println("Porcentaje de Mujeres" + porcentajeMujeres() + "%");
		System.out.println("Porcentaje de Hombres que trabajan" + PorHomTrab() + "%");
		System.out.println("Promedio de sueldos de los hombres: " + sueldosH());
		System.out.println("Promedio de sueldos de las mujeres: " + sueldosM());
	}

	public static float porcentajeHombres() {
		float iAux = 0;
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 1) {
				iAux++;
			}
		}
		iAux = iAux * 100 / sexo.length;
		return iAux;

	}

	public static float porcentajeMujeres() {
		float iAux2 = 0;
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 2) {
				iAux2++;
			}
		}
		iAux2 = iAux2 * 100 / sexo.length;
		return iAux2;
	}

	public static float PorHomTrab() {
		float iAux3 = 0;

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 1 && laboral[i] == 1) {
				iAux3++;
			}
		}
		iAux3 = iAux3 * 100 / sexo.length;
		return iAux3;
	}

	public static float PorMujTrab() {
		float iAux4 = 0;

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 2 && laboral[i] == 1) {
				iAux4++;
			}
		}
		iAux4 = iAux4 * 100 / sexo.length;
		return iAux4;
	}

	public static float sueldosH() {
		float iAux5 = 0;

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 1 && laboral[i] == 1 && sueldo[i] >= 600) {
				iAux5 += sueldo[i];
			}
		}
		iAux5 = iAux5 / laboral.length;
		return iAux5;
	}

	public static float sueldosM() {
		float iAux6 = 0;

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 2 && laboral[i] == 1 && sueldo[i] >= 600) {
				iAux6 += sueldo[i];
			}
		}
		iAux6 = iAux6 / laboral.length;
		return iAux6;
	}

}
