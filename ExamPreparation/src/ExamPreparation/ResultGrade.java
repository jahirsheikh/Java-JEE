
package ExamPreparation;

import java.util.Scanner;


public class ResultGrade {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.print("Enter any Mark: ");
         int user=input.nextInt();
         
         
         if(user>100){
             System.out.println("Wrong input");}
         else if(user>=80){
             System.out.println("Grade A+");}
         else if(user>=70){
             System.out.println("Grade A");}
        else if(user>=60){
             System.out.println("Grade B");}
        else{
             System.out.println("Invalid");}
    }
    
}
