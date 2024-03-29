package lang;

import java.math.BigDecimal;

public class WrapperMain {

	public static void main(String[] args) {
		//기본형 데이터를 Wrapper Class객체로 만들기
		//auto boxing이 지원되므로 바로대입
		Integer i = 102;
		//문자열을 정수로 변환
	   String str = "187";
	   System.out.printf(str+90);//문자열과 숫자는 + 하면 문자열로 결합
	   
	   int su = Integer.parseInt(str);
	   System.out.println(su+90);
	   //문자열을 숫자로 변경할 때는 변경할수없는 문자가 있거나 공백이 있으면
	   //NumberFormatException이 발생
	   //su = Integer.parseInt(" 11");
	   
	   //double은 소수 15자리까지만 인식합니다.
	   //아래의 경우는 더하면 2.0
	   double d1 = 1.0000000000000000111;
	   double d2 = 1.000000000000002;
	   System.out.println(d1 + d2);
	   
	   //위의 연산을 BigDecimal로 해결
	   BigDecimal b1 = new BigDecimal("1.0000000000000000111");
	   
	   BigDecimal b2 = new BigDecimal("1.000000000000002");
	   System.out.println(b1.add(b2));
	   
	   
	   
	   
	   
	   
			   

	}

}
