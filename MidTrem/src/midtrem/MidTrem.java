
package midtrem;

import Calculation.Price;
import java.util.Scanner;


public class MidTrem {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Price in= new Price();
        System.out.println("Enter your price: ");
        double price=s.nextDouble();
        System.out.println("Enter your qty: ");
        double qty=s.nextDouble();
        
        double actualPrice =0.0;
        
        in.setPrice(price);
       in.setQty(qty);
       double total=in.calculationtotalprice();
       double discount=0.0;
        if(total>100){
            discount = total*.05;
            actualPrice =total-discount;
        }
        
        else{
            actualPrice =total;
        }
        
        
        System.out.println("total Price :"+ total);
        System.out.println("total Discount :"+ discount);
        System.out.println("PayAmount :"+ actualPrice);

    }
    
}
