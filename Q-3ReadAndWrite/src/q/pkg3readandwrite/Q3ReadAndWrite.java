
package q.pkg3readandwrite;

import Management.Employee;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class Q3ReadAndWrite {

   
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       
        Employee[] employee ={
            
            new Employee ("Jahir", 01),
            new Employee ("Babar", 02)
        };
        
         FileOutputStream file = new FileOutputStream("Employee.dat");
        ObjectOutputStream object = new ObjectOutputStream(file);
        
        object.writeObject(employee);
        
        FileInputStream finleInput = new FileInputStream("Employee.dat"); 
        ObjectInputStream objectinput = new ObjectInputStream(finleInput);
        
        Employee[] newEmployee = (Employee[])objectinput.readObject();
        System.out.println(Arrays.toString(newEmployee));
    }
    
}
