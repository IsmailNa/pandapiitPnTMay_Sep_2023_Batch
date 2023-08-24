package com.java.day8_oops_inheritance;

public class Child extends Parent {
	
	public String bikeName;
	public int no_of_guitars;

	public static void main(String[] args) {
		Child child = new Child();
		child.name = "Grandpa";
		child.age = 75;
		child.bankBalance();
		child.farmHouse();
		GrandParent.BondsShares();
		
		child.houseName = "Villa101";
		child.no_of_cars = 3;
		child.cashDeposit();
		child.shippingFirm();
		Parent.industries();
		
		child.superCar();
		child.internetCafe();
		
		mastersDegree();

	}
	
	
	public void superCar() {
		System.out.println("Child's super car");
	}
	
	public void internetCafe() {
		System.out.println("Child's internet cafe");
	}
	
	public static void mastersDegree() {
		System.out.println("Child's master degree");
	}

}
