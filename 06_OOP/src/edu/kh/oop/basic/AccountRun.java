package edu.kh.oop.basic;

public class AccountRun {

	public static void main(String[] args) {
		
		Account ac = new Account();
		ac.setAccountNum("1234-1234");
		ac.setBalance(10000);
		ac.setName("안소현");
		ac.setPassword(1234);
		
		
		System.out.println(ac.getName());
		System.out.println(ac.getAccountNum());
		System.out.println(ac.getBalance());
		System.out.println(ac.getPassword());
		ac.deposit(10000);
		ac.withdraw(1234, 10);
		
		ac.getInfo("홍길동", "김나나");
	}
	
	
	
	
	

}
