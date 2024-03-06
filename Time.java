import java.util.Scanner;

public class Time {
    public static void main (String[] args){
        int minutes;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        minutes = input.nextInt();
        input.close();
        int time = minutes/60;
        int time2 = minutes % 60;
        System.out.print("The time is: " + time + ":" + time2);
        
    }
}
