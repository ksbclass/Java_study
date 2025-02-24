package test2;
/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X□■□■□■□■□X
□X□■□■□■□X□
■□X□■□■□X□■
□■□X□■□X□■□
■□■□X□X□■□■
□■□■□X□■□■□
■□■□X□X□■□■
□■□X□■□X□■□
■□X□■□■□X□■
□X□■□■□■□X□
X□■□■□■□■□X

■ : ㅁ 한자
□ : ㅁ 한자
*/
public class Test6 {
	public static void main(String[] args) {
		int s = 11;
        char[][] arr = new char[s][s];

  
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i == j || i + j == s - 1) {
                    arr[i][j] = 'X';
                } else if ((i + j) % 2 == 0) {
                    arr[i][j] = '■'; 
                } else {
                    arr[i][j] = '□'; 
                }
            }
        }
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	}
}
