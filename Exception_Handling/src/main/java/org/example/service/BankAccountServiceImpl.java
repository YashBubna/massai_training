package org.example.service;

import org.example.entity.BankAccount;
import org.example.exception.UnsufficientBalanceException;

public class BankAccountServiceImpl implements BankAccountService {

    BankAccount account;

    public BankAccountServiceImpl() {
    }

    public BankAccountServiceImpl(BankAccount account) {
        this.account = account;
    }

    @Override
    public double checkBalance(BankAccount account) {
        return account.getCustAccountBalance();
    }

    @Override
    public double withdrawAmount(BankAccount account, double amount) {
        if (account.getCustAccountBalance() < amount) {
            try {
                throw new UnsufficientBalanceException("Paisa nhi h");
            } catch (UnsufficientBalanceException e) {
                System.out.println(e.getMsg());
            }

        } else {
            account.setCustAccountBalance(account.getCustAccountBalance() - amount);
            System.out.println("Doneee");
        }
        return account.getCustAccountBalance();
    }

    @Override
    public double depositAmount(BankAccount account, double amount) {
        account.setCustAccountBalance(account.getCustAccountBalance() + amount);
        System.out.println("Amount deposited successfully");
        return account.getCustAccountBalance();
    }
}
