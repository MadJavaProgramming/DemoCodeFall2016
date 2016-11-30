package java111.project5;

import java.text.DecimalFormat;  // used only for the decimal format example

/** Demonstration of formatting numbers using the Math class
 *  and the String.format method
 *  @author pwaite
 */

public class NumberFormatDemo {

    /** runs the number format demo
     * @param command line arguments
     */
     
    public static void main(String[] args) {
        
        System.out.println();
        //Rounding examples
        
        System.out.println("Math.round(8.567) = " + Math.round(8.567));
        System.out.println();
        
        // round to the nearest tenth
        
        System.out.println("Math.round(8.567 * 10.0)/10.0 = " + Math.round(8.567 * 10.0)/10.0);
        System.out.println();
        
        // round to the nearest hundredth
        System.out.println("Math.round(8.567 * 100.0)/100.0 = " + Math.round(8.567 * 100.0)/100.0);
        System.out.println();

        // formatting numbers  - Chapter 10, page 294-305
        
        System.out.println("Adding in a commas to 57349308, using String.format(...) => " + String.format("%, d", 57349308));
        System.out.println();
        
        
        System.out.println("Rounding 2134884.7896, using String.format(...) => " + String.format("%.2f", 2134884.7896));
        System.out.println();
    
        System.out.println("Rounding and commas 2134884.7896, using String.format(...) => " + String.format("%,.2f", 21345234.7896));
        System.out.println();
    
    
    }

}
