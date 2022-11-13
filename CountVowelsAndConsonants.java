//WAP to count the number of Vowels and Consonants of a String value.
package StringAssignment;

import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		char a[] = (s.toLowerCase()).toCharArray();
		int vowelcount=0,consonant_count=0;
		
		for(int i=0;i<a.length;i++) {
			char c = a[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				vowelcount++;
			else
				consonant_count++;
		}
		
		System.out.println("Vowels Count : "+vowelcount);
		System.out.println("Consonants Count : "+consonant_count);

	}

}
