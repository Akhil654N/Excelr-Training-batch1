 public class Demo067 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 55, 33};
        System.out.println("Even elements of the array:");
        for (int i : arr) {
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
    
}