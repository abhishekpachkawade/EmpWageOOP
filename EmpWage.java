package com.bl.emp;

public class EmpWage {

public static void main(String[] args) {
		
		//creating a object of Attendance class object name is Obj 
		Attendance Obj = new Attendance();
		
		//object of attendance class 
		Obj.show();
	}

}

class Attendance{
	// local variable 
	int empPresent = 1;
	
	// Method with type void
	void show() {
		
		// Generate Random number 0 or 1 with type of double 
		double empCheck = Math.floor(Math.random()*10%2);
		
		// if else condition to check employee is present or absent 
		if(empPresent == empCheck) {
			
			//print statement if the condition is true than print  
			System.out.println("Employee is present");
		
		}
		else {
			
			//print statement if the condition is false than print 
			System.out.println("Employee is Absent ");
		}

	}
	
}




/*
 OUTPUT
 
 Employee is Absent
 
 OR
 
 Employee is present
 
 */



