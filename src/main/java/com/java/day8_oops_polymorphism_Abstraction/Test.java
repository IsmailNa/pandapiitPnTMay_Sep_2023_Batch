package com.java.day8_oops_polymorphism_Abstraction;

public class Test extends UnitedFlightBookingLogic{

	public static void main(String[] args) {
	//	UnitedFlightBookingLogic ufb = new UnitedFlightBookingLogic();

		UnitedFlightBookingLogic ref = new Test();
		ref.flightArrivalLogic();
		ref.flightBookingLogic();
		ref.flightDepartureLogic();
		
		Test test = new Test();
	}

	@Override
	public void flightDepartureLogic() {
	System.out.println("Flight Departure Logic");	
		
	}

	@Override
	public void flightBookingLogic() {
		System.out.println("Flight Booking Logic");	
		
	}

}
