public class Demo068 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("Count of even numbers from 1 to 100: " + count);
    }
}
