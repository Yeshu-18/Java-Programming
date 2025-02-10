class LoanCalculator {
    double calculateLoan(double principal, double interestRate) {
        return principal + (principal * interestRate / 100);
    }

    double calculateLoan(double principal, double interestRate, int tenure) {
        return principal + (principal * interestRate * tenure / 100);
    }

    double calculateLoan(double principal, double interestRate, int tenure, double processingFee) {
        return principal + (principal * interestRate * tenure / 100) + processingFee;
    }

    public static void main(String[] args) {
        LoanCalculator loan = new LoanCalculator();
        
        System.out.println("Personal Loan Amount: " + loan.calculateLoan(10000, 5));
        System.out.println("Home Loan Amount: " + loan.calculateLoan(10000, 5, 10));
        System.out.println("Car Loan Amount: " + loan.calculateLoan(10000, 5, 5, 500));
    }
}
