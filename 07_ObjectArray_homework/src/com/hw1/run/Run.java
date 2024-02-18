package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		
		Employee[] empArr = new Employee[3]; 
		empArr[0] = new Employee();
		empArr[1] = new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		empArr[2] = new Employee(2,"김말순","교육부","강사", 20, 'F',1000000,0.01,"01011112222","서울 마곡");
		for(int i = 0; i<empArr.length; i++) {
			System.out.printf(
					"emp[%d] : %d, %s, %s, %s, %d, %c, %d, %f, %s, %s",
			i, empArr[i].getEmpNo(), empArr[i].getEmpName(),empArr[i].getDept(),empArr[i].getJob(), empArr[i].getAge()
			,empArr[i].getGender(), empArr[i].getSalary(),empArr[i].getBonusPoint(),empArr[i].getPhone(), empArr[i].getAddress());
			System.out.println();
		}
		System.out.println("========================");
		empArr[0].setEmpName("김말똥");
		empArr[0].setDept("영업부");
		empArr[0].setJob("팀장");
		empArr[0].setAge(30);
		empArr[0].setGender('M');
		empArr[0].setSalary(3000000);
		empArr[0].setBonusPoint(0.2);
		empArr[0].setPhone("01055559999");
		empArr[0].setAddress("전라도 광주");
		
		empArr[1].setDept("기획부");
		empArr[1].setJob("부장");
		empArr[1].setSalary(4000000);
		empArr[1].setBonusPoint(0.3);
		empArr[1].setPhone("01022223333");
		empArr[1].setAddress("서울 잠실");
		
		
		
		for(int i = 0; i<empArr.length; i++) {
			
		
		System.out.printf(
				"emp[%d] : %d, %s, %s, %s, %d, %c, %d, %f, %s, %s",
		i, empArr[i].getEmpNo(), empArr[i].getEmpName(),empArr[i].getDept(),empArr[i].getJob(), empArr[i].getAge()
		,empArr[i].getGender(), empArr[i].getSalary(),empArr[i].getBonusPoint(),empArr[i].getPhone(), empArr[i].getAddress());
		System.out.println();
		}
		
		
		System.out.println("==========================");
		double yearSalary = 0;
		int wholeSalary = 0;
		for(int i = 0; i<empArr.length;i++) {
			yearSalary = (empArr[i].getSalary()+
					(empArr[i].getSalary()*empArr[i].getBonusPoint()))*12;
			wholeSalary += yearSalary;
			System.out.printf("%s의 연봉 : %d원\n",empArr[i].getEmpName(),(int)yearSalary);
		
		
		}
		System.out.println("============================");
		
		System.out.printf("연봉의 평균 : %d", wholeSalary/3);
		
	}
	

}
