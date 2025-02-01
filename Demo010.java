
    import java.util.Scanner;
public class Demo010 {
    String name = "bunny";
    long account_no = 454545;
    Double balance = 10000.00;

    void account_details() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = scanner.nextLine();
        System.out.print("Enter the account number: ");
        account_no = scanner.nextLong();
    }
    void display_details(){
        System.out.println("Hello "+ name);
        System.out.println("Your account number is: "+ account_no);
        System.out.println("Your balance is: "+ balance);
    }
    public static void main(String[] args) {
        Demo010 obj=new Demo010();
        obj.account_details();
        obj.display_details();
    }

}

