package com.hw11.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {

		List<Friend> friend = new ArrayList<Friend>();
		
		friend.add(new Friend("짱구"));
		friend.add(new Friend("훈이"));
		friend.add(new Friend("유리"));
		friend.add(new Friend("맹구"));
		friend.add(new Friend("철수"));
		
		Random random = new Random();
		
		
		friend.get(random.nextInt(5)).pickLeader();
	}

}
