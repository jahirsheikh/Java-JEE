
package ExamPreparation;

import java.util.Scanner;


public class FindPrimeNumber {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
       
        System.out.println("Enter a Number : ");
        
        int userInpur=input.nextInt();
        int count=0;
        for(int i=1; i<=userInpur; i++){
            if(userInpur %i==0){
                count+=1;
            }
        }
       
        //end the For loops
        
        if(count==2){
            System.out.println("Number is Prime : ");
        }
        
        else{
            
            System.out.println("Number is not Prime : ");}
        
    }
}
