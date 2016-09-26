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
	 * Returns the value of policyHolderName.
	 * @return policy holder name
	 */
	public String getPolicyHolderName() {
		return policyHolderName;
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
	 * Returns the value of insuredName.
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
 
 
