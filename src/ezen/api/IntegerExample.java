package ezen.api;

/**
 * @author 송진호
 * @Date 2023. 1. 11.
 */
public class IntegerExample {

	public static void main(String[] args) {
		int x = 100;
//		Integer integer = new Integer(x);
		Integer integer = new Integer("100");
		double d = integer.doubleValue();
		System.out.println(d);

		String num = "1004";
		int value = Integer.parseInt(num);
		value += 100;
		System.out.println(value);
		String weight = "56.7";
		double weight2 = Double.parseDouble(weight);
		System.out.println(weight2);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toOctalString(x));
		System.out.println(Integer.toHexString(x));
		
		for(int i =0; i <100000000; i++) {
//			System.out.print(Integer.toBinaryString(i)); //sop는 리소스를 엄청 잡아먹는 문법임 실제로 빨리 끝나는데 이 문법때문에 오래걸리는것임. 다른 대체방안있음..나중에..
		}
		System.out.println("종료"); //1억번이라도 sop없으면 금방끝나는걸 알 수 있음
	
	
	}

}
