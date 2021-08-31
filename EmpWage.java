package com.bl.emp;

public class EmpWage {

	 //constants
    public static final int partTime = 1;
    public static final int fullTime = 2;

    //private variable
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    //Constructor with 3 parameter
    public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    //method 
    public void computeEmpWage() {
        System.out.println("Welcome To Employee Wage Computation");
        // Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        // Computation while loop
        while (totalEmpHrs <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            //Generate random number 
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            //switch case statement 
            switch (empCheck) {
                case partTime:
                    empHrs = 4;
                    break;
                case fullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            //printing day and Employee Hr
            System.out.println("Total Working Days: " + totalWorkingDays + " Employee Hours: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Employee Wage for Company:"  +company+" is: " + totalEmpWage;
    }

    //main method 
    public static void main(String[] args) {
    	//create object and calling constructor by passing 3 value
        EmpWage dMart = new EmpWage("DMart", 200, 2, 10);
        EmpWage google = new EmpWage("Google", 150, 4, 20);
        //calling method
        dMart.computeEmpWage(); 
        System.out.println(dMart);
        google.computeEmpWage();
        System.out.println(google);

    }

}



/*
OUTPUT

Welcome To Employee Wage Computation
Total Working Days: 1 Employee Hours: 4
Total Working Days: 2 Employee Hours: 0
Total Employee Wage for Company:DMart is: 800
Welcome To Employee Wage Computation
Total Working Days: 1 Employee Hours: 8
Total Working Days: 2 Employee Hours: 8
Total Working Days: 3 Employee Hours: 0
Total Working Days: 4 Employee Hours: 0
Total Employee Wage for Company:Google is: 2400

*/