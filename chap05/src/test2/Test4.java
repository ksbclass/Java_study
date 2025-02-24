package test2;

import java.util.Scanner;

/*
 [결과]
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>1
학생수>5
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>2
scores[0]>100
scores[1]>50
scores[2]>80
scores[3]>75
scores[4]>95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>3
scores[0]:100
scores[1]:50
scores[2]:80
scores[3]:75
scores[4]:95
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>4
최고 점수:100
평균 점수:80.0
--------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
--------------------
선택>5
프로그램 종료
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = null;
		int y=0;
		while(true) {
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------");
			System.out.print("선택 > ");
			int x=scan.nextInt();
			switch(x) {
			case 1 :System.out.print("학생수 > ");
					y=scan.nextInt();
					scores=new int[y];
					break;
			case 2 : for(int i =0; i<y;i++) {
				System.out.print("scorese["+(i)+"] : ");
				scores[i]=scan.nextInt();
					}break;
			case 3 : for(int i =0; i<y;i++) {
				System.out.println("scorese["+(i)+"] : "+scores[i]);
					}break;
			case 4 : int s = scores[0];
					 int t = 0;
					 for(int score : scores) {
						 if(score> s)s=score;
						 t+=score;
					 }
					 double a=(double)t/y;
					 System.out.println("최고의 점수 : "+s);
					 System.out.println("평균 점수: "+t/y);
					 break;
			case 5 : System.out.println("프로그램 종료");
					 return;
			default : System.out.println("잘못된 선택입니다.");
			}
		}
	}
}