package edu.kh.oop.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Account {
	/*
	 * getter/setter
	 * deposit(); : 전달받은 금액을 잔액에 누적한 후, 현재 잔액을 콘솔에 출력
	 * withdraw() : 비밀번호와 출금한 금액을 전달받아와, 조건에 맞으면 잔액에서 차감 후 현재 잔액 출력
	 * 		1) 비밀번호와 일치하지 않으면 "비밀번호 불일치" 출력
	 * 		2) 출금할 금액이 잔액보다 크면 "잔액 부족" 출력
	 * */
	
	private String name;
	private String accountNum;
	private	long balance;
	private int password;
	
	
	public String getName() {
		return name; // return 뒤 값을 호출한 곳으로 감 -> AccountRun에 System.out.println(ac.getName());
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	
	
	public void deposit(long amount) { // 출력하고 끝낼 거라 호출한 쪽으로 되돌릴 필요 없어서 void
		balance += amount;
		System.out.println("잔액 : " + balance);
	}
	
	public void withdraw(int pw, long amount) {
			if(pw == password) { 
				if(amount>balance) { // 잔액이 적은 경우
					System.out.println("잔액 부족");
					return;
				}else { // 잔액을 출금할 금액 만큼 차감
					balance -= amount;
					System.out.printf("%s 계좌에서 %d원 출금\n", accountNum, amount);
					System.out.println("잔액 : " + balance);
					return;
				}
			} else { // 비밀번호 다를경우
				System.out.println("비밀번호 불일치");
				return; // 메서드 종료 -> 호출한 곳으로 돌아감
			}
	}
	
	// String형 끼리 비교시 다르면 -> if(!password.equals(pw))
	
	public void getInfo(String name1, String name2) {
		String arr[] = {name1,name2};
		System.out.println(Arrays.toString(arr));
			
	}
	
	
	
}
