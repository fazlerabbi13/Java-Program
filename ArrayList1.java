
import java.util.ArrayList;

class ArrayList1 {
    public static void main (String[] args) {
        
      	ArrayList <Integer> array = new ArrayList <Integer>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        // delete elements by using index
        array.remove(2);

        // delete elements by using value
        array.remove(3);

        //  set element in specific index on arrayList
         array.set(3, 8);


        System.out.println(array);
      	
    }
}
