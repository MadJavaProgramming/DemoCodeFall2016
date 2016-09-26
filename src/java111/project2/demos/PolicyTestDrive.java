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
        Policy policy2 = new Policy();
        
        // Create an array to hold 3 policies
        
        Policy[] policies = new Policy[3];
        
        // set each instance variable
        policy1.setPolicyHolderName("Darci Donaldson");
        policy1.setPolicyNumber("74-A-123-BC");
        policy1.setPremium(500.00);
        policy1.setTermInMonths(12);
        policy1.setPolicyType("Auto");
        policy1.setInsuredItem("Shelby");
        policy1.setInsuredName(policy1.getPolicyHolderName());
        
        // set each instance variable
        policy2.setPolicyHolderName("Mickey Mouse");
        policy2.setPolicyNumber("75-123-BC");
        policy2.setPremium(250.00);
        policy2.setTermInMonths(6);
        policy2.setPolicyType("Auto");
        policy2.setInsuredItem("Chevy");
        policy2.setInsuredName(policy2.getPolicyHolderName());
       
        // put the policies in the array
        policies[0] = policy1;
        policies[1] = policy2;
        
        policies[2] = new Policy();
        policies[2].setPolicyHolderName("Rebecca");
        policy2.setInsuredItem("Jeep Renegade");
        
        // call the changePremium method passing in 50.00
        policy1.changePremium(50.00, false);
        
        // call the display method on the object
        
        
        for (int counter = 0;counter < policies.length;counter++) {
            policies[counter].display();
            System.out.println();
            System.out.println("*********************");
            System.out.println();
            // policies[0] is the equivalent of policy1
            // policies[0].display is the same as policy1.display
        }  
        
        
     
     }
 }
