import java.util.Scanner;

public class StoreToRent {
    
    private static final double MAINTENANCE_COST = 1000;
    private static final double INTEREST_RATE = 0.25; 
    private String storeName;
    private String storeBusiness;
    private double totalArea;
    private double sellingPrice;
    private double rent;
    private String minimumLeasePeriod;
    private String floorNumber;
    private boolean available;
    private boolean loanRequired;
    private double loanAmount;
    private int loanPaymentTerm;

    public StoreToRent(boolean loanRequired, double loanAmount, int loanPaymentTerm) {
        this.loanRequired = loanRequired;
        this.loanAmount = loanAmount;
        this.loanPaymentTerm = loanPaymentTerm;
    }

    public double getInterestRate() { return INTEREST_RATE; }
    public boolean isLoanRequired() { return loanRequired; }
    public double getLoanAmount() { return loanAmount; }
    public int getLoanPaymentTerm() { return loanPaymentTerm; }

    public void enterStoreDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Store Name: ");
        storeName = input.nextLine();
        System.out.println("Enter Store Business: ");
        storeBusiness = input.nextLine();
        System.out.println("Enter Total Area: ");
        totalArea = input.nextDouble();
        System.out.println("Enter Selling Price: ");
        sellingPrice = input.nextDouble();
        System.out.println("Enter Rent: ");
        rent = input.nextDouble();
        input.nextLine();  
        System.out.println("Enter Minimum Lease Period: ");
        minimumLeasePeriod = input.nextLine();
        System.out.println("Enter Floor Number: ");
        floorNumber = input.nextLine();
        System.out.println("Enter Available (true/false): ");
        available = input.nextBoolean();
        input.close();
    }

    public double calculateLoanFinancing() {
        if (loanRequired) {
            return (loanAmount * (1 + INTEREST_RATE)) / loanPaymentTerm;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\nStore Name: " + storeName +
               "\nStore Business: " + storeBusiness +
               "\nTotal Area (sq.m): " + totalArea +
               "\nSelling Price: €" + sellingPrice +
               "\nRent: €" + rent +
               "\nMinimum Lease Period: " + minimumLeasePeriod +
               "\nFloor Number: " + floorNumber +
               "\nMaintenance Cost: €" + MAINTENANCE_COST +
               "\nAvailable: " + available;
    }
}
