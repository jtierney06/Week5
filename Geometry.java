import java.util.Scanner;
import java.text.NumberFormat;
public class Geometry {
    public static void main(String[] args){
        int m;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
        m = input.nextInt();
        System.out.print("Give me another number and make it smaller than the first ");
        n = input.nextInt();
        input.close(); 
        int side_one = (m * m) - (n * n);
        int side_two = 2 * (m * n);
        int hypotenuse = (m * m) + (n * n);
        double cost = (2.412 * side_one) + (3.767 * side_two) + (15.758 * hypotenuse);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("The cost of the triple is: " + money.format(cost));
    }
}
