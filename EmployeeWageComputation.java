package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

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

	}

}
