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
	int empFullTime=1;
    int wagePerHour=20;
    int fullDayHour=8;
    int partTimeHour=4;
    int dailyWage;
    
	// Method with type void
	void show() {
		
		// To Generat Random Number
        double empCheck= (int) Math.floor(Math.random()*10%3);
        
     // if else condition to check Employee is present or Absent if present than calculate wage also
        if(empCheck == empFullTime){
        	
	    	 // calculate Dailywage for FullTime employee
            dailyWage=wagePerHour*fullDayHour;
            System.out.print("Employee is Full Time and his daily wage is: "+dailyWage);
            }
        else {
        	
        	// nested if else condition 
        	if(empCheck == partTimeHour){
      
        	// calculate Dailywage for PartTime employee	
            dailyWage=wagePerHour*partTimeHour;
            System.out.print("Employee is Part Time and his daily wage is: "+dailyWage);
            }
           else {
        	System.out.println("Employee is Absent");
            }
        }

	}	
}