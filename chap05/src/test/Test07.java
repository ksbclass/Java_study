package test;
/*
삼각형의 높이를 입력하세요
3        i    j
*****    0    0~4
 ***     1    1~3
  *      2    2~2
 
 
 */

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 높이 : ");
		int h = scan.nextInt(); 
		for(int i = 0;i < h;i++) {
			for(int j = 0; j < i;j++) {
				System.out.print(" ");
			}
			for(int j =0; j<(2*(h-i))-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("삼각형의 높이를 입력하세요");
		int len = scan.nextInt();
		int bottom = len * 2 - 1; //  * 의 최대 갯수
		int m = bottom/2;
		for(int i=0;i<len;i++) { // 행은 0부터 len 까지 찍음
			for(int j=0;j<bottom - i;j++) { // 공백때문에 0 부터 시작
				if(j>=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	
	}
}