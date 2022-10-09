package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {
	
	static int wagePerHour = 20;
	static int fullDayHour =8;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");
		System.out.println();

		// Employee attendance

		Random inp = new Random();
		int empPresent = inp.nextInt(2);

		if (empPresent == 0) {
			System.out.println("Employee is Present");

		} else {
			System.out.println("Employee is Absent");
		}
		
		//Employee Daily Wage
		
				int dailyWage = 0;
				
				dailyWage = fullDayHour * wagePerHour;
				System.out.println("Daily wage of Employee is " + dailyWage);

	}

}
