package chap5;

import java.util.Scanner;

/*/
 * 배열의 행의 값을 입력받아 0으로 초기화된 배열 출력하기
 * 
 * [결과]
 * 배열의 행을 입력하세요 : 3
 * 0
 * 00
 * 000
 */
public class Exam06 {

	public static void main(String[] args) {
		System.out.print("배열의 행을 입력하세요 : ");
		Scanner scan =new Scanner(System.in);
		int row =scan.nextInt();
		int[] arr[] = new int[row][]; 
		for(int i=0; i<arr.length;i++) {
			arr[i]=new int[i+1];
		}
		for(int[] ar : arr) {
			for(int a :ar) {
				System.out.printf("%3d",a);
				}
			System.out.println();
			}
	}
}
