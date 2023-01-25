package com.exmployeeSystem;

public class ContractDigitalAssociate extends DigitalAssociate{
	private int wageRate;
	private int hours;
	
	public ContractDigitalAssociate(int employeeId, String employeeType, int wageRate, int hours) {
		super(employeeId, employeeType);
		this.wageRate = wageRate;
		this.hours = hours;
	}

	@Override
	public int getSalary() {
		if(hours <= 40) {
			return wageRate * hours;
		}
		else {
			return (40 * wageRate) + ((hours - 40) * wageRate * 2);
		}
	}
}
