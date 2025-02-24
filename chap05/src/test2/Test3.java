package test2;
/*
 * int[][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}
		}; 
 * score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.
 * score 배열의 내용을 result에 저장하고,
 * 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기
 * 
 * [결과]
   90   80   70  240
   95   85   75  255
   70   80   75  225
   75   70   85  230
   70   75   80  225
  400  390  385 1175
 */
public class Test3 {
	public static void main(String[] args) {
		 int[][] score = {
					{90,80,70},
					{95,85,75},
					{70,80,75},
					{75,70,85},
					{70,75,80} 
					}; 
		 int x=score.length;
		 int y =score[0].length;
		 int[][] result=new int[x+1][y+1];
		 for(int i =0;i<x;i++) {
			 int sum=0;
			 for(int j = 0;j<y;j++) {
				 result[i][j]=score[i][j];
				 sum+=score[i][j];
				 result[i][y]+=score[i][j];
				 result[x][j]+=score[i][j];
				 result[x][y]+=score[i][j];
			 }
			 result[i][y]=sum;
		 }
		 for(int[] ar : result) {
			for(int a : ar) {
				System.out.printf("%5d",a);
		}
				System.out.println();
		 }
	}
}