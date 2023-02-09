package ezen.api;

public class StringBuilderExample {

	public static void main(String[] args) {
		//비동기 지원 클래스(효율성)
		StringBuilder sb = new StringBuilder("Java");
		// 자체편집
		sb = sb.append("JavaScript"); // + 연산자 역할
		System.out.println(sb);
		// 메소드 체이닝
		sb.append("HTML").append("CSS").append("SQL").append(false);
		System.out.println(sb);
		sb.delete(0, 4);
		System.out.println(sb);
		sb.insert(4, "&");
		System.out.println(sb);
		System.out.println(sb.reverse());

	}

}
