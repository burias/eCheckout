
package echeckout;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author tgdra
 */
public class ECheckout {

    private static final DateFormat CheckoutDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
     
    public static void main(String[] args) {
        
        CheckoutClass CoC = new CheckoutClass();
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Are you a Student or Teacher trying to checkout: ");
        String US = input.next();
        CoC.setuserSelection(US);
        
        
        System.out.print("Please enter school ID number: ");
        String ID = input.next();
        
        if ("Teacher".equals(US)){
        System.out.print("The Item(s) that can be checked out are:\n"
                + "-Laptop(s)\n"
                + "-Tablet(s)\n"
                + "-Calculator(s)\n");
        System.out.print("What Item(s) will you be checking out(Seperate each Item by a comma not a space): ");
        String IS = input.next();
        CoC.setitemSelection(IS);
        }
        
        if ("Student".equals(US)){
        System.out.println("***ATTENTION: Students may only checkout 1 Item!***");
        System.out.print("The Item that can be checked out are:\n"
                + "-Laptop\n"
                + "-Tablet\n"
                + "-Calculator\n");
        System.out.print("What Item will you be checking out: ");
        String IS = input.next();
        CoC.setitemSelection(IS);
        }
        
        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        
        System.out.print("Electronically Sign First and Last Name(Enclude Spaces): ");
        String FN = input.next();
        CoC.setfName(FN);
        String LN = input.next();
        CoC.setlName(LN);
        
        
        System.out.println("\neCheckout Profile/Recipt");
        System.out.println("\n----------------");
        System.out.printf("\n%s %s", "User Selection:", CoC.getuserSelection());
        System.out.printf("\n%s %s", "User ID:", ID);
        System.out.printf("\n%s %s", "Item Selection:", CoC.getitemSelection());
        System.out.printf("\nCheckout Date and Time: ");
        System.out.println(CheckoutDate.format(date));
        System.out.printf("Due Date and Time: ");
        System.out.printf(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
        System.out.println(" 19:00:00 or 7 'o clock");
        System.out.printf("\n\n%s %s %s", "Signature:", CoC.getfName(), CoC.getlName());
        System.out.println("\n\n***End Of Profile/Recipt***");
    }
    
    /*public static void MultiSelect(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to check out more Items? (Y/N): ");
        String answer = input.next();
        if ("Y".equals(answer) || "y".equals(answer)){
            IS = input.next();
            CoC.setitemSelection(IS);
        }
    }*/
    
}
