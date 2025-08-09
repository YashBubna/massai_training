package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        OldDateExample();
        NewDateExample();

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");

        System.out.println(names);

    }

    public static void OldDateExample() {
        Date date = new Date();
        System.out.println(date);
    }

    public static void NewDateExample() {
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
    
}