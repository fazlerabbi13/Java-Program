import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        int num;

        System.out.println("Enter the integer: ");

      
        Scanner scanner = new Scanner(System.in);

        num = scanner.nextInt();

        // if(num%3==0){
        //     if(num%5==0){
        //         System.out.println("multiplicate");
        //     } 
        // }
        // else{
        //     System.out.println("not multiplicate");
        // } 

        

        String var = (num%3==0)?(num%5==0 ? "mul":"not mul"):"nothing";
        System.out.println(var);
    }
}
