package question_number_03;

import java.util.Scanner;

public class Question_number_03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number ");       
        int n = input.nextInt();
        
        int count = 1;
        
        for (int i = n; i > 1; i--) {
            count = count * i;
        }
        System.out.println("Calculate of Factorial number is " + count);
    }
}
