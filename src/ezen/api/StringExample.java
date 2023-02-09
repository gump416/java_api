package ezen.api;

public class StringExample {

	public static void main(String[] args) {
		// String은 2가지의 생성 방법 제공
		//명시적 생성
		String name = new String("김기정");

		//묵시적 생성(문자열 리터럴 사용),자바에서 유일하게 String만 묵시적 생성 가능!!!
		String name2 = "김기정";
		String name3 = "김기정";
		
		//래퍼런스 비교
		System.out.println(name == name2); //Heap영역 == String pool 이라 주소가 다름
		System.out.println(name2 == name3); //같은 String Pool영역이기 때문에 같은 객체를 참조한다. 메모리관리효율적
		
		//문자열과 문자열 자체 비교
		System.out.println(name.equals(name3));
		System.out.println(name2.equals(name3));
		
		//결론: 문자열 생성할 때는 무조건 묵시적생성 쓸것.(메모리관리차원)
		//문자열을 비교할 때는 equals()메소드를 사용하라~~
		
		char[] language = {'j', 'a', 'v', 'a'};
		//생성자를 위한 디코딩
		String lang = new String(language);
		System.out.println(lang);
		
		//String의 주요 메소드
		String message = "최강의 언어는 자바입니다..";
		String substr = message.substring(4); //4번째부터 끝까지
		System.out.println(substr);
		System.out.println(message.substring(8, 10)); //8번째부터 9번쨰까지
		String title = message.substring(0, 11)+ "..."; //문자가 길 경우 현업에서 뒷부분...처리 요구할때가 있으니 알아두기
		System.out.println(title);
		String concatstr = message.concat("뻥이야~~");
		System.out.println(concatstr); // + 연산자 대신에 쓸 수 있음. 잘 안씀 
		
		String reply = "ddddddddddddddd 바보 ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ";
		String reply2 = reply.replaceAll("바보", "천재"); //치환 replace()는 char치환 replaceAll은 String(문자열) 치환
		System.out.println(reply2);
		
		String ssn = "680313-1234567"; //현업에서 68031-1234567 이런식으로 숫자 하나씩 빼먹는경우가 종종있는데
		//- 구분자를 기준으로 +1해서 뒤에 1,2로 성별을 판단할 수 있게 코드짜기
		int index = ssn.indexOf('-');
		char c = ssn.charAt(index + 1);
		System.out.println(c);
		
		String subject = "       헐~~       ";
		System.out.println(subject.trim()); // 공백제거
		
		int number = 3434343;
		//int -> String 으로 형변환
		String numberStr = String.valueOf(number);
		int size = numberStr.length();
		System.out.println(size);
		 boolean flag = false;
		 System.out.println(String.valueOf(flag));
		
		
		
	}

}
