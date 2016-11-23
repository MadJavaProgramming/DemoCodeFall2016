package java111.project5;

/** This is demonstration creating a unit test for Policy 
 *  @author pwaite
 **/
 
 public class TestPolicy {
 
     public static void main(String[] args) {
         // instantiate the class you want to test
         Policy policy = new AutoPolicy();
         
         // set any necessary instance variables
         policy.setPremium(500);
         
         // call the method you want to test
         String actual = policy.formatPremium();
         
         // create a variable to hold the expected value
         String expected = "$500.00";
         
         // compare the actual and expected values
         if (expected.equals(actual)){
             System.out.println("Premium format: Success");
         } else {
             System.out.println("Premium format: Fail");
         }
    
     }
 
 }
