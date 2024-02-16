package com.hw2.run;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		Company cmp = new Company(5);
		cmp.addPerson(new Employee("EMP001","유재석","기획팀"));
		cmp.addPerson(new Employee("EMP002","정형돈","개발팀"));
		
		cmp.displayAllPerson();
		
		System.out.println("===============================");
	
		Prison prs = new Prison(10);
		prs.addPerson(new Prisoner("1205","정준하","밥도둑"));
		prs.addPerson(new Prisoner("0705","박명수","웃음연쇄살인"));
		
		prs.displayAllPerson();
		System.out.println("===============================");
		
		cmp.removePerson("EMP001");
		prs.removePerson("1205");
		System.out.println("===============================");
		
		cmp.displayAllPerson();
		prs.displayAllPerson();
	}

}
