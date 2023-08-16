
package educationmanagement;

import Education.Student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class EducationManagement {

   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Student student = new Student();
        
       Student [] students = {
           new Student("aasad", 25),
           new Student("aasad", 22),
           new Student("aasad", 95),
       };
        
        FileOutputStream fileoutstrem = new FileOutputStream("Student.dat");
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutstrem);
        
        objectoutputstream.writeObject(students);
        
        
        FileInputStream fileinputstream = new FileInputStream("Student.dat");
        ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
        
        Student[] newStudent = (Student[])objectinputstream.readObject();
 
            System.out.println(Arrays.toString(newStudent));
            
           
    }
    
}
