/** Represents and agent's book of business - his/her policies
 * 
 * @author pwaite
 */

 public class BookOfBusiness {
    private String agentName; 
    private Policy[] policies;
	/**
	 * Returns the value of agentName.
	 * @return agent's name
	 */
	public String getAgentName() {
		return agentName;
	}


	/**
	 * Sets the value of agentName.
	 * @param agentName The value to assign agentName.
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}


	/**
	 * Returns the value of policies.
	 * @return agent's list of policies
	 */
	public Policy[] getPolicies() {
		return policies;
	}


	/**
	 * Sets the value of policies.
	 * @param policies The value to assign policies.
	 */
	public void setPolicies(Policy[] policies) {
		this.policies = policies;
	}
	
	/** 
	 * displays the book of business (each policy and the agent's name)
	 */
	 
	 public void display() {
	 
	     System.out.println("Agent " + agentName + " Book of Business");
	     System.out.println("***********************************");
	     System.out.println();
	     for (int counter = 0; counter < policies.length; counter++) {
	         policies[counter].display();
	         System.out.println();
	     }
	 
	 }

	
  
 
 
 
 
 
 
 
 
 
 
 
 
 }
