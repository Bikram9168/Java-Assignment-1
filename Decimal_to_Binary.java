import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);

        System.out.println("Binary number is: " + binary);
    }
    }

