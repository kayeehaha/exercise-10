public class StoreOneA extends StoreToRent {
    
    private boolean specialCustomer;
    private double monthlyPayment;
    private static final double DISCOUNT_RATE = 0.10; 

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    @Override
    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
        }
        return monthlyPayment;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "\nLOAN DETAILS (if applicable):" +
               "\nLoan Amount: " + getLoanAmount() +
               "\nLoan Payment Term: " + getLoanPaymentTerm() +
               "\nInterest Rate: " + getInterestRate() +
               "\nSpecial Customer: " + specialCustomer +
               "\nMonthly Loan Payment: " + calculateLoanFinancing();
    }
}
