package question_number_02;

public class Question_Number_02 {

    public static void main(String[] args) {

        int[] myArray = {2, 4, 6, 20, 8,};
        int sum = 0;
        System.out.println("Array of elements ");
        
        for (int i = 0; i < myArray.length; i++) {

            System.out.print(myArray[i] + " ");
            
            sum += myArray[i];
        }
        System.out.println("\nSum of the Array elements = " + sum);
    }
}
