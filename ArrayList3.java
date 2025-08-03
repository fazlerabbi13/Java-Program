
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList3 {
    public static void main(String[] args) {
        
        ArrayList<String> arr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String str5 = scanner.nextLine();

        arr.add(str1);
        arr.add(str2);
        arr.add(str3);
        arr.add(str4);
        arr.add(str5);

        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);

    }
}
