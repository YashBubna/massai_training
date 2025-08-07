package com.masai.main;

import com.masai.enity.Order;
import com.masai.enums.Day;
import com.masai.enums.OrderStatus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int result = addNumbers(1,2,3,4,5);
//        System.out.println(result);

        Day today = Day.THURSDAY;

        switch (today){
            case MONDAY -> System.out.println("Start of the week");
            case SATURDAY -> System.out.println("End of the week");
            default -> System.out.println("Other days");
        }

        Order order1 = new Order(101, OrderStatus.DELIVERED);
        order1.printDetails();
    }

//    public static int addNumbers(int... nums) {
//        int sum = 0;
//        for (int n : nums) {
//            sum += n;
//        }
//        return sum;
//    }
}