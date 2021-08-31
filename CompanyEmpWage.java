package com.bl.emp;

public class CompanyEmpWage {
	//variable 
	public final String company;
    public final int empRatePerHour;
    public final int numOfWorkingDays;
    public final int maximumHoursPerMonth;
    public int totalWage;
    
    //constructor with passing parameter 
    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maximumHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maximumHoursPerMonth = maximumHoursPerMonth;
    }
    public void setTotalEmpWage(int totalWage){
        this.totalWage=totalWage;
    }
    
    public String toString() {
        return "Total Employee Wage for "+company+" is "+totalWage;
    }

}
