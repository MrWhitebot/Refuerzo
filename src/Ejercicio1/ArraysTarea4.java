package Ejercicio1;
import java.util.Scanner;
public class ArraysTarea4 {

	public static int countClumps(int[] nums) {
		int count = 0;
		for (int i=0; i<nums.length-1; i++){
			if(nums[i]==nums[i+1]){
				count++;
			}
			
		}
		return count;
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int[] nums = new int[5];
	System.out.println("Enter values into the array:");
	for (int i = 0; i < nums.length; i++)
	nums[i] = scanner.nextInt();
	System.out.println("Clumps:" + countClumps(nums));
	}
}

