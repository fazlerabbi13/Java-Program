import java.util.ArrayList;

public class LoopOnArrayList {
    public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // access item
  //  System.out.println( cars.get(1));
      cars.set(1,"Toyota");
      System.out.println(cars);
    // for (int i = 0; i < cars.size(); i++) {
    //   System.out.println(cars.get(i));
    // }


  }
}
