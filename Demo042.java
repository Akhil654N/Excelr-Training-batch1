import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a lowercase character: ");
        char inputChar = scanner.next().charAt(0);
        
        if (Character.isLowerCase(inputChar)) {
            char upperChar = Character.toUpperCase(inputChar);
            System.out.println("Uppercase character: " + upperChar);
        } else {
            System.out.println(inputChar + " is not a lowercase character.");
        }
        
        scanner.close();
    }
}
