
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
         numbers.add(24);
         numbers.add(20);
         numbers.add(21);
         numbers.add(18);
         numbers.add(15);
         numbers.add(30);
         numbers.add(25);

         Collections.sort(numbers);

         for(int i: numbers){
            System.out.println(i);
         }
    }
}
