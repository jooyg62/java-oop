package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			int a =0;
			System.out.println("Some Codes....");
			int k = 1000000 / a;
			System.out.println("More Codes...1");
			System.out.println("More Codes...2");			
		} catch(ArithmeticException e) {
			//1. 로그남기기... (파일)
			System.out.println("error: " + e);
			
			//2. 사과
			System.out.println("죄송합니다. 예기치....");
			
			//3. 정상종료
			return;
			
			//4. 1~3이거라도 안되면
			//e.printStackTrace();
		} finally {
			System.out.println("finally..");
		}
	}

}
