package sec1;

public class ExceptionExam4 {
	public static void main(String[] args) {
		String data1 = "1004";
		String data2 = "kim1004";
		
		try {
			int val1 =Integer.parseInt(data1);
			int val2 =Integer.parseInt(data2);
			System.out.println(val1);
			System.out.println(val2);
			System.out.println(val1+20);
			
		} catch(NumberFormatException e) {
			System.out.println("숫자 형식으로 처리할 수 없는 데이터");
			e.printStackTrace();
		} catch(Exception e) {
		System.out.println("정체를 알 수 없는 예외");
		e.getMessage();
	}
}
}