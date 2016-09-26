/** 
 * Demo class for arrays of primitives
 * 
 * @author pwaite
 */
 
 public class ArrayTestDrive {
 
     /**
      * Create and test an array of doubles
      *
      * @param the command line arguments
      */
     public static void main(String[] args) {
         // create an array that will hold 6 doubles
         double[] doubleArray = new double[6];
         int counter = 0;
         
         doubleArray[0] = 9.99;
         doubleArray[1] = 19.99;
         doubleArray[2] = 29.99;
         doubleArray[3] = 39.99;
         doubleArray[4] = 49.99;
         doubleArray[5] = 59.99;
         
         // display each item in the array
         while (counter < doubleArray.length){       
             System.out.println("The value at index " + counter + " is: " + doubleArray[counter]);        
             counter++;
         }
         
         System.out.println();
         System.out.println("********************The for loop follows ****************");
         System.out.println();
         
         for (int counter2 = 0; counter2 < doubleArray.length; counter2++) {
         System.out.println("The value at index " + counter2 + " is: " + doubleArray[counter2]);     
         }
         
        
     }
 
 }
     
