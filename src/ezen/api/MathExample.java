package ezen.api;

import java.util.Random;

public class MathExample {

	public static void main(String[] args) {
		System.out.println(Math.E);
		double average = 81.445;
		System.out.println(Math.round(average)); // 반올림
		System.out.println(Math.ceil(average)); // 무조건올림(절상)
		System.out.println(Math.floor(average)); // 무조건내림(절하)

		int no = (int) (Math.random() * 45) + 1;
		System.out.println(no);
		
		Random random = new Random();
		System.out.println(random.nextBoolean());
		System.out.println(random.nextFloat());
		System.out.println(random.nextInt()); //-21억 ~ 21억 사이의 임의값
		System.out.println(random.nextInt(45)); // 범위를 지정하면 0부터 시작, 0~44까지의 임의값
		
	}

}
