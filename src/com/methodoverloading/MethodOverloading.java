package com.methodoverloading;

class MethodOverloading {
	public static void main(String[] args) {

		MethodOverloading methodOverloading= new MethodOverloading();
		methodOverloading.employeeDetails("saravanan");
		methodOverloading.employeeDetails(25);
		methodOverloading.employeeDetails(false);

	}
	public void employeeDetails(String name) {
		name="Saravanan";
		System.out.println(name);
	}
	public void employeeDetails(int age) {
		age=25;
		System.out.println(age);
	}
	public void employeeDetails(boolean maritalStatus) {
		maritalStatus=false;
		System.out.println(maritalStatus);
	}
}
