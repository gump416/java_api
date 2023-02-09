package ezen.api;


import java.text.SimpleDateFormat;
import java.util.Date;



public class DateExample {

	public static void main(String[] args) {
		Date today = new Date(); //default생성자는 현재 날짜,시간 생성. Depredcated 안되있어서 써도됨.
//		Date ymd = new Date(1987, 3, 2);
//		System.out.println(ymd.toLocaleString());
//		String todayString = today.toLocaleString(); //OS에 저장되어있는 지역 정보 불러들임
//		System.out.println(todayString);
		
		//내가 원하는 날짜 출력 형식 지정
		//2023년 2월 13일 수요일
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:SS EEEE"); //출력패턴을 미리 만듦
		String date = format.format(today);
		System.out.println(date);
	}

}
