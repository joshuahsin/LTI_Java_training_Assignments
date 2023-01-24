package com.CaseStudy2;

public class Demo {
	public static void main(String[] args) {
		Travel tr = new Travel();
		tr.setModeOfTravel('F');
		tr.setNoOfTickets(3);
		
		if(tr.getModeOfTravel() == 'F') {
			tr.setAmount(tr.getNoOfTickets() * 500);
		}
		else if(tr.getModeOfTravel() == 'T') {
			tr.setAmount(tr.getNoOfTickets() * 100);
		}
		else {
			tr.setAmount(tr.getNoOfTickets() * 50);
		}
	}
}
