package com.hw4.controller;

import edu.kh.oarr.model.vo.Member;

public class MemberController {
	public static int SIZE  = 10;
	private int memberCount;
	private Member[] mem;
	
	public int getMemberCount() {
		return 0;
	}
	
	public Member[] getMem() {
		return mem;
		
	}

	public Member checkId(String userId) {
		return null;
	}
	
	public void insertMember(Member m) {
		
	}

	public Member searchMember(int menu, String search) {
		return null;
		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
	}

	public void deleteMember(String userId) {
		
	}
	
	public Member[] sortIdAsc() {
		return mem;
		
	}
	
	public Member[] sortIdDesc() {
		return mem;
	}
	
	public Member[] sortAgeAsc() {
		return mem;
	}

	public Member[] sortAgeDesc() {
		return mem;
	}
	
	public Member[] sortGenderDesc() {
		return mem;
	}
}
