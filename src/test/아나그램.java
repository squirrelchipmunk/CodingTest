package test;

import java.util.Arrays;

public class 아나그램 {

	public static boolean isAna(String str1, String str2) {
		str1 = str1.replace(" ", "");
		str2 = str1.replace(" ", "");
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char [] charArr1 = str1.toCharArray();
		char [] charArr2 = str1.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		str1 = String.valueOf(charArr1);
		str2 = String.valueOf(charArr2);
		
		return str1.equals(str2);
	}
	
	public static void main(String[] args) {
		System.out.println(isAna("ab c  d","b   a c d"));
		
		
	}
}
