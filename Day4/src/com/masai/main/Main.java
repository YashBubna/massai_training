package com.masai.main;

//import com.masai.enity.AdditionOperation;

import com.masai.interfaces.Consumer;
import com.masai.interfaces.MathOperation;
import com.masai.interfaces.NamePrinter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int result = addNumbers(1,2,3,4,5);
//        System.out.println(result);

//        Day today = Day.THURSDAY;
//
//        switch (today){
//            case MONDAY -> System.out.println("Start of the week");
//            case SATURDAY -> System.out.println("End of the week");
//            default -> System.out.println("Other days");
//        }
//
//        Order order1 = new Order(101, OrderStatus.DELIVERED);
//        order1.printDetails();

//        Role role = Role.ADMIN;
//
//        switch (role){
//            case ADMIN -> System.out.println("Welcome admin");
//            case USER -> System.out.println("Welcome user");
//            default -> System.out.println("Guest login");
//        }
//
//        Status s = Status.NOT_FOUND;
//        System.out.println("Status: " + s);
//        System.out.println("Code: " + s.getCode());

//        MathOperation operation  = new AdditionOperation();
//        int result = operation.operate(2,3);
//        System.out.println(result);

        //Lambda Functions---

        //MathOperation add = (a,b) -> a+b;
        MathOperation add = Integer::sum;
        System.out.println(add.operate(2, 3));

        NamePrinter printer = (name) -> System.out.println(name);
        printer.printName("Yash");

        Consumer<String> printerr = (s) -> System.out.println(s);
        printerr.accept("Helloooooo");

        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));

        Function<Integer, String> concatInt = (n) -> "Number - " + n;
        System.out.println(concatInt.apply(120));

        Supplier<Double> getRandomGeneratedValue = () -> Math.random();
        System.out.println(getRandomGeneratedValue.get());

        List<String> names = List.of("Ravi", "Ramesh", "Anu", "Ajay");
        names.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(n -> System.out.println(n));

        filterEvenNumbers();

    }

    public static void filterEvenNumbers() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

    }


//    public static int addNumbers(int... nums) {
//        int sum = 0;
//        for (int n : nums) {
//            sum += n;
//        }
//        return sum;
//    }


}