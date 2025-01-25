import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an uppercase character: ");
        char inputChar = scanner.next().charAt(0);
        if (Character.isUpperCase(inputChar)) {
            char lowerChar = Character.toLowerCase(inputChar);
            System.out.println("Lowercase character: " + lowerChar);
        } else {
            System.out.println(inputChar + " is not an uppercase character.");
        }
        
        scanner.close();
    }
}