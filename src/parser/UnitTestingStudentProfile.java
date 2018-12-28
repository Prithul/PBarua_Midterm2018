package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        Student student = new Student("Prithul", "Khanna Barua", "200%", "123");

        //Unit test for getFirst name
        try{
            Assert.assertEquals(student.getFirstName(),"Prithul");
            System.out.println("Unit Test Passed for FirstName");
        }catch ( AssertionError as){
            System.out.println("Unit Test Failed for FirstName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getLast name
        try{
            Assert.assertEquals(student.getLastName(),"Khanna Barua");
            System.out.println("Unit Test passed for lastName");
        }catch (AssertionError as){
            System.out.println("Unit Test Failed for lastName");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getScore name
        try{
            Assert.assertEquals(student.getScore(),"200%");
            System.out.println("Unit Test passed for Score");
        }catch (AssertionError as){
            System.out.println("Unit Test Failed for Score");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }

        //Unit test for getID name
        try{
            Assert.assertEquals(student.getId(),"123");
            System.out.println("Unit Test passed for Id");
        }catch (AssertionError as){
            System.out.println("Unit Test Failed for Id");
            System.out.println(as.getMessage());
            System.out.println(as.getStackTrace());
        }


    }
}
