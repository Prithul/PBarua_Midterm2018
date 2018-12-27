package design;

/**
 * Author: Papri Barua
 */

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class EmployeeInfo extends EmployeeEssentials{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */
     /*
	 * declare few static and final fields and some non-static fields
	 */

	static String companyName = "Soup To Nuts";

	int employeeId;
	String employeeName;
	String employeeDepartmentNumber;
	double hrs;
	double rate;
	static double totalSalary;
	final int numberOfWeek  = 52;

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	public EmployeeInfo (){}                                                               /*  Constructor 1  */

	public EmployeeInfo(int employeeId){                                                   /*  Constructor 2  */

		this.employeeId = employeeId;
	}

    public EmployeeInfo(int employeeId,String EmployeeName){                               /*  Constructor 3  */

		this.employeeId = employeeId;
		this.employeeName = EmployeeName;
	}

	public EmployeeInfo(int employeeId, String employeeName, String employeeDepartNumber, double hrs, double rate){      /*  Constructor 4  */

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartmentNumber = employeeDepartNumber;
		this.hrs = hrs;
		this.rate = rate;
	}


	//employeeId() will return employee id....method() override
	public int employeeId(){

		int id = employeeId;
		return id;
	}

	//employeeName() will return employee name......method() override
	public String employeeName(){

		String name = employeeName;
		return name;
	}

	//assignDepartment() will assign employee to departments....method() override
	public void assignDepartment(){

		System.out.println("Department: " + this.employeeDepartmentNumber);
	}

	//calculate employee salary.....method() override
	public double calculateSalary(){

		double salaryPerWeek = this.hrs * this.rate;
		totalSalary = salaryPerWeek * numberOfWeek;
		return totalSalary;
	}

	//employee benefit.....method() override
	public void benefitLayout(){

		System.out.println("Medical: $" + super.medical);

		System.out.println("Sick_Leave: " + super.Sick_Leave);

		System.out.println("Paid_Holidays: " + super.Paid_Holidays);

		System.out.println("tution_Reimbursement: $" + super.tution_Reimbursement);

		double totalLifeInsurance =  Life_Insurance(totalSalary);
		System.out.println("LifeInsurance: $" + totalLifeInsurance);

	}

	// abstract method() implemented ...method() override
	public void emp401k_matchingFund(String match){

		String m = match;
		double count;
		double total401k = 0.0;

		if(m == "1%"){
			count = totalSalary * 0.01;
			total401k = count + count;
			System.out.println("401k accrued in 1 year: " + total401k);

		}else if(m == "2%"){
			count = totalSalary * 0.02;
			total401k = count + count;
			System.out.println("401k accrued in 1 year: " + total401k);

		}else if(m == "3%"){
			count = totalSalary * 0.03;
			total401k = count + count;
			System.out.println("401k accrued in 1 year: $" + total401k);

		}else if(m == "4%"){
			count = totalSalary * 0.04;
			total401k = count + count;
			System.out.println("401k accrued in 1 year: " + total401k);

		}else{

			System.out.println("Employee hasn't decided to take 401k!!! ");
		}
	}

	// abstract method() implemented .... method() override
	public void socialSecurity(){

		 double totalCount = 0.0;
		// 6.2% of total salary is invested in a year + another 6.2% is given (total 12.4%)
		double count = totalSalary * 0.062;
		totalCount = count + count;

		System.out.println("Social Security benefit accrued in 1 year: $" + totalCount);

	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeeBonus(double sal, double performacePercentage ){

		double employeeBonus;

		double salary = sal;
		double percentage = performacePercentage;

		employeeBonus = salary * percentage;

		return employeeBonus;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static double calculateEmployeePension(){

		double pension = 0.0 ;

		Scanner sc  = new Scanner(System.in);
		System.out.println("\nPlease enter start date in format (example: January, 2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: March, 2018): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

//		System.out.println(convertedJoiningDate);
//		System.out.println(convertedTodaysDate);

		//implement numbers of year from above two dates
		SimpleDateFormat myFormat = new SimpleDateFormat("MM/ yyyy");
		try {
			Date dateBefore = myFormat.parse(convertedJoiningDate);
			Date dateAfter = myFormat.parse( convertedTodaysDate);
			long difference = dateAfter.getTime() - dateBefore.getTime();
			float daysBetween = (difference / (1000*60*60*24));
			/* You can also convert the milliseconds to days using this method
			 * float daysBetween =
			 *         TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS)
			 */
			System.out.println("Number of Days between dates: " + daysBetween);

			int numberOfYearsWithCompany = Math.round(daysBetween/365);

			System.out.println("Number of years with company: " + numberOfYearsWithCompany);

			//Calculate pension
			if(numberOfYearsWithCompany == 1) {

				pension = totalSalary * 0.05;

			}else if(numberOfYearsWithCompany == 2){

				pension = totalSalary * 0.1;

			}else{

				System.out.println("Outstanding Pension!!! or No Pension!!!.... will decide later on :) ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return pension;
	}


	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}

	}
}
