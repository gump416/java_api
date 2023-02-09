package ezen.api;

public class DoubleExample {

	public static void main(String[] args) {
		double x = 0;
		double y = 0;

		System.out.println(x / y);
		double result = x / y;
		check(result);
	}
		public static void check(double x) {
			if(Double.isInfinite(x) || Double.isNaN(x)) { 
			//double 은 int 와 다르게 10/0은 infinity 라는 값으로 나오고 0/0은 NaN 이라는 값으로 나오기때문에 if문으로 걸러줘야함
				System.out.println("잘못된 값입니다..");
			}else {
			System.out.println(x*10); 
			}
		}
		
	

}
