/** 
 * Demo class representing an insurance policy
 * 
 * @author pwaite
 */
 
 public class Policy {
 
     private String policyHolderName;
     private String policyNumber = "000000000000";
	 private double premium;
     private int termInMonths;
     private String insuredName;
     private String policyType;
     private String insuredItem;
	/**
	 * Returns the value of termInMonths.
	 * @return term in months
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
	 * Returns the value of insuredName.
	 * @return name of the insured
	 */
	public String getInsuredName() {
		return insuredName;
	}


	/**
	 * Sets the value of insuredName.
	 * @param insuredName The value to assign insuredName.
	 */
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}


	/**
	 * Returns the value of policyType.
	 * @return type of policy
	 */
	public String getPolicyType() {
		return policyType;
	}


	/**
	 * Sets the value of policyType.
	 * @param policyType The value to assign policyType.
	 */
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}


	/**
	 * Returns the value of insuredItem.
	 * @return insured item
	 */
	public String getInsuredItem() {
		return insuredItem;
	}


	/**
	 * Sets the value of insuredItem.
	 * @param insuredItem The value to assign insuredItem.
	 */
	public void setInsuredItem(String insuredItem) {
		this.insuredItem = insuredItem;
	}

	
     
    /**
     * getter for policyHolderName
     * @return Name of the policy holder
     */
     public String getPolicyHolderName() {          
         return policyHolderName;
     }
      
    /**
     * setter for the policyHolderName
     * @param newPolicyHolderName new policy holder name
     */
     public void setPolicyHolderName(String newPolicyHolderName) {
         policyHolderName = newPolicyHolderName;
     }
       
    /**
	 * Returns the value of policyNumber.
	 * @return policy number
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
     * getter for premium
     * @return premium amount
     */
    public double getPremium(){
        return premium;
    } 
        
    /** 
     * sets the premium
     * @param newPremium new Premium for the policy
     */
    public void setPremium(double newPremium) {
        premium = newPremium;
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
      * display all instance variables of the class
      */
      
    public void display() {
      
        System.out.println("Policy Holder Name: " + getPolicyHolderName());
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Premium: " + premium);
        System.out.println("Term: " + termInMonths);
        System.out.println("Insured Name: " + insuredName);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Insured Item: " + insuredItem);
    }
 
 
 }
 
 
