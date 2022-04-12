package day_4;
/*
 * Author: Rajesh
 * Employee Wage Computation Program UC4 : Calculating the wage of part time employee
 * and full time employee using Switch Case statement.
 */
public class EmployeeWageUC4 {
	public static void main(String[] args) {
		//constants
		final int IS_FULL_TIME = 2;
		final int IS_PART_TIME = 1;
		final int EMP_RATE_PER_HOUR = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		System.out.println("Welcome to Employee wage Computation Program");
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
		System.out.println("Employee Wage : "+empWage);
	}


}
