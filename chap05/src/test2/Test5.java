package test2;
/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X         X
 X       X
  X     X 
   X   X  
    X X   
     X    
    X X   
   X   X  
  X     X 
 X       X
X         X
 
*/
public class Test5 {
	public static void main(String[] args) {
		 int a= 11;
	        int[][] g = new int[a][a];
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < a; j++) {
	                g[i][j] = (i == j || i + j == a - 1) ? 1 : 0;
	            }
	        }
	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < a; j++) {
	            	System.out.print(g[i][j] == 1 ? "X" : " ");
	            }
	            System.out.println();
	        }

	}
}