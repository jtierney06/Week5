import java.text.NumberFormat;

public class Election {
    public static void main(String[] args) {
        int ny1 = 314159;
        int nj1 = 89008;
        int cn1 = 213451;
        int a = ny1 + nj1 + cn1;

        int ny2 = 271860;
        int nj2 = 121032;
        int cn2 = 231034;
        int c = ny2 + nj2 + cn2;

        int total = a + c;
        double a_percent = (double) a / total;
        double c_percent = (double) c / total;

        NumberFormat percent = NumberFormat.getPercentInstance();
        percent.setMaximumFractionDigits(2);
        System.out.println("Candidate A: " + percent.format(a_percent));
        System.out.println("Candidate C: " + percent.format(c_percent));
    }
}