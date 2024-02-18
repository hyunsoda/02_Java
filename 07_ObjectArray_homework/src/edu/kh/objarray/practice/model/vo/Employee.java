package edu.kh.objarray.practice.model.vo;

public class Employee {
	
	private int empNo;
	private String name;
	private String dept;
	private String position;
	private long salary;
	
	public Employee() {}

	public Employee(int empNo, String name, String dept, String position, long salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
		this.position = position;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}



	
}
