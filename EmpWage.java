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
        double empCheck= Math.floor(Math.random()*10%2);
       
        // Converting to integer value and assin to choice 
        int choice = (int) (empCheck);
        
        //print value 
        System.out.println(choice);
        
        //switch case statement 
        switch (choice) {
            case 1:
            	
            	// calculating wage 
                dailyWage = wagePerHour * fullDayHour;
                System.out.print("Employee is Full Time");
                System.out.print("Employee wage: " + dailyWage);
                break;

            case 0:
                dailyWage = wagePerHour * partTimeHour;
                System.out.print("Employee is Part Time");
                System.out.print("Employee wage: " + dailyWage);
                break;

        
        }

	}	
}