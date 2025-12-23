package arrays;

import java.util.Scanner;

//Find Max n min number form the given array

public class MaxAndMinNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int size = scan.nextInt();
		
		int number[]= new int[size];
		
		//input
		
		for(int i=0; i<size; i++) {
			number[i]=scan.nextInt();
			
		}
		int max= Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		for(int i=0; i<number.length; i++) {
			if(number[i]<min){
				min=number[i];
			
			}
			if(number[i]>max) {
				max=number[i];
				
			}
		}
		System.out.println("Max number is"+max);
		System.out.println("Min number is"+min);
		
	}
}
