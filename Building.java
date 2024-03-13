import java.util.Scanner;
import java.text.NumberFormat;
public class Building {
    public static void main (String[] args){
        int poles;
        Scanner input = new Scanner(System.in);
        System.out.print("How many poles will you need? ");
        poles = input.nextInt();
        input.close();
        double diameter = 3.0;
        double height = 5.0;
        double radius = diameter/2;
        double volume = 3.14 * (radius * radius) * height;
        double volume_poles = volume * poles;
        NumberFormat concrete = NumberFormat.getNumberInstance();
        System.out.println("You need this much concrete " + concrete.format(volume_poles));
        double cost = (volume_poles / 27) * 12.98;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("The cost of the concrete is: " + money.format(cost));

    }
}
