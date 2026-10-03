import java.util.Scanner;

public class SolarSystem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter energy generated: ");
        double energy = sc.nextDouble();

        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }
    }
}