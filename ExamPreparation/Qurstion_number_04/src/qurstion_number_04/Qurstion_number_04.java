package qurstion_number_04;

import java.util.Scanner;

public class Qurstion_number_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = input.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count =count + 1;
            }
        }
        if (count == 2) {
            System.out.println("Number is Prime ");
        } 
        else {
            System.out.println("Number is not Prime ");
        }
    }
}
