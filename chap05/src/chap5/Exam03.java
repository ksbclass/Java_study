package chap5;
/*
 * str 문자열에 저장된 소문자의 갯수 출력하기
 */
public class Exam03 {

	public static void main(String[] args) {
		String str = "public static void main(String[] args)";
		int[] r = new int[26];
		for (int i =0; i <str.length();i++) {
			char ch= str.charAt(i);
			if(ch >= 'a' && ch<='z') {
				r[ch-'a']++;
			}
		}
		System.out.println("소문자 알파벳 갯수 : ");
		for(int i =0; i<26;i++) {
			if(r[i]>0) {
				System.out.println((char)(i+'a')+" : "+r[i]+"개");
			}else {
				System.out.println((char)(i+'a')+" : "+ "없는문자(0개)");
			}
		}
	}

}
