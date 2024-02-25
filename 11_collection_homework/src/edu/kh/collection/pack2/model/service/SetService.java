package edu.kh.collection.pack2.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.processing.AbstractProcessor;

public class SetService {

	public void lotto(){
		Random random = new Random();
		Set<Integer> lotto = new TreeSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add(random.nextInt(45)+1);
		}
		System.out.println(lotto);
	}
	
	public void lottoGenerate() {
		Scanner sc = new Scanner(System.in);
		List<Set<Integer>> lottolist = new ArrayList<Set<Integer>>();
		Random random = new Random();
		System.out.print("금액 입력 : ");
		int price = sc.nextInt();
		
		for(int i = 0; i<price/1000; i++) {
			Set<Integer> lotto = new TreeSet<Integer>();
			// for문 반복되면서 새로운 로또리스트 생성
			while(lotto.size()<6) {
				lotto.add(random.nextInt(45)+1);
			}
			lottolist.add(lotto);
			
		}
		for(int i =0; i<lottolist.size();i++) {
			System.out.println(lottolist.get(i));
		}
		
	}

	public void lottoGenerate2() {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		List<Set<Integer>> lottolist = new ArrayList<Set<Integer>>();
		System.out.print("금액 입력 :");
		int price = sc.nextInt();
		
		for(int i = 0; i<price/1000;i++) {
			Set<Integer> lotto = new TreeSet<Integer>();
			while(lotto.size()<6) {
				lotto.add(random.nextInt(45)+1);
			}
			lottolist.add(lotto);
		}
		for(int i =0; i<lottolist.size();i++) {
			System.out.println(lottolist.get(i));
		}
	}

	public void lotto2() {
		
		Random random = new Random();
		Set<Integer> lotto = new TreeSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add(random.nextInt(45+1));
		}
		System.out.println(lotto);
	}

	public void lottoGenerate3() {
		Scanner sc = new Scanner(System.in);
		
		List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
		
		System.out.print("금액 입력 : ");
		int input = sc.nextInt();
		
		Random random = new Random();
		
		for(int i = 0; i<input/1000; i++) {
			Set<Integer> lotto = new TreeSet<Integer>(); // for문이 반복될 때마다 새로운 Set 객체 생성
			while(lotto.size()<6) {
				lotto.add(random.nextInt(45)+1);
			}
			
			lottoList.add(lotto);
		}
		
		for(Set<Integer> l : lottoList) {
			System.out.println(l);
		}
	}

	public void lottoGenerate4() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("금액입력 : ");
		int price = sc.nextInt();
		List<Set<Integer>> lottoList = new ArrayList<Set<Integer>>();
		// 로또를 담을 리스트
		
		for(int i = 0; i<price/1000; i++) {
			Set<Integer> lotto = new TreeSet<Integer>();
			// for문이 반복될 때마다 새로운 lotto set생성
			while(lotto.size()<6) {
				lotto.add(random.nextInt(45)+1);
				
			}
			lottoList.add(lotto);
		}
		for(int i = 0; i<lottoList.size();i++) {
			System.out.println(lottoList.get(i));
		}
		
	}
}


