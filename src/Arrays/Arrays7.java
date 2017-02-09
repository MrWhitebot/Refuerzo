package Arrays;

import java.util.Scanner;

public class Arrays7 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce 20 caracteres: ");
		char[] x = new char[5];
		char[] z =x;
		int index = 0;
		for (int i = 0; i < x.length; i++) {
			x[i] = reader.next().charAt(0);

		}
		for(int i=0;i<x.length;i++){
                if(x[i]==z[i]){
                    index++;
		}
		}
		System.out.println(index);

	}

	}

