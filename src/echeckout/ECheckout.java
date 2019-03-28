
package echeckout;

import java.util.Scanner;

/**
 *
 * @author tgdra
 */
public class ECheckout {

    
    public static void main(String[] args) {
        
        CheckoutClass CoC = new CheckoutClass();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Are you a Student or Teacher trying to checkout: ");
        String US = input.next();
        CoC.setuserSelection(US);
        
        System.out.print("The Item(s) that can be checked out are:\n"
                + "-Laptop(s)\n"
                + "-Tablet(s)\n"
                + "-Calculator(s)\n");
        System.out.print("What Item(s) will you be checking out: ");
        String IS = input.next();
        CoC.setitemSelection(IS);

        
        
        
        System.out.println("\neCheckout Profile");
        System.out.println("\n----------------");
        System.out.printf("\n%s %s", "User Selection:", CoC.getuserSelection());
        System.out.printf("\n%s %s", "Item Selection:", CoC.getitemSelection());
    }
    
}
