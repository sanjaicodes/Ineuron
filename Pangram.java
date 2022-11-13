//A string is a pangram string if it contains all the character of the 
//alphabets ignoring the case of the alphabets
package StringAssignment;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char a[] = (s.toLowerCase()).toCharArray();
	
		for(char i = 'a';i<='z';i++) {
			int c = 0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					c++;
					break;
				}
			}
			if(c==0) {
				System.out.println("Not Pangram");
				return;
			}
		}
		System.out.println("Pangram");
	}

}
