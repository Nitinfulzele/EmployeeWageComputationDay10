package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHour = 8;

	public static void computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
	       
		int empHrs = 8, totalEmpHrs = 12, totalWorkingDays = 29;

		// Employee attendance

		Random inp = new Random();
		int empPresent = inp.nextInt(2);

		if (empPresent == 0) {
			System.out.println("Employee is Present");

		} else {
			System.out.println("Employee is Absent");
		}

		// Employee Daily Wage

		int dailyWage = 0;

		dailyWage = fullDayHour * wagePerHour;
		System.out.println("Daily wage of Employee is " + dailyWage);

		// Employee Part Time

		dailyWage = partTimeHour * wagePerHour;
		System.out.println("Employee is Part Time ");

		// Switch case

		int dailyWage2 = partTimeHour * 10;

		empPresent = inp.nextInt(2);
		switch (empPresent) {
		case 0:
			System.out.println("Employee is Present");
			break;
		case 1:
			System.out.println("Employee is Part Time");
			break;
		case 2:
			System.out.println("Employee is Absent");
			break;

		}

		// Monthly Wage Employee

		int monthlyWage = 0;
		int monthDays = 20;

		monthlyWage = dailyWage * monthDays;
		System.out.println("Monthly wage of Employee is " + monthlyWage);

		monthlyWage = dailyWage2 * monthDays;
		System.out.println("Monthly wage of part time Employee is " + monthlyWage);

		// Calculate wage till condition reached for month

		monthlyWage = dailyWage2 * monthDays;
		System.out.println("Monthly wage of part time Employee is " + monthlyWage);
		int isWorking;
		int totalMonthlyWage2 = 0;
		int workingDays = 0;
		int workingHour = 0;

		while (workingHour <= 100 && workingDays <= 20) {

			int isworking = inp.nextInt(2);
			workingDays = workingDays + 1;

			switch (isworking) {
			case 0:
				totalMonthlyWage2 = totalMonthlyWage2 + wagePerHour * 4;
				workingHour = workingHour + 4;
				break;
			case 1:
				totalMonthlyWage2 = totalMonthlyWage2 + wagePerHour * 8;
				workingHour = workingHour + 8;
				break;
			}
		}
		int totalEmpWage =  totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for Company: " +company+ "is:" +totalEmpWage);
		return ;
	}

	public static void main(String[] args) {
		computeEmpWage("Airtel ", 20, 2, 10);
		computeEmpWage("Idea ", 10, 4, 20);

	}

}
