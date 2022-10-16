package EmployeeWageComputation;

public class EmployeeWageComputation {

	 final int PartTime = 1;
	 final int FullTime = 2;
	
	private String companyName;
	private int WagePerHour;
	private int numOfWorkingDays;
	private int maxHoursPerMonth;
	private int totalEmpWage;
	
public  EmployeeWageComputation(String company,int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		
		this.companyName = company;
		this.WagePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	
	}


	public void computeEmpWage() {
	       
		// Variables
				int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
				// Computation
				while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
					totalWorkingDays++;
					int empCheck = (int) Math.floor(Math.random() * 10) % 3;
					switch (empCheck) {
					case PartTime:
						empHrs = 4;
						break;
					case FullTime:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
					}
					totalEmpHrs += empHrs;
					System.out.println("Day: " + totalWorkingDays + "Emp Hr :" + empHrs);
				}
				totalEmpWage = totalEmpHrs * WagePerHour;
			}
	
	@Override
	public String toString() {
		return "Total Emp Wage for Company: " + companyName+" is: " + totalEmpWage;
	}

	public static void main(String[] args) {
		EmployeeWageComputation Airtail = new EmployeeWageComputation("Airtail", 20, 2, 10);
		EmployeeWageComputation Idea = new EmployeeWageComputation("Idea", 10, 4, 20);
		Airtail.computeEmpWage();
		System.out.println(Airtail);
		Idea.computeEmpWage();
		System.out.println(Idea);

	}

}
