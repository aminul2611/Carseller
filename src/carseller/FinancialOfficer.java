/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carseller;

import java.util.Scanner;

/**
 *
 * @author IropSuoires
 */
public class FinancialOfficer implements Persons {
    protected String Designation = "Marketing Officer";
    protected String P_id = "MAR-12-01";
    protected String P_name = "Pranto";
    protected String Email = "Pranto@gamil.com";
    protected String PhoneNo = "01923476549";
    
    Scanner input = new Scanner(System.in);
   
    protected String getDesignation(){
       return Designation;
    }
    protected void PrintDesignation(){
        System.out.println("Designation: "+Designation);
    }
    
        
    protected void set_salary(){
        Manager iManager = new Manager();
        System.out.println("View salary approvel");
        
        if(iManager.approvSalary.equalsIgnoreCase("Yes")){
            System.out.println("Salary Approved\n");
        }
        else if(iManager.approvSalary.equalsIgnoreCase("No")){
            System.out.println("Sorry Salary list rejected\n");
        
        }
    
    /*boolean value = input.nextBoolean();
        if (value) {
            
        }*/
    
}

    @Override
    public void PrintP_id() {
        System.out.println("Id: "+P_id);
    }


    @Override
    public void PrintP_name() {
        System.out.println("Name: "+P_name);
    }


    @Override
    public void PrintEmail() {
        System.out.println("Email: "+Email);
    }

    @Override
    public void PrintPhoneNo() {
        System.out.println("Phone number: "+PhoneNo);
    }

    @Override
    public void inputP_id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputP_name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inputPhoneNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
