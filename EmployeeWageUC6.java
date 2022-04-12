package day_4;
/*
 * Author: Rajesh
 * Employee Wage Computation Program UC6 : Calculating the wages till a condition of total working hours or days
 * is reached for a month.
 */
public class EmployeeWageUC6 {
	public static void main(String[] args) {
		//constants
		final int IS_FULL_TIME = 2;
		final int IS_PART_TIME = 1;
		final int EMP_RATE_PER_HOUR = 20;
		final int NUM_OF_WORKING_DAYS = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		
		System.out.println("Welcome to Employee wage Computation Program");
		while (totalEmpHrs < 100 || totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random()*10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;	
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			totalEmpHrs += empHrs;
		}
		System.out.println("Total Employee Wage : "+totalEmpWage);	
	}

}
