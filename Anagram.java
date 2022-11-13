//WAP to check if the String is Anagram or not.
//input1 : dbca input : abcd
//output : Anagram
package StringAssignment;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		sc.close();
		char a[] = (s1.toLowerCase()).toCharArray();
		char b[] = (s2.toLowerCase()).toCharArray();
		
		if(a.length == b.length) {
			for(int i=0;i<a.length;i++) {
				int c = 0;
				for(int j=0;j<a.length;j++) {
					if(a[i]==b[j]) {
						c++;
						b[j] = '0';
						break;
					}
				}
				if(c==0) {
					System.out.println("Not Anagram");
					return ;
				}
			}
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}
}
