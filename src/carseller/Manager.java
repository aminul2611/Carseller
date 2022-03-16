
package carseller;

import java.util.Scanner;

public class Manager extends Person{
    private String Designation = "Manager";
    protected String approvSalary = "Yes";
    
    Scanner input = new Scanner(System.in);
    

    protected void PrintDesignation(){
        System.out.println("Designation: \n"+Designation);
    }
    protected void approvSalary(){
        System.out.println("You approve salary YES or NO ");
        approvSalary = input.nextLine();
    }
    
}
