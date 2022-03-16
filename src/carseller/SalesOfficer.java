
package carseller;

import java.util.Scanner;

public class SalesOfficer implements Persons {
    protected String Designation = "SalesOfficer";
    protected String P_id;
    protected String P_name;
    protected String Email;
    protected String PhoneNo;
    
    Scanner input = new Scanner(System.in);
    
    
    protected String getDesignation(){
       return Designation;
    }
    protected void PrintDesignation(){
        System.out.println("Designation: "+Designation);
    }
    
    @Override
    public void inputP_id() {
        System.out.println("Please enter your id: ");
        P_id= input.nextLine();
    }

    @Override
    public void PrintP_id() {
        System.out.println("Id: "+P_id);
    }

    @Override
    public void inputP_name() {
        System.out.println("Please enter your name: ");
        P_name= input.nextLine();
    }

    @Override
    public void PrintP_name() {
        System.out.println("Name: "+P_name);
    }

    @Override
    public void inputEmail() {
        System.out.println("Please enter your Email: ");
        Email= input.nextLine();
    }

    @Override
    public void PrintEmail() {
        System.out.println("Email: "+Email);
    }

    @Override
    public void inputPhoneNo() {
        System.out.println("Please enter your Phone no: ");
        PhoneNo= input.nextLine();
    }

    @Override
    public void PrintPhoneNo() {
        System.out.println("Phone number: "+PhoneNo);
    }
    protected void Carsales(){
         System.out.println("Do you want to see the car list?\n"+
        "Yes = 1 input or NO = 0 input");
        int see = input.nextInt();
        System.out.println("You input:"+see);
        if(see == 1){
            Cars iCars = new Cars();
            iCars.carsName();
            
            System.out.println("Which cars information do you want?");
            int CarNo = input.nextInt();
            System.out.println("You input:"+CarNo);
            iCars.Carsinfo(CarNo);
        }
    }
}
