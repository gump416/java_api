package ezen.api;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java");
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
