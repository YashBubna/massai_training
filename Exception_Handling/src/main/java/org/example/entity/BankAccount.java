package org.example.entity;

public class BankAccount {

    private int custId;
    private String custName;
    private long custAccountNumber;
    private double custAccountBalance;

    public BankAccount() {
    }

    public BankAccount(int custId, String custName, long custAccountNumber, double custAccountBalance) {
        this.custId = custId;
        this.custName = custName;
        this.custAccountNumber = custAccountNumber;
        this.custAccountBalance = custAccountBalance;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getCustAccountNumber() {
        return custAccountNumber;
    }

    public void setCustAccountNumber(long custAccountNumber) {
        this.custAccountNumber = custAccountNumber;
    }

    public double getCustAccountBalance() {
        return custAccountBalance;
    }

    public void setCustAccountBalance(double custAccountBalance) {
        this.custAccountBalance = custAccountBalance;
    }
}
