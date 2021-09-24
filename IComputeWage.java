package com.bl.emp;

public interface IComputeWage {
	
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maximumHoursPerMonth);
	public int computeEmpWage(CompanyEmpWage companyEmpWage); 

}
