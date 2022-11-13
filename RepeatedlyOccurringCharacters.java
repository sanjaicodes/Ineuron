//WAP to print repeatedly occurring characters in the given String.
package StringAssignment;

import java.util.Scanner;

public class RepeatedlyOccurringCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char a[] = (s.toLowerCase()).toCharArray();
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!='0') {
				int f = 0;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						f++;
						a[j] = '0';
					}
				}
				if(f>0)
					System.out.print(a[i]);
			}
		}
	}

}
