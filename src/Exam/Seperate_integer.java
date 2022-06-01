package Exam;

public class Seperate_integer {

	public static void main(String[] args) {
		String a = "Rushikesh123!@#"+"TDFIYUK,./';JHJLNB";
		
		System.out.println("Enter the Symbol are");
		for (int i=0;i<a.length();i++) {
			
			if((a.charAt(i)<='0')||(a.charAt(i)=='@')){
				
				char b=a.charAt(i);
				System.out.print(b);
			}
		}
		
		System.out.println("Enter the capital char are");
for (int j=0;j<a.length();j++) {
			
			if((a.charAt(j)>='A')&&(a.charAt(j)<='Z')){
				
				char b=a.charAt(j);
				System.out.print(b);
			}
		}
}}
