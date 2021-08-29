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
	 //local variable
	  int MAX_DAYS=20;
      int MAX_HOURS=100;
      int empHrs=0,totalWorkingHours=0;
      int totalWorkingDays=0;
    
	// Method with type void
	void show() {
		
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
            
            // print statement 
            System.out.println("Total working Hours " + totalWorkingHours);
            System.out.println("Total working Days " + (totalWorkingDays-1));
        }

	}	
}