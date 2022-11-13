//WAP to sort a String Alphabetically.
package StringAssignment;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char a[] = (s.toLowerCase()).toCharArray();
		
		for(char i = 'a';i<='z';i++) {
			for(int j=0;j<a.length;j++) {
				if(a[j] == i) {
					System.out.print(i);
				}
			}
		}
	}

}
