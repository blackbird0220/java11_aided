package sec1;

import java.text.DecimalFormat;

//DecimalFormat : 숫자의 표시형식을 지정하여 활용하는 클래스
public class DecimalFormatExam {
	public static void main(String[] args) {
		// 표시형식코드 : 0, # 
		//숫자가 1234.56 인 경우
		// 0 => 1234, 0.0 =>1234.5, 00000.00000 => 01234.56000
		// # => 1234, #.# = >1234.5, #####.##### => 1234.56

		// , :천단위 구분기호 	E ->지수형태로 표시	% ->백분율 표시
		// -1234
		// -#, -0 => -1234
		// #-, 0- => 1234-
		// #,##0 =>-1,234
		// #E0 => 1.234E+03
		// #% => -123400%
		
		double n = 1234567.89;

		DecimalFormat df1 = new DecimalFormat("#,##00.000");
		DecimalFormat df2 = new DecimalFormat("000,000,000.####");
		//DecimalFormat df3 = new DecimalFormat("0;#,##0;-#,##0");

		String res1 = df1.format(n);
		String res2 = df2.format(n);
		//String res3 = df3.format(n);

		
		System.out.println("#,##00.000 표시 : "+res1);
		System.out.println("000,000,000.#### 표시 : "+res2);
		//System.out.println("0;\\ #,##0;-\\ #,##0 표시 : "+res3);
		
		
	}

}
