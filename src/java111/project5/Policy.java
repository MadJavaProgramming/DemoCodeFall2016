package java111.project5;

/** 
 * Demo class representing an insurance policy
 * 
 * @author pwaite
 */
 
 public abstract class Policy implements Payable {
 
     private String policyHolderName;
     private String policyNumber = "000000000000";

	 private double premium;
     private int termInMonths;
     

     /** This the method to determine risk 
         this is an abstract method and must be implemented in all subclasses
     **/
     public abstract void determineRisk();

	/**

	 * Returns the value of policyHolderName.

	 * @return policy holder name
	 */

	public String getPolicyHolderName() {

		return policyHolderName;

	}
	
	public double getPaymentAmount() {
	    return premium;
	}





	/**

	 * Sets the value of policyHolderName.

	 * @param policyHolderName The value to assign policyHolderName.

	 */

	public void setPolicyHolderName(String policyHolderName) {

		this.policyHolderName = policyHolderName;

	}





	/**

	 * Returns the value of policyNumber.

	 */

	public String getPolicyNumber() {

		return policyNumber;

	}





	/**

	 * Sets the value of policyNumber.

	 * @param policyNumber The value to assign policyNumber.

	 */

	public void setPolicyNumber(String policyNumber) {

		this.policyNumber = policyNumber;

	}





	/**

	 * Returns the value of premium.

	 */

	public double getPremium() {

		return premium;

	}





	/**

	 * Sets the value of premium.

	 * @param premium The value to assign premium.

	 */

	public void setPremium(double premium) {

		this.premium = premium;

	}





	/**

	 * Returns the value of termInMonths.

	 */

	public int getTermInMonths() {

		return termInMonths;

	}





	/**

	 * Sets the value of termInMonths.

	 * @param termInMonths The value to assign termInMonths.

	 */

	public void setTermInMonths(int termInMonths) {

		this.termInMonths = termInMonths;

	}





	
     
    /** 
     * Reduce or increase the premium
     * @param amountToChange amount to add or subtract from the premium
     * @param increase indicates whether the amount should be added (true)       *         or subtracted (false) from the current premium.
     */
    public void changePremium(double amountToChange, boolean increase) {
        if (increase) {
            premium = premium + amountToChange;
        } else {
            premium = premium - amountToChange;
        }
     }
     
    /**
     * returns the current premium
     *
     * @return current premium
     */
     public double displayPremium() {
         return premium;     
     }
     
     /**
     * formats the current premium with 2 decimal places and a $
     *
     * @return current formatted premium
     */
     public String formatPremium() {
         return String.format("$%.02f", premium);    
     }
     
     /** 
      * display all instance variables of the class
      */
      
    public void display() {
      
        System.out.println("Policy Holder Name: " + getPolicyHolderName());
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Premium: " + formatPremium());
        System.out.println("Term: " + termInMonths);
        
    }
 
 
 }
 
 
