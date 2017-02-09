package Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
	@SuppressWarnings("resource")
	public static void main(String[] ARGS)
	{
		int[] myList = new int[10];
		Scanner obtenerNumero = new Scanner(System.in);
		System.out.println("Introduce Valores: ");

		int i, max, min;

		for(i = 0; i < myList.length; i++)
		{
		myList[i]=obtenerNumero.nextInt();
		}
		
		min=myList[0];
		max=myList[0];

		for(i = 0; i < myList.length; i++)
		{
			
			if(min>myList[i])
			{
				min=myList[i];
			}
			if(max<myList[i])
			{
				max=myList[i];
			}
		}

		System.out.println("Result is :"+(max*min));
	}
}
//	public static void main(String args[]) {
//		 Scanner scanner=new Scanner(System.in);   
//		 int sum=0;   
//		 int a[] = new int[10]; 
//		 int max=0,min=0; 
//		 System.out.println("Enter elements of array :");  
//		  for(int i=0;i<10;i++)  
//		    {  
//		      a[i]=scanner.nextInt();  
// 
//		      }
//		  Arrays.sort(a);
//		  min= a[0];
//		  max= a[9];
//		  
//		     
//		    System.out.println("Result is :"+(max*min)); 
//	}
//
//}