package Exam;

import java.util.Scanner;

public class Square  {

	public static void main(String[]args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Starting no=");
	
	int start_no=sc.nextInt();

	System.out.println("Enter the end no=");
		int end_no=sc.nextInt();

	int i,j,square=0;
	
	for(i=start_no;i<=end_no;i++){
		
		for(j=start_no;j<=end_no;j++){
	
	if(i==j) {
	square=(i*j);
}}
	System.out.println(i+"="+square);

}
	}
}