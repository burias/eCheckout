package echeckout;

import java.util.Scanner;

/**
 *
 * @author Bryan Urias
 */
public class UI {

    public UI() {
        CheckoutClass checkout = new CheckoutClass();
        Scanner input = new Scanner(System.in);
        String userInput, itemChoice;
        boolean userSelection = true, itemSelection = true;

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
                    System.out.println("User set to Student");
                    userSelection = false;
                    break;
                case "2":
                    //Set user selection to Teacher and break out of user selection loop
                    checkout.setuserSelection("Teacher");
                    System.out.println("User set to Teacher");
                    break;
                default:
                    System.out.println("Sorry, that seems like an invalid input. Please try again.");
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
                    break;
                case "Teacher":
                    teacherItemSelect();
                    break;
                default:
                    System.out.println("Something went wrong while selecting your items. Please restart the program.");
                    itemSelection = false;
                    break;
            }
        } while (itemSelection);
        System.out.print("The Item(s) that can be checked out are:\n"
                + "-Laptop(s)\n"
                + "-Tablet(s)\n"
                + "-Calculator(s)\n");
        System.out.print("What Item(s) will you be checking out: ");
        String IS = input.next();
        checkout.setitemSelection(IS);

        System.out.println("\neCheckout Profile");
        System.out.println("\n----------------");
        System.out.printf("\n%s %s", "User Selection:", checkout.getuserSelection());
        System.out.printf("\n%s %s", "Item Selection:", checkout.getitemSelection());

    }

    public void studentItemSelect() {

    }

    public void teacherItemSelect() {

    }
}
