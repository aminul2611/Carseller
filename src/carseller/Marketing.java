
package carseller;

import java.util.Scanner;

public class Marketing implements Persons {
    protected String Designation = "Marketing Officer";
    protected String P_id = "MA-35-01";
    protected String P_name = "Sajal";
    protected String Email = "Sajal@gamil.com";
    protected String PhoneNo = "01923412879";
    
    Scanner input = new Scanner(System.in);
   
    protected String getDesignation(){
       return Designation;
    }
    protected void PrintDesignation(){
        System.out.println("Designation: "+Designation);
    }
    protected void viewCarList(){
        System.out.println("Do you want to see the car list?\n"+
        "Yes = 1 input or NO = 0 input");
        int see = input.nextInt();
        System.out.println("You input:"+see);
        if(see == 1){
            Cars iCars = new Cars();
            iCars.carsName();
            
            
    }
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
