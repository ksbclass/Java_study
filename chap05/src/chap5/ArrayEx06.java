package chap5;
/*
 * command 라인에서 파라미터 받기
 */
public class ArrayEx06 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println(" command 라인에서 파라미터를 입력하세요");
			return; //함수를 종료
		}
		/*
		 * 1. 소스 코딩 : A.java
		 * 2. 컴파일 => A.class 바이트 코드 생성
		 * 	  javac A.java
		 * 3. 실행. 인터프리터
		 *    java A 홍길동 김삿갓 = command 라인
		 *    기능
		 *    	-JVM 환경 생성
		 *    	-클래스 영역 (메소드 영역) A.class 바이트 코드 로드
		 *    	-main 함수 호출. String[] args = command 라인에서 입력한 문자열을 배열로 전달
		 *    	args 라는 배열 값을 사용 할 수 있음.
		 */
		for(String a : args) {
			System.out.println(a);
		}

	}

}
