import java.util.*;
import java.util.LinkedList;

class Doctor {
    private final String name;
    private final int age;

    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class rawan {
    public static void main(String[] args) {
        // Task One: Array List
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("rawan");
        arrayList.add("fayez");
        arrayList.add("daraghmeh");
        System.out.println("Array List: " + arrayList);
        arrayList.remove(2);
        System.out.println("Array List after removing element at index 2: " + arrayList);
        System.out.println("Size of the Array List: " + arrayList.size());
        System.out.println("Element at index 0 of the Array List: " + arrayList.get(0));
        arrayList.set(0, "roro");
        System.out.println("Array List after setting element at index 0 to roro: " + arrayList);
        arrayList.clear();
        System.out.println("Array List after clearing all elements: " + arrayList);

        // Task Two: Linked List
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("rawan");
        linkedList.add("fayez");
        linkedList.add("daraghmeh");
        System.out.println("Linked List: " + linkedList);
        linkedList.remove("rawan");
        System.out.println("Linked List after removing rawan: " + linkedList);
        System.out.println("Size of the Linked List: " + linkedList.size());
        System.out.println("Element at index 0 of the Linked List: " + linkedList.get(0));
        linkedList.set(0, "roro");
        System.out.println("Linked List after setting element at index 0 to roro: " + linkedList);
        linkedList.addFirst("rr");
        linkedList.addLast("ss");
        System.out.println("Linked List after adding rr to first and ss to last: " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Linked List after removing first and last elements: " + linkedList);
        linkedList.clear();
        System.out.println("Linked List after clearing all elements: " + linkedList);

        // Task Three: Array List of doctors Class
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("rr", 35));
        doctors.add(new Doctor("jj", 40));
        System.out.println("Doctors List: " + doctors);
    }
}
