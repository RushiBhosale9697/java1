
package Exam;

public class StringOccurance {

	public static void main(String[] args) {

		String ab="YIGUAJBugeasuijk84651320";
		
		for (char i='A';i<='Z';i++) {
			int count=0;
			for (int j=0;j<ab.length();j++) {
				if(ab.charAt(j)==i) {
					count=count+1;
				}
				if(count>0) {
					System.out.print(i+"="+count);
				}
			}
		}
	}

}

