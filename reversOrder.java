import java.util.ArrayList;
import java.util.Collections;

public class reversOrder {
    public static void main(String[] args) { 
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    Collections.sort(cars, Collections.reverseOrder()); // Sort myNumbers

    for (String i : cars) {
      System.out.println(i);
    }
  } 
}
