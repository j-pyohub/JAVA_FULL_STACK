package com.oopsw.company;
/**Áö¿¬¿ì*/
public class Manager extends Employee{
	private String officeNumber;

	public Manager(String number, String name, String officeNumber) {
		super(number, name);
		setOfficeNumber(officeNumber);
	}

	public String getOfficeNumber() {
		return officeNumber;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}

	@Override
	public String toString() {
		return "officeNumber=" + officeNumber + super.toString();
	}
	
	
}
