package ezen.api;

import java.util.Calendar;
import java.util.Formatter;

/**
 * 프로그램에서 다루는 다양한 데이터(문자열, 정수, 실수, 날짜 등)를 윈하는 출력 형식으로 만들기 위해 Java5버전에 추가된
 * Formatter 클래스
 * 
 * @author 송진호
 * @Date 2023. 1. 12.
 */
public class FormatterExample {

	public static void main(String[] args) {
		int money = 34343434;
		System.out.println(money);
		Formatter formatter = new Formatter();
		formatter = formatter.format("%+,15d\n", money); // 우측정렬(엑셀과같다.,빈공간을 좌측에두어라) -는 좌측정렬, 정확하게는 빈공간을 우측에 두어라
		formatter = formatter.format("%+,15d", money);
		System.out.println(formatter);

		double average = 56.3434343;
		System.out.println(average);
		formatter = new Formatter();
		formatter = formatter.format("%,15.2f\n", average);
		formatter = formatter.format("%+,15f", average);
		System.out.println(formatter);

		String accountNum = "1111-2222-3333";
		formatter = new Formatter();
		formatter = formatter.format("%-30s\n", accountNum);
//		formatter = formatter.format("%s", average);
		System.out.println(formatter);

		int x = 1234567;
		formatter = new Formatter();
		formatter = formatter.format("%-30o\n", x);
//		formatter = formatter.format("%s", average);
		System.out.println(formatter);

		System.out.println(Integer.toBinaryString(x)); // 이진코드는 이자체로 Fomat된 상태임 굳이 쓰려면 이방법으로 써야함

		// 콘솔출력,3개
		System.out.println("");
		System.out.print("");
		System.out.printf("%+,15d\n", money);

		//String static format();
		int y = 12345;
		String formated = String.format("%,10d", y);
		System.out.println(formated);
		
		//Calendar 관련 포맷 문자
		Calendar now = Calendar.getInstance();
		System.out.printf("%tF\n", now); //이때 월은 +1 자동으로 되어있음, tF기본조합이 싫으면 내가 따로 조합해야함.
		System.out.printf("%1$tF %1$tT (%1$tA)", now); //""안에 공백은 문자로 인식, 캘린더에서 1$ 반드시!!
		
		
	}

}
