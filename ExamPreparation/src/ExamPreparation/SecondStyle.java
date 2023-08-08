
package ExamPreparation;

import java.util.Scanner;


public class SecondStyle {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int n=input.nextInt();
        
        int max=0, min=999999;
        int inputNumber=0;
        
        while(n>0){
            System.out.print("ENTER THE NUMBER : ");
            inputNumber= input.nextInt();
             if(max<inputNumber){
                 max=inputNumber;
             
             }
             
             if( min>inputNumber){
                 min=inputNumber;
             
             }
        --n;
        
        }
        
        System.out.println("Max Number : "+ max);
        System.out.println("Min Number : "+ min);
    }
    
}
