package Practic_8;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 1;

        while (number != 0) {
            if (count % 2 != 0) {
                System.out.println(number);
            }

            number = input.nextInt();
            count++;
        }

        input.close();
    }
}
