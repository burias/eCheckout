package echeckout;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Tanner Graham
 */
public class CheckoutClass {

    private String userSelection;
    private String itemSelection;
    //Counter to show how many instances of the class have been created
    private final AtomicInteger counter = new AtomicInteger();

    public CheckoutClass() {
        counter.incrementAndGet();
    }
    
    
    public void setuserSelection(String userSelection) {
        this.userSelection = userSelection;
    }

    public String getuserSelection() {
        return userSelection;
    }

    public void setitemSelection(String itemSelection) {
        this.itemSelection = itemSelection;
    }

    public String getitemSelection() {
        return itemSelection;
    }

    public void teacherSelection(String userSelection) {
        if ("Teacher".equals(this.userSelection)) {
            String Teacher = this.userSelection;

        }
    }

    public int getInstanceCount() {
        return counter.get();
    }

}
