import java.util.Scanner;
public class Sleep {
    public static void main (String[] args){
        int year;
        int month;
        int day;
        int year2;
        int month2;
        int day2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday: ");

        System.out.print("Enter your birth year: " );
        year = input.nextInt();
        System.out.print("Enter your birth month: ");
        month = input.nextInt();
        System.out.print("Enter your birth day: ");
        day = input.nextInt();
        System.out.println("Enter todays date: " );
        System.out.print("Enter the year: ");
        year2 = input.nextInt();
        System.out.print("Enter the month: ");
        month2 = input.nextInt();
        System.out.print("Enter the day: ");
        day2 = input.nextInt();
        input.close();
        int years = year2 - year;
        int years_to_days = years * 365;
        int months = month2 - month;
        int months_to_days = months * 30;
        
        int days_alive = years_to_days + months_to_days;
        System.out.println("You have been alive for: " + days_alive + " days");
        int hours = days_alive * 8;
        System.out.println("You have slept for " + hours + " hours");

    }
}
