
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        double second = Integer.parseInt(reader.nextLine());
        
        System.out.println("Division: " + first + " / " + second + " = " + (first/second));
    }
}
