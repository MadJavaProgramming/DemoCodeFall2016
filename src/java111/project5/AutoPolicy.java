package java111.project5;
/** 
 * Demo class representing an auto policy
 * 
 * @author pwaite
 */
 
 public class AutoPolicy extends Policy {
 
     private String vin;
     private String make;
     private String model; 
     
     public AutoPolicy() {
         Policy.count++;
         System.out.println("Creating an Auto Policy using the no-arg constructor. The current policy count is: " + Policy.count);
     }
     
      public AutoPolicy(String vin, String make, String model) {
         this();
         System.out.println("In the 3-arg constructor");
         this.vin = vin;
         this.make = make;
         this.model = model;
         
     }
     
     public AutoPolicy(String policyHolderName, String policyNumber, double premium, int termInMonths, String vin, String make, String model) {
         this(vin, make, model);
         System.out.println("in the big constructor");
         setPolicyHolderName(policyHolderName);
         setPolicyNumber(policyNumber);
         setPremium(premium);
         setTermInMonths(termInMonths);
         
     }

	/**

	 * Returns the value of vin.
	 * @return the vin value

	 */

	public String getVin() {

		return vin;

	}





	/**

	 * Sets the value of vin.

	 * @param vin The value to assign vin.

	 */

	public void setVin(String vin) {

		this.vin = vin;

	}





	/**

	 * Returns the value of make.

	 */

	public String getMake() {

		return make;

	}





	/**

	 * Sets the value of make.

	 * @param make The value to assign make.

	 */

	public void setMake(String make) {

		this.make = make;

	}





	/**

	 * Returns the value of model.

	 */

	public String getModel() {

		return model;

	}





	/**

	 * Sets the value of model.

	 * @param model The value to assign model.

	 */

	public void setModel(String model) {

		this.model = model;

	}



	public void calculateMileagePerYear(){
	    // to be determined
	}
	
	/** This the method to determine risk **/
     public void determineRisk(){
         //TODO add code to determine the risk on this vehicle and driver
     }


	
	public void display() {
	    super.display();
	    System.out.println("The vin is: " + vin);
	    System.out.println("The make is: " + make);
	    System.out.println("The model is: " + model);
	    System.out.println("The Policy count is " + Policy.count);
	    
	}
     
 }
