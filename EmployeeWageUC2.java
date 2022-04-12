package day_4;
/*
 * Author: Rajesh
 * Employee Wage Computation Program UC2 : Calculating the employee wage per day.
 */
public class EmployeeWageUC2 {
	public static void main(String[] args) {
		//constants
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		System.out.println("Welcome to Employee wage Computation Program");
		double empCheck = Math.floor(Math.random()*10) % 2;
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			empHrs = 8;
		}
		else {
			System.out.println("Employee is absent");
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage : "+empWage);
	}

}
