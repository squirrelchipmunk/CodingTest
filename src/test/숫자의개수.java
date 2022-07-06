package test;

import java.util.Scanner;

public class 숫자의개수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		String result = (long)(a*b*c)+"";
		
		int[] numArr = new int[10];
		
		// <48>:0 ~ <57>:9
		for(int i=0; i<result.length(); i++) {
			int num = result.charAt(i)-48;
			numArr[num]++;
		}


		for(int num : numArr) {
			System.out.println(num);
		}
		

		sc.close();
	}

}
