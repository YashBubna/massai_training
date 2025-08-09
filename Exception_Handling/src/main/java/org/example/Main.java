package org.example;

import org.example.entity.BankAccount;
import org.example.service.BankAccountService;
import org.example.service.BankAccountServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//        int result = divison(6, 0);
//        System.out.println(result);

        BankAccount account1 = new BankAccount(1, "Yash", 1233444, 5000.00);
        BankAccountService service = new BankAccountServiceImpl();
        System.out.println("Balance in your account - " + service.checkBalance(account1));
        System.out.println("Balance after withdraw - " + service.withdrawAmount(account1, 8000));
    }

//    public static int divison(int n1, int n2) {
//        int result = 0;
//        try {
//            result = n1 / n2;
//        } catch (ArithmeticException e) {
//            System.out.println("Zero is not allowed");
//        }
//        return result;
//    }
}