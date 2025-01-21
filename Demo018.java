class MinutesToYears {
    void minToYrs(int minutes) {
        int year = minutes / (365 * 24 * 60);
        System.out.println("Years: " + year);

        int days = (minutes / (24 * 60)) % 365;
        System.out.println("Days: " + days);

        int hours = (minutes / 60) % 24;
        System.out.println("Hours: " + hours);

        int remainingMinutes = minutes % 60;
        System.out.println("Minutes: " + remainingMinutes);
    }
}

public class Demo018 {
    public static void main(String[] args) {
        int minutes = 5000000; 

        MinutesToYears obj = new MinutesToYears();
        obj.minToYrs(minutes);
    }
}
