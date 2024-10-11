import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0, sbt;
        int num1;

        System.out.print("Please enter the number: ");
        num1 = scan.nextInt();

        sbt = num1;

        int data = (int) Math.log10(num1) + 1;

        int[] z = new int[data];

        for (int i = data - 1; i >= 0; i--) {
            z[i] = num1 % 10;
            num1 /= 10;
        }

        for (int i = 0; i < data; i++) {
            result += Math.pow(z[i], data);
        }

        if (result == sbt) {
            System.out.println(sbt + " is an Armstrong number.");
        } else {
            System.out.println(sbt + " is not an Armstrong number.");
        }
    }
}
