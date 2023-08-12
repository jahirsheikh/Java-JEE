
package javafilehandling;

import com.sun.xml.internal.stream.Entity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class JavaFileHandling {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        
        File file = new File("C:\\Users\\user\\Desktop\\Read and Write.txt");
        
        Scanner read = new Scanner(file);
        int line= 1;
        if (file.exists()) {
            String tenWords = " ";
            int count =0;
            while(read.hasNext()){
//                String word= read.next();
                tenWords += read.next()+ " | ";
                count+=1;
                if(count ==10){
                    System.out.println("line no "+line+"---"+tenWords);
                    count++;
                    tenWords = " ";
                    count=0;
                    line +=1;
                }
            
            }
        }
        
//        PrintWriter pw = new PrintWriter(file);
//        
//        pw.println("Hello Java Jahir ");
//        
//        pw.close();
        
//        
//        if(file.length()>0){
//            System.out.println(read.nextLine());
//        
//        }
//        else if(file.length()>10){
//            System.out.println(read.nextLine());
//        
//        }
        
        else{
            System.out.println("File is empty");
        }
      read.close();
    }
    
}
