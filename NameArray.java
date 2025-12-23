package arrays;

import java.util.Scanner;
//Pass Name in the Array
public class NameArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number Name");
		int size= scan.nextInt();
		
		String name[]= new String[size];
		
		//input
		for(int i=0; i<size; i++) {
			System.out.println("Enter Name" +" "+i);
			name[i]=scan.next();
			
		}//output
		for(int i=0; i<name.length; i++) {
			System.out.println("name " + (i) +" is : " + name[i]);

		}
	}
}
