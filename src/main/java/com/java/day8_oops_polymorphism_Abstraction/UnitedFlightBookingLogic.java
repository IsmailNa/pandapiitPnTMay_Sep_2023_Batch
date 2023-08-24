package com.java.day8_oops_polymorphism_Abstraction;

public abstract class UnitedFlightBookingLogic {

	
	public abstract void flightDepartureLogic();
	
	public abstract void flightBookingLogic();
	
	//private abstract void paymentLogic();
	
	//a method without a body or implementation logic - it is known as unimplemented method or abstract method
	
	public void flightArrivalLogic() {
		System.out.println("This is a concrete method");
	}
	

}
