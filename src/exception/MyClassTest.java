package exception;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass a = new MyClass();
		
		try {
		a.dangerMethod();
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}

}
