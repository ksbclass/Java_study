package test;

import java.util.Scanner;

/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	
 
*/
public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("삼각형의 높이를 입력하세요 : ");
		int len = scan.nextInt();
		int bottom = len * 2 - 1; // 바닥부터 한개씩 줄어들기
		int data = 0; //출력할 숫자의 시작 값
		for(int i=bottom;i>=1;i-=2) {
			data += i;
		}
		// * 로 이등변 삼각형 출력 알거리즘
		int m = bottom/2;
		for(int i=0;i < len;i++) {
			for(int j=0;j<bottom;j++) {
				if(j>=m-i && j<=m+i)
//					System.out.print(data--+"\t");
					System.out.printf("%4d",data--); 
				// %4d : 출력서식 문자. %nd : n자리를 확보해서 10진 정수 출력. n은 최소 자리를 확보
				else
//					System.out.print("\t");
					System.out.printf("%4c",' ');
				// %4c :%nc : n자리를 확보해서 n자리만큼 문자 출력
				// %4s :%ns : n자리를 확보해서 문자열 출력 무조건 printf
			}
			System.out.println();
		}

	
	}
}