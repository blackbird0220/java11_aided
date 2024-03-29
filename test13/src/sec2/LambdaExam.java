package sec2;
//람다(Lambda) 식(Expression): 메소드를 더 간소화한 표현식 /점점 많이 쓰임
//자바의 기본적인 람다식 정의 방법 =>함수적 인터페이스(Funtional Interface)
//함수적 인터페이스는 @FunctionalInterface 로 정의하고, 메소드는 오로지 하나만 가져야 한다.
//@는 자바에서 어노테이션(Annotation)을 의미
//어노테이션(Annotation): 개발자가 컴파일러에게 특정한 것임을 알려주는 것으로, 만약 기술하지 않으면 컴파일러가 정체를 알 수 없는 오류를 발생시킨다.

@FunctionalInterface
interface Lambda1 {	//매개변수 x, 반환 x
	void method1();
}

@FunctionalInterface
interface Lambda2 {	//매개변수 o, 반환 x
	void method2(int x, int y);
}

@FunctionalInterface
interface Lambda3 {	//매개변수 x, 반환 o
	public int method3();
}

@FunctionalInterface
interface Lambda4 {	//매개변수 o, 반환 o
	public int method4(int x, int y);
}



public class LambdaExam {	
	public static void main(String[] args) {
		Lambda1 f1 = new Lambda1() {
			
		};

	}

}
