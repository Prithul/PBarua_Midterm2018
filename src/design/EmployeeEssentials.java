package design;

/**
 * Author: Papri Barua
 */

public abstract class EmployeeEssentials implements Employee {

    private String ssNumber;
    private String DOB;

    final double medical = 15000.00;
    final double tution_Reimbursement = 15000.00;
    final String Sick_Leave = "5 days";
    final String Paid_Holidays = "10 days";

    public String getSsNumber() {
        return ssNumber;
    }

    public void setSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }


    public abstract void emp401k_matchingFund(String match);
    public abstract void socialSecurity();

    public double Life_Insurance(double totalSalary){

        double totalSal = totalSalary;

        double life_Insurance = 1 * totalSal;

        return life_Insurance;
    }

    // method() overloading
    public void display(String name, String email){

        String employeename = name;
        String personalEmail = email;

        System.out.println("Personal_Email of " + employeename + " : " + personalEmail);
    }

    // // method() overloading
    public void display(int id, String email){

        int employeeId = id;
        String officeEmail = email;

        System.out.println("Office_Email of employeeId " + employeeId + " : " + officeEmail);
    }

}
