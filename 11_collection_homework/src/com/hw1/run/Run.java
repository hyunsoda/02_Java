package com.hw1.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {

		List<Friend> friendList = new ArrayList<Friend>();
		friendList.add(new Friend("짱구"));
		friendList.add(new Friend("철수"));
		friendList.add(new Friend("훈이"));
		friendList.add(new Friend("맹구"));
		friendList.add(new Friend("유리"));
		
		// Collections.addAll();
		// Collections.addAll(friends, new Friend("짱구"),new Friend("철수"),new Friend("훈이"),new Friend("맹구"),new Friend("유리"));
		// (대상, 객체)
		
		
		// List.of() : Jave 9 이상의 버전에서 사용 가능
		// List<Friend> friends = List.of(new Friend("짱구"),new Friend("철수"),new Friend("훈이"),new Friend("맹구"),new Friend("유리"));
		
		// 랜덤으로 골목대장 뽑기
		// Random random = new Random();
		
		int random = (int)(Math.random()*5+1);
		Friend friend = new Friend();
		friendList.get(random).pickLeader();
		
	}

}
