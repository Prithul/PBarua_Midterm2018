package design;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Author: Papri Barua
 *
 * Note: To be continued....:)   primary criteria is fulfilled!
 */

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	    public static void main(String[] args) {

	    	System.out.println("\n******* Company Name: " + EmployeeInfo.companyName + " *******\n");

	       // ....................... employee #1 .....................................................

		    EmployeeInfo empInfo1 = new EmployeeInfo(1, "Prithul Barua", "101", 40.00, 80.00);
			EmployeeEssentials employeeEssentials1 = new EmployeeInfo();

			int id1 = empInfo1.employeeId();
		    System.out.println("Employee_Id: " + id1);

			String name1 = empInfo1.employeeName();
		    System.out.println("Employee_Name: " + name1);

		    empInfo1.setSsNumber("123456789");
			String ssn1 = empInfo1.getSsNumber();
			System.out.println("SS_Number: " + ssn1);

			empInfo1.setDOB("01-01-1940");
			String dob1 = empInfo1.getDOB();
			System.out.println("DOB: " + dob1);

		    employeeEssentials1.display(1,"pb@soup2nuts.com");
		    employeeEssentials1.display("Prithul Barua", "pb2020@gmail.com");

		    empInfo1.assignDepartment();

		    double totalSalary1 = empInfo1.calculateSalary();
		    System.out.println("Total_Salary: $" + totalSalary1);

			double performaneBonus1 = EmployeeInfo.calculateEmployeeBonus(totalSalary1, 0.1);
			System.out.println("Performance_Bonus: $" + performaneBonus1);

			empInfo1.benefitLayout();

			empInfo1.emp401k_matchingFund("2%");
			empInfo1.socialSecurity();

			double pension = EmployeeInfo.calculateEmployeePension();
			System.out.println("Pension Accrued: $" + pension);

			System.out.println();


			//...................... employee #2 ..............................

			EmployeeInfo empInfo2 = new EmployeeInfo(2, "Papri B. Chowdhury", "201", 40.00, 50.00);
			EmployeeEssentials employeeEssentials2 = new EmployeeInfo();

			int id2 = empInfo2.employeeId();
			System.out.println("Employee_Id: " + id2);

			String name2 = empInfo2.employeeName();
			System.out.println("Employee_Name: " + name2);

			empInfo2.setSsNumber("987654321");
			String ssn2 = empInfo2.getSsNumber();
			System.out.println("SS_Number: " + ssn2);

			empInfo2.setDOB("01-01-1918");
			String dob2 = empInfo2.getDOB();
			System.out.println("DOB: " + dob2);

			employeeEssentials2.display(2,"pbc@soup2nuts.com");
			employeeEssentials2.display("Papri B. ", "exciting2020@gmail.com");

			empInfo2.assignDepartment();

			double totalSalary2 = empInfo2.calculateSalary();
			System.out.println("Total_Salary: $" + totalSalary2);

			double performaneBonus2 = EmployeeInfo.calculateEmployeeBonus(totalSalary2, 0.08);
			System.out.println("Performance_Bonus: $" + performaneBonus2);

			empInfo1.benefitLayout();

			empInfo2.emp401k_matchingFund("4%");
			empInfo2.socialSecurity();

			double pension2 = EmployeeInfo.calculateEmployeePension();
			System.out.println("Pension Accrued: $" + pension2);


			//................................. Database ...................//


			FortuneEmployee objTest = new FortuneEmployee();

			objTest.create_data(id1, name1,"101", ssn1, dob1, totalSalary1, performaneBonus1);
			objTest.create_data(id2, name2,"201", ssn2, dob2, totalSalary2, performaneBonus2);
			System.out.println("Data Created");

		}  // main ends

	public void create_data(Integer Id, String Name, String Department, String SSN, String DOB, Double Salary, Double Bonus) {

		ConnectionToMySql obj_ConnectionToMySql = new ConnectionToMySql();
		Connection connection = obj_ConnectionToMySql.get_connection();

		PreparedStatement ps = null;
		try {

			String query = "insert into emp(Id,Name,Department,SSN,DOB,Salary,Bonus) values(?,?,?,?,?,?,?)";
			ps = connection.prepareStatement(query);

			ps.setInt(1, Id);
			ps.setString(2, Name);
			ps.setString(3, Department);
			ps.setString(4, SSN);
			ps.setString(5, DOB);
			ps.setDouble(6, Salary);
			ps.setDouble(7, Bonus);

			System.out.println(ps);
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}

	}


}  // class ends
