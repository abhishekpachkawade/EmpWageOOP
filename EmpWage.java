package com.bl.emp;

public class EmpWage {

		//variable
	 	public static final int isPartTime=0;
	    public static final int isFullTime=1;
	    private int numOfCompany;
	    private CompanyEmpWage empWageArray[];

	    //constructor
	    public EmpWage() {
	        empWageArray=new CompanyEmpWage[5];
	    }
	    
	    //method with four parameter
	    private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth) {
	        empWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maximumHoursPerMonth);
	        numOfCompany++;
	    }
	    
	    //private method
	    private void computeEmpWage() {
	        for(int i=0;i<numOfCompany;i++) {
	            empWageArray[i].setTotalEmpWage(this.computeEmpWage(empWageArray[i]));
	            System.out.println(empWageArray[i]);
	        }
	    }
	    
	    //private method with integer return type
	    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
	    	//local variable
	        int empHours=0, totalEmpHours=0, totalWorkingDays=0;
	        //while loop
	        while(totalEmpHours<=companyEmpWage.maximumHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays){
	            //Generate random number
	        	int check=(int)(Math.floor(Math.random()*10)%2);
	        	//switch case to check employee is partTime of fullTime
	            switch(check){
	                case isPartTime:
	                    empHours=4;
	                    break;
	                case isFullTime:
	                    empHours=8;
	                    break;
	                default :
	                    empHours=0;
	            }
	            totalEmpHours+=empHours;
	            totalWorkingDays+=1;
	        }
	        return totalEmpHours * companyEmpWage.empRatePerHour;

	    }
	    
	    //main method
	    public static void main(String args[]) {
	    	//creating object 
	        EmpWage employeeWage=new EmpWage();
	        //calling method 
	        employeeWage.addCompanyEmpWage("Dmart", 15, 21, 80);
	        employeeWage.addCompanyEmpWage("Reliance", 15, 22, 100);
	        employeeWage.computeEmpWage();

	    }
	}


/*
OUTPUT

Total Employee Wage for Dmart is 1260
Total Employee Wage for Reliance is 1620

*/