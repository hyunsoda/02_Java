package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	private Employee[] employee;
	private int employeeCount ;
	
	public Company() {}
	
	public Company(int size) {
		employee = new Employee[size];
		employeeCount = 0;
	}

	@Override
	public void addPerson(Person person) {

		if(person instanceof Employee) {
			for(int i = 0; i<employee.length; i++) {
				if(employee[i] == null) {
					System.out.print("직원이 추가되었습니다 - ");
					employee[i] =  (Employee) person;
					employeeCount ++;
						System.out.print(employee[i].getInfo());
						System.out.println();
						break;
					 
				}
				if(employee[employee.length-1]!=null) {
					System.out.println("인원이 모두 충원되었습니다");
					break;
				}
				

				
				
			}
		}
	}

	@Override
	public void removePerson(String id) {
		for(int i = 0; i< employeeCount; i++) {
			if(id.equals(employee[i].getId())) {
				System.out.print("직원이 삭제되었습니다 -");
				System.out.print(employee[i].getInfo()+"\n");
			employee[i] = null;
			employeeCount--;
		}
		}
		
	}

	@Override
	public void displayAllPerson() {
		System.out.print("전체 직원 명단 : ");
		for(int i = 0; i< employeeCount; i++) {
			if(employee[i]==null) {
				i++;
			}
			System.out.print(employee[i].getInfo()+"\n");
		
		}
	}

	
	

}
