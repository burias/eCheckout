package echeckout;

/**
 *
 * @author Tanner Graham
 */

 class CheckoutClass {
    private String userSelection;
    private String itemSelection;
    private String fName;
    private String lName;
    private int test;
    
    public void setuserSelection(String userSelection){
        this.userSelection = userSelection;
    }
    public String getuserSelection(){
        return userSelection;
    }
    public void setitemSelection(String itemSelection){
        this.itemSelection = itemSelection;
    }
    public String getitemSelection(){
        return itemSelection;
    }
    public void setfName(String fName){
        this.fName = fName;
    }
    public String getfName(){
        return fName;
    }
    public void setlName(String lName){
        this.lName = lName;
    }
    public String getlName(){
        return lName;
    }
    
    
}

