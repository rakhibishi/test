package com.trainingbasket.beans;
public class ManagerClass extends EmployeeClass 
{
	String Department;
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public ManagerClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString()+"\nDepartment : "+this.Department;
	}
	
}

