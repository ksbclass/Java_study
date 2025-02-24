package chap5;
/*
 *  str 문자열에 저장된 소문자의 갯수 출력하기
 */
public class Exam03a {
	public static void main(String[] args) {
		String str = "public static void main(String[] args)";
//		char[] a = str.toCharArray();
		int[] c=new int[26];
/*		for(int i =0; i<a.length;i++) {
			char ch =a[i];
			if(ch>= 'a' && ch<='z') {//소문자
				c[ch-'a']++;
			}
		}
		for(int i = 0; i<c.length;i++) {
			System.out.println((char)(i+'a')+ " : " + c[i]);
		}
*/	
		for(int i =0; i<str.length();i++) {
		char ch =str.charAt(i);
		if(ch>= 'a' && ch<='z') {//소문자
			c[ch-'a']++;
			}
		}
		for(int i=0; i<c.length;i++) {
			System.out.print((char)(i+'a')+ " : " + c[i]+ "=>");
			for(int j=0;j<c[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	

//인덱스값을 이용해서 알고리즘으로 활용