import java.util.LinkedList;

public class LinkedListInJava {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        // Use getFirst() to display the first item in the list
        
        cars.addFirst("BMW");
        System.out.println(cars);
        cars.addLast("Toyota");
        System.out.println(cars);
        
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        System.out.println(cars.removeFirst());
        System.out.println(cars.removeLast());
      }
}
