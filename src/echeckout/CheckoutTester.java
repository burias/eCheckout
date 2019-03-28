/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echeckout;

/**
 *
 * @author Bryan Urias
 */
public class CheckoutTester {

    //Test User selection
    public void userSelectionTester() {
        CheckoutClass myCheckoutClassTester = new CheckoutClass();
        
        //Attempt to select Teacher
        myCheckoutClassTester.setuserSelection("Teacher");
        if(!myCheckoutClassTester.getuserSelection().equals("Teacher")){
            System.out.println("Teacher selection test FAILED.");
        }
        else
            System.out.println("Teacher selection test PASSED.");
        
        //Attempt to select Student
        myCheckoutClassTester.setuserSelection("Student");
        if(!myCheckoutClassTester.getuserSelection().equals("Student")){
            System.out.println("Student selection test FAILED.");
        }
        else
            System.out.println("Student selection test PASSED.");
    }
    
    public void itemSelectorTester(){
        CheckoutClass myCheckoutClassTester = new CheckoutClass();
        
        //Attempt to select Laptop
        myCheckoutClassTester.setitemSelection("Laptop");
        if(!myCheckoutClassTester.getitemSelection().equals("Laptop")){
            System.out.println("Laptop selection test FAILED.");
        }
        else
            System.out.println("Laptop selection test PASSED.");
        
        //Attempt to select Tablet
        myCheckoutClassTester.setitemSelection("Tablet");
        if(!myCheckoutClassTester.getitemSelection().equals("Tablet")){
            System.out.println("Tablet selection test FAILED.");
        }
        else
            System.out.println("Tablet selection test PASSED.");
        
        //Attempt to select Calculator
        myCheckoutClassTester.setitemSelection("Calculator");
        if(!myCheckoutClassTester.getitemSelection().equals("Calculator")){
            System.out.println("Calculator selection test FAILED.");
        }
        else
            System.out.println("Calculator selection test PASSED.");
    }
}
