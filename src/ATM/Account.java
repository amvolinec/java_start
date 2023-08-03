package ATM;

public class Account {
    private int customerNumber;
    private String pinNumber;
    private double totalBalance = 0;

    public Account(int customerNumber, String pinNumber, double totalBalance) {
        this.customerNumber = customerNumber;
        this.pinNumber = pinNumber;
        this.totalBalance = totalBalance;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void showBalance() {
        System.out.println("Your balance: " + this.getTotalBalance());
    }
}
