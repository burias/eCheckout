package echeckout;

class CheckoutClass {

    private String userSelection;
    private String itemSelection;
    private int test;

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

}
