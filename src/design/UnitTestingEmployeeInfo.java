package design;

import algorithm.Sort;
import org.testng.Assert;
import string.problems.Palindrome;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.

        EmployeeInfo empInfo;


        try {
            double sal = 100000;
            double percentage = 0.1;
            double expected = 10000;
            Assert.assertEquals(EmployeeInfo.calculateEmployeeBonus(sal,percentage), expected);
            System.out.println("Unit test for 'calculateEmployeeBonus()' is passed");
        }catch (AssertionError as){
            System.out.println("Unit test for 'calculateEmployeeBonus()' is failed");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


        try {
            boolean b = true;
            empInfo = new EmployeeInfo(1);
            Assert.assertEquals(empInfo.employeeId(),1);
            System.out.println("Unit test for 'employeeId()' is passed");
        }catch (AssertionError as){
            System.out.println("Unit test for 'employeeId()' is failed");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {

            empInfo = new EmployeeInfo(1,"Prithul Barua");
            Assert.assertEquals(empInfo.employeeName(),"Prithul Barua");
            System.out.println("Unit test for 'employeeName()' is passed");
        }catch (AssertionError as){
            System.out.println("Unit test for 'employeeName()' is failed");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            EmployeeInfo empinfo = new EmployeeInfo ();
            empinfo.setSsNumber("123456789");
            Assert.assertEquals(empinfo.getSsNumber(),"123456789");
            System.out.println("Unit test for 'getSsNumber()' is passed");
        }catch (AssertionError as){
            System.out.println("Unit test for 'getSsNumber()' is failed");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        try {
            EmployeeInfo empinfo = new EmployeeInfo ();
            empinfo.setDOB("01-01-1940");
            Assert.assertEquals(empinfo.getDOB(),"01-01-1940");
            System.out.println("Unit test for 'getDOB()' is passed");
        }catch (AssertionError as){
            System.out.println("Unit test for 'getDOB()' is failed");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

    }
}
