package StringAssignment;

import java.util.Scanner;

public class CountSpecialCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char a[] = (s.toLowerCase()).toCharArray();
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			if(c=='!'||c=='@'||c=='#'||c=='$'||c=='*')
				count++;
		}
		
		System.out.println("Number of special Character : "+count);

	}

}
