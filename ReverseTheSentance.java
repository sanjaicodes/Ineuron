//WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”

package StringAssignment;

import java.util.Scanner;

public class ReverseTheSentance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		sc.close();
		String s2 = s1.toLowerCase();
		String sarray[] = s2.split(" ");
		
		for(int i = 0;i<sarray.length;i++) {
			char a[] = sarray[i].toCharArray();
			for(int j = a.length-1;j>=0;j--) {
				System.out.print(a[j]);
			}
			System.out.print(" ");
		}

	}

}
