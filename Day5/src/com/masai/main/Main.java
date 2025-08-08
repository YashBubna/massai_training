package com.masai.main;

import com.masai.entity.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        filterEvenNumbers();
        countWords();
        removeDuplicates();

        Employee e1 = new Employee(1000);
        Employee e2 = new Employee(3000);
        Employee e3 = new Employee(2000);

        List<Employee> employees = Arrays.asList(e1, e2, e3);
        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(sorted);
    }

    public static void filterEvenNumbers() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);

    }

    public static void countWords() {
        List<String> words = Arrays.asList("Apple", "Ball", "Ant", "Rat");
        long count = words.stream()
                .filter(w -> w.startsWith("A"))
                .count();
        System.out.println(count);
    }

    public static void removeDuplicates() {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
        List<Integer> unique = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
    }
}