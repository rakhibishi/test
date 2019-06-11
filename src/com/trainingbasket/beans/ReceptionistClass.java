package com.trainingbasket.beans;

public class ReceptionistClass extends EmployeeClass {

	String telephoneExt;
	
	public String getTelephoneExt() {
		return telephoneExt;
	}

	public void setTelephoneExt(String telephoneExt) {
		this.telephoneExt = telephoneExt;
	}

	public ReceptionistClass() {
		// TODO Auto-generated constructor stub
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"\nExtension : "+this.telephoneExt;
}
}
