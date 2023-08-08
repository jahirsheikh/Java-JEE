
package ExamPreparation;

import java.util.Scanner;


public class Fectorial {
    
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Enter the Number");
       int n=input.nextInt();

        int fact =1;
        for(int i =1; i<=n; i++){
        fact*=i;
        }
        
        
        System.out.println("This num Factorial = "+fact);
        
        
    }
    
}
