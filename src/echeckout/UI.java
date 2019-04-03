package echeckout;

import java.util.Scanner;

/**
 *
 * @author Bryan Urias
 */
public class UI {

    private static final CheckoutClass checkout = new CheckoutClass();
    private Scanner input = new Scanner(System.in);
    private String userInput, itemChoice;
    private boolean userSelection = true, itemSelection = true;

    public UI() {

        /*/*=========================================================================================================
        Begin user selection.
        User picks the number associated with the type of user they are.
        /*=========================================================================================================*/
        do {
            System.out.print(""
                    + "Are you a Student or Teacher?\n"
                    + "Enter 1 for Student.\n"
                    + "Enter 2 for Teacher.\n");
            userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    //Set user selection to Student and break out of user selection loop
                    checkout.setuserSelection("Student");
                    System.out.println("User set to Student\n");
                    userSelection = false;
                    break;
                case "2":
                    //Set user selection to Teacher and break out of user selection loop
                    checkout.setuserSelection("Teacher");
                    System.out.println("User set to Teacher\n");
                    break;
                default:
                    System.out.println("Sorry, that seems like an invalid input. Please try again.\n");
            }
        } while (userSelection);

        /*=========================================================================================================
        Begin item selection.
        User picks the number associated with the item, then CheckoutClass sets 
        the type of item to be checked out for the indivudual. If it is a Teacher
        then the loop will continue until they have checked out as many items as they need.
        /*=========================================================================================================*/
        do {
            switch (checkout.getuserSelection()) {
                case "Student":
                    studentItemSelect();
                    itemSelection = false;
                    break;
                case "Teacher":
                    teacherItemSelect();
                    itemSelection = false;
                    break;
                default:
                    System.out.println("Something went wrong while selecting your items. Please try again.");
                    break;
            }
        } while (itemSelection);
        
    }

    public void studentItemSelect() {
        boolean studentItemSelectControl = true;
        //Student Checkout runs only once
        do {            
            System.out.print("The Item(s) that can be checked out are:\n"
                    + "1. Laptop(s)\n"
                    + "2. Tablet(s)\n"
                    + "3. Calculator(s)\n"
                    + "Please enter the number associated with item that you wish to check out.");
            userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    checkout.setitemSelection("Laptop");
                    System.out.println("Selected Laptop");
                    studentItemSelectControl = false;
                    break;
                case "2":
                    checkout.setitemSelection("Tablet");
                    System.out.println("Selected Tablet");
                    studentItemSelectControl = false;
                    break;
                case "3":
                    checkout.setitemSelection("Calculator");
                    System.out.println("Selected Calculator");
                    break;
                default:
                    System.out.println("Something went wrong setting the item choice. Please try again.");
            }
        } while (studentItemSelectControl);
    }

    public void teacherItemSelect() {
        boolean teacherItemSelectControl = true;
        do {            
            System.out.print("The Item(s) that can be checked out are:\n"
                    + "1. Laptop(s)\n"
                    + "2. Tablet(s)\n"
                    + "3. Calculator(s)\n"
                    + "Please enter the number associated with item that you wish to check out.");
            userInput = input.nextLine();
            switch (userInput) {
                case "1":
                    checkout.setitemSelection("Laptop");
                    break;
                case "2":
                    checkout.setitemSelection("Tablet");
                    break;
                case "3":
                    checkout.setitemSelection("Calculator");
                    break;
                default:
                    System.out.println("Something went wrong setting the item choice. Please restart the program.");
            }
        } while (teacherItemSelectControl);
    }
}
