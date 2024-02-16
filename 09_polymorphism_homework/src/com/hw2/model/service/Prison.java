package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;


public class Prison implements ManagementSystem{

	private Prisoner[] prisoners;
	private int prisonerCount;
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}
	
	public Prisoner[] getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}

	public int getPrisonerCount() {
		return prisonerCount;
	}

	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}

	
	
	@Override
	public void addPerson(Person person) {
		if(person instanceof Prisoner) {
			for(int i = 0; i<prisoners.length; i++) {
				if(prisoners[i] == null) {
					System.out.print("수감자가 추가되었습니다 -");
					prisoners[i] = (Prisoner) person;
					System.out.println(prisoners[i].getInfo());
					prisonerCount++;
					break;
				}
				if(prisoners[prisoners.length-1]!=null) {
					System.out.println("인원이 모두 충원되었습니다");
					break;
				}
			}
		}
	}

	@Override
	public void removePerson(String id) {
		for(int i = 0; i< prisonerCount; i++) {
			if(id.equals(prisoners[i].getId())) {
				System.out.print("수감자가 삭제되었습니다 -");
				System.out.print(prisoners[i].getInfo()+"\n");
			prisoners[i] = null;
			prisonerCount--;
		}
		}
		
	}

	@Override
	public void displayAllPerson() {
		System.out.print("전체 수감자 명단 : ");
		for(int i = 0; i <prisonerCount;i++) {
			if(prisoners[i]==null) {
				i++;
			}
			System.out.println(prisoners[i].getInfo()+"\n");
		
		}
	}


	
	

}
