package ezen.api;

import java.util.StringTokenizer;

public class StringTokenizerExample { //util패키지

	public static void main(String[] args) {
		//String cardNumber = "1111 2222 3333 4444"; // 
		//StringTokenizer st = new StringTokenizer(cardNumber, " "); //구분자가 space면 생략가능, 비추
		String cardNumber = "1111-2222-3333-4444"; // -(구분자)로 분리되어 지는 영역을 토큰이라함
		StringTokenizer st = new StringTokenizer(cardNumber, "-"); //뒤에 true 쓰면 구분자도 토큰처리해서 같이 가져옴
//		StringTokenizer st = new StringTokenizer(cardNumber, "-", true); //뒤에 true 쓰면 구분자도 토큰처리해서 같이 가져옴
		int count = st.countTokens();
		System.out.println(count);
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
//		for (int i = 0; i < st.countTokens(); i++) {
//		}
		
		while(st.hasMoreTokens()) { //for문보다 간단
			System.out.println(st.nextToken());
			
		}
		
	}

}
