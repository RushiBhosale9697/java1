package StringHandling;

public class Comparisonoperator {

	public static void main(String[] args) {
		String str1="rushikesh";
		String str2="Rushikesh";
		String str3="RUSHIKESH";
		String str4="rushikesh";
		String str5="rushikesh bhosale";
		System.out.println(str1==str4);
		System.out.println(str2!=str3);
		System.out.println(str3==str1);
		System.out.println(str4==str1);//comparison method
		System.out.println(str1.equals(str2));//Using Equals()method
		System.out.println(str2.compareTo(str4));//using compareTo method
		System.out.println(str2.compareTo(str3));//using compareTo method
		System.out.println(str1.compareTo(str4));//using compareTo method
		System.out.println(str1.concat(str2));//concats method
		System.out.println(str1.charAt(5));//char at method =string 1 madhil 5 no cha character yenar
		System.out.println(str4.equalsIgnoreCase(str1));//in this method same nasel tar true
		System.out.println(str1.toUpperCase());//small letter convert in to capital
		System.out.println(str3.toLowerCase());//viceversa
		System.out.println(str1.trim());//space kadun takto
		System.out.println(str1.substring(4));//4 letter pasun pudh type hot
		System.out.println(str5.endsWith("bhosale") );//end kashame tya sathi
		System.out.println(str5.length());//total lenght
		}
	}
