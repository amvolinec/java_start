package ATM;

public class Account {
    private int customerNumber;
    private int pinNumber;
    private double totalBalance = 0;

    public Account(int customerNumber,int pinNumber,double totalBalance){
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

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
