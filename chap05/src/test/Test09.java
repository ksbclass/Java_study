package test;

import java.util.Scanner;

/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int s=num;
		int r=0;
		while(num!=0) {
			int d=num %10;
			r=r*10+d;
			num/=10;
		}
		if(s==r) {
			System.out.print(s+" : 대칭수");
		}else {
			System.out.print(s+ ": 대칭수 아님");
		}

		System.out.println("숫자를 입력하세요");
		int tmp = num;  //0
		int result = 0; //입력받은 수의 반대방향 수
		// result  : 0
		// tmp =123
		while(tmp != 0) {   
			result *=10;   
			result += tmp %10;   
			tmp /= 10; 
		}
		if(num == result) {
			System.out.println(num + ": 대칭수");
		} else {
			System.out.println(num + ": 대칭수 아님");
		}
		//2번째
		String snum = ""+num; //문자열 형태로 변경 123
		char[] arr = snum.toCharArray(); //문자열 배열
		int num1=arr[0]-'0'; //원래수
		int num2=arr[arr.length-1]-'0'; //역순의 수
		for(int i=1;i<arr.length;i++) {
			num1 *= 10;
			num1 += arr[i]-'0';		
		}
		for(int i=arr.length-2;i>=0;i--) {
			num2 *= 10;
			num2 += arr[i]-'0';		
		}
		if(num1 == num2) 
			System.out.println(num + ": 대칭수");
		else
			System.out.println(num + ": 대칭수 아님");
		
		StringBuilder sb =new StringBuilder(snum);
		String s2 =sb.reverse().toString();
		if(snum.toString().equals(s2)) {
			System.out.println(num + ": 대칭수");
		}else
			System.out.println(num+ ": 대칭수 아님");
		
	
	}
}