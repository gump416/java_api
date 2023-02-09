package ezen.api;

public class ObjectExample {

	public static void main(String[] args) /*throws CloneNotSupportedException 편법*/ {
		Account account = new Account("1111-2222","송진호", 1111, 10000);
		System.out.println(account);
		
		//복제 방법 1.(얇은 복사), 같은 객체를 가르키는 공유 개념
		Account account2 = account;
		
		//복제 방법 2.(깊은 복사)
		try {
			account2 = (Account)account.clone();
			System.out.println(account2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println(account instanceof Cloneable); // 데이터 보호를 위해서 Cloneable 구현했는지 확인
		
		
		
		
		
	}

}
