package ezen.api;

//!!!!Cloneable 인터페이스는 추상메소드를 가지지 않습니다. 마킹 인터페이스라고 한다!!!!
//(obj instanceof Cloneable)때 쓰기위해서 마킹 인터페이스 형식임
public class Account implements Cloneable { //clone() 메소드는 데이터 보호때문에 Cloneable 인터페이스를 구현한 클래스의 인스턴스만 사용할 수 있다
	// 은행이름(상수)
	public static final String BANK_NAME = "EZEN_BANK";

	
	private String accountNumber;
	private String accountOwner;
	private int password;
	private long restMoney;

	
	public Account() {
	
		this(null, null); 
	}

	public Account(String accountNumber, String accountOwner) {

		this(accountNumber, accountOwner, 0, 0L);
	}

	public Account(String accountNumber, String accountOwner, int password, long restMoney) {
																							
																								
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.password = password;
		this.restMoney = restMoney;

	}

	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public long getRestMoney() {
		return restMoney;
	}

	public void setRestMoney(long restMoney) {
		this.restMoney = restMoney;
	}

	public long withdraw(long money) {
		restMoney -= money;
		return restMoney;
	}


	public boolean checkPassword(int passwd) {
		return password == passwd;

	}

	public long deposit(long money) {
		restMoney += money;
		return restMoney;
	}

	public String getAccountNumber() {
		return accountNumber;
	}


	@Override
	public String toString() {
		return accountNumber + "\t" + accountOwner + "\t" + "****" + "\t" + restMoney; // private이지만 자기자신이라 접근가능
	}


	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Account)) {
			return false;
		}
		
		Account account = (Account) obj; 
		if (account.toString().equals(toString())) {
			return true;
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException { //오버라이딩 할때 접근제어자는 같거나 더 넗은 범위에 제어자 쓸 수 있다, protected -> public로 해줘야 쓸 수 있음,상속,예외처리 개념 다 있는 예제
		Account account = (Account)super.clone();
		return account;
	}

}
