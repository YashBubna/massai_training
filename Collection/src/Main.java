import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Write report");
        tasks.add("Email client");
        tasks.addFirst("Attend meeting");
        System.out.println(tasks);

        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("Russian");
        countries.add("Japan");
        countries.add("India");
        System.out.println(countries);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(30);
        pq.add(45);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("First");
        dq.addFirst("Second");
        dq.addLast("Zero");
        System.out.println(dq);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Amit");
        map.put(102, "Neha");
        map.put(103, "Anuj");
        System.out.println(map.get(102));

    }
}