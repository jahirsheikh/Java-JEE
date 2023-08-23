
package jahir;


public class Recursion {
    public static void main(String[] args) {
//        int result = unkown(5);
//        
//        System.out.println(result);
        
        int result1 = fib(6);
        System.out.println(result1);
    }
    
    
//    public static int unkown(int n){
//    if(n>0){
//        System.out.println("n = "+n);
//    return n * unkown(n-1);
//    }else {
//    return 1;
//    }
//    }
    
    public static int fib(int index){
    
        if (index==0) {
            return 0;
        }else if(index ==1){
            return 1;
        }else{
        
//            System.out.println(fib(index-1)+fib(index-2));
            
            return fib(index-1)+fib(index-2);
        }
 
        
    }
    
}
