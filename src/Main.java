import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scn.nextDouble();
        System.out.print("Enter y: ");
        double y = scn.nextDouble();

        new Mathemat1(x,y);
        double result1 = Mathemat1.getRes();
        System.out.println(result1);

        new Mathemat2(x,y);
        double result2 = Mathemat2.getRes();
        System.out.println(result2);
    }
}
