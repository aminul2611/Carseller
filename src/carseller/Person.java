
package carseller;

import java.util.Scanner;

public class Person {
    protected String P_id;
    protected String P_name;
    protected String Email;
    protected String PhoneNo;
    
    Scanner input = new Scanner(System.in);
    
    protected void inputP_id(){
        System.out.println("Please enter your id: ");
        P_id= input.nextLine();
    }
    protected String getP_id(){
       return P_id;
    }
    protected void PrintP_id(){
        System.out.println("\nId: "+P_id);
    }
    
    protected void inputP_name(){
        System.out.println("Please enter your name: ");
        P_name= input.nextLine();
    }
    protected String getP_name(){
       return P_name;
    }
    protected void PrintP_name(){
      System.out.println("Name: "+P_name);
    }
    protected void inputEmail(){
        System.out.println("Please enter your Email: ");
        Email= input.nextLine();
    }
    protected String getEmail(){
       return Email;
    }
    protected void PrintEmail(){
      System.out.println("Email: "+Email);
    }
    protected void inputPhoneNo(){
        System.out.println("Please enter your Phone no: ");
        PhoneNo= input.nextLine();
    }
    protected String getPhoneNo(){
       return PhoneNo;
    }
    protected void PrintPhoneNo(){
      System.out.println("Phone number: "+PhoneNo);
    }
    protected void PersonInfo(){
        System.out.println("1. Manager\n"+"2. Second Manager\n"+"3. Customer\n"+"4. FinancialOfficer\n"+"5. Marketing\n"+"6. SalesOfficer\n"+"7. Cars");
    }
    
}
