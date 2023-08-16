
package evidenceexam;

import java.util.Arrays;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;


public class EvidenceExam {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] myArray = new int[100];
        
        for (int i = 0; i <myArray.length; i++) {
                myArray[i] = (int) (Math.random()*100);
          
        }
        System.out.println(Arrays.toString(myArray));
        
        System.out.print("Enter the index of the array: ");
        try {
                    // Display the corresponding element value
			System.out.println("The corresponding element value is " + 
				myArray[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
    }
    
}
