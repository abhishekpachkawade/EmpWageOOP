package com.bl.emp;

public class EmpWage {

public static void main(String[] args) {
		
		//creating a object of Attendance class object name is Obj 
		Attendance Obj = new Attendance();
		
		//object of attendance class 
		Obj.computeEmpWage("Dmart", 20, 2, 10);
		Obj.computeEmpWage("Google", 20, 16, 10);
	}

}

class Attendance{
	 //local variable
	  int MAX_DAYS=20;
      int MAX_HOURS=100;
      int empHrs=0,totalWorkingHours=0;
      int totalWorkingDays=0;
    
	// Method with type void
	void computeEmpWage(String company,int empRatePerHour, int workingDays, int maxHoursInMonth) {
		
		 // final is the keyword 
        final int FULLTIME=1;
        final int HALFTIME=0;

        //while loop 
        while(empHrs<MAX_HOURS && totalWorkingDays <=MAX_DAYS){
            totalWorkingDays++;
            
            // To Generate Random Number
            int check=(int)(Math.floor(Math.random()*10)%3);
            
            //switch case statement 
            switch(check) {
                case FULLTIME:
                    empHrs=8;
                    break;
                case HALFTIME:
                    empHrs=4;
                    break;
                default:
                    empHrs=0;
                    break;
            }
            totalWorkingHours+=empHrs;
            
            
        }
        
        // print statement 
        System.out.println("\nCompany Name " +company);
        System.out.println("Total Working Days" +totalWorkingDays);
        System.out.println("Total Working Hours" +totalWorkingHours);
        int totalEmpWage = empRatePerHour * totalWorkingHours;
        System.out.println("\nTotal Employee Wage is: "+totalEmpWage+" Rs");
	}	
}



/*
OUTPUT

Company Name Dmart
Total Working Days21
Total Working Hours108

Total Employee Wage is: 2160 Rs

Company Name Google
Total Working Days21
Total Working Hours108

Total Employee Wage is: 2160 Rs





*/