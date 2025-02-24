package test;
/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
*/
public class Test05 {
	public static void main(String[] args) {
		int sum=0;
		String result = "";
		for(int i=1; i<=10;i++) {
			int c= 0;
			for(int j = 1; j<=i;j++) {
				c+=j;
			}
			sum+=c;
			if(i>1) {
				result +="+";
			}
			result+="(";
			for(int j=1;j<=i;j++) {
				result +=j;
				if(j<i)result +="+";
			}
			result+=")";
		}
		System.out.println(result+"="+sum);

		int sum1 = 0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum1+=j;
			}
		}
		System.out.println(sum1);
		System.out.println("==================");
		sum1=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + ((j == i) ? "" : "+"));
				sum1 += j;
			}
			System.out.print(")" + ((i == 10) ? "=" : "+"));
		}
		System.out.println(sum1);

	
	}
}