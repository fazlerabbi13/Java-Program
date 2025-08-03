import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

        array.add("Java");
        array.add("Python");
         array.add("DSA");

        

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();


        if(str1=="DSA"){
            array.remove("DSA");
        }

        System.out.println(array);

    }
}
