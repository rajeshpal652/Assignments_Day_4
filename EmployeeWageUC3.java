package day_4;
/*
 * Author: Rajesh
 * Employee Wage Computation Program UC3 : Calculating the wage of part time employee
 * and full time employee.
 */
public class EmployeeWageUC3 {
	public static void main(String[] args) {
		//constants
		int IS_FULL_TIME = 2;
		int IS_PART_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		//variables
		int empHrs = 0;
		int empWage = 0;
		System.out.println("Welcome to Employee wage Computation Program");
		double empCheck = Math.floor(Math.random()*10) % 3;
		if(empCheck == IS_PART_TIME) {
			System.out.println("Employee is present");
			empHrs = 4;
		}
		else if(empCheck == IS_FULL_TIME) {
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
