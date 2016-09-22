/** 
 * Demo class to test out the Policy class
 * 
 * @author pwaite
 */
 
 public class PolicyTestDrive {
 
     /**
      * Create and test insurance policies
      *
      * @param the command line arguments
      */
     public static void main(String[] args) {
     
        // instantiate a policy object
        // Policy is the type
        // policy1 is the object reference variable
        Policy policy1 = new Policy();
        
        // set each instance variable
        policy1.setPolicyHolderName("Darci Donaldson");
        //policy1.policyNumber = "74-A-123-BC";
        policy1.setPremium(500.00);
        //policy1.termInMonths = 12;
        //policy1.policyType = "Auto";
        //policy1.insuredItem = "Shelby";
        //policy1.insuredName = policy1.policyHolderName;
        
        
        // call the display method on the object
        policy1.display(); 
        
        // call the changePremium method passing in 50.00
        policy1.changePremium(50.00, false);
        
        // call the display method on the object
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        policy1.display(); 
        
        // display the premium
        System.out.println();
        System.out.println("*********************");
        System.out.println();
        System.out.println("The premium is: " + policy1.displayPremium());
     
     }
 }
