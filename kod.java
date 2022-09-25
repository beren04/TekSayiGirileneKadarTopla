package first;

import java.util.Scanner;

public class BelliBirSayiGirileneKadarTopla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int total = 0;
        do {
            System.out.print("Enter a number:");
            number = input.nextInt();
            if (number % 2 == 0 || number % 4 == 0) {
                total += number;
            }
        }while (number % 2 == 0) ;
        System.out.print("Total:" + total);
    }
}
