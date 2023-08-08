
package ExamPreparation;

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the First Number");
        int number=sc.nextInt();
        
        System.out.println("Enter the Second Number");
        int number2=sc.nextInt();
        
        System.out.println("Enter the Third Number");
        int number3=sc.nextInt();
        
        int maxNumber=0 , minNumber=0;
        
        if(number>number2 && number2>number3){
        maxNumber=number;
        }
        
        else if( number2>number && number2>number3){
            maxNumber=number2;
        
        }
        
        else{
        maxNumber=number3;
        }
       
        System.out.println("Max Number : " +maxNumber);  
        
        
//         int max=0;
//        int min =999999;
//        int sum = 0;
//       
//        for(int i= 1; i<=3; i++)
//        {
//            System.out.println("Pls enter number");
//            int number = sc.nextInt();
//           
//            if (max < number)
//              {
//                max = number;
//              }
//           
//            else if ( min > number)
//                {
//                 min = number;
//                }
//        }
//       
//        sum = max + min;
//       
//        System.out.println(" Max number is "+max);
//        System.out.println(" Min number is "+min);
//        System.out.println("Sum "+max+ " + "+min+ "  = "+sum);
        
        
        
    }
    
}
