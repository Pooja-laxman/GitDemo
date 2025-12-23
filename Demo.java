package arrays;

import java.util.Scanner;

public class Demo {
	
  public static void main(String[] args) {
//	 	  int[] marks = new int[3];
//	 	  marks[0]=76;
//	 	  marks[1]=55;
//	 	  marks[2]=76;
	 	  
//	 	  System.out.println(marks[0]);
//	 	 System.out.println(marks[1]);
//	 	System.out.println(marks[2]);
	 	  
//	  (or)
	  
//	  int marks[]= {97,98,99};
//	  (or)
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Marks");
	  int size = sc.nextInt();
	  
	  int number[]= new int[size];
	  
	  //in put
	  for(int i=0;i<size; i++) {
		  number[i]=sc.nextInt();
	  }
	  
	  //output
	 	  for(int i=0; i<size; i++) {
	 		  System.out.println(number[i]);
	 	  }
//	
}
}
