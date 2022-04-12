package day_4;
/*
 * Author: Rajesh
 * Employee Wage Computation Program UC1 : Printing if the employee is present or absent using random function.
 */

import java.util.Random;

public class EmployeeWage {

	
	public static void main(String[] args) {
		int IS_FULL_TIME=1;  //constant
		System.out.println("Welcome to Employee wage Computation Program");
		Random random = new Random();
		int empCheck = random.nextInt(2);
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}


}
