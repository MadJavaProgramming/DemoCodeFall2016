/** 
 * Demo class representing an health policy
 * 
 * @author pwaite
 */
 
 public class HealthPolicy extends Policy {
 
     private String groupId;
     private String primaryCareProvider;

	/**

	 * Returns the value of groupId.

	 */

	public String getGroupId() {

		return groupId;

	}





	/**

	 * Sets the value of groupId.

	 * @param groupId The value to assign groupId.

	 */

	public void setGroupId(String groupId) {

		this.groupId = groupId;

	}





	/**

	 * Returns the value of PrimaryCareProvider.

	 */

	public String getPrimaryCareProvider() {

		return primaryCareProvider;

	}





	/**

	 * Sets the value of PrimaryCareProvider.

	 * @param PrimaryCareProvider The value to assign PrimaryCareProvider.

	 */

	public void setPrimaryCareProvider(String PrimaryCareProvider) {

		this.primaryCareProvider = PrimaryCareProvider;

	}
	
	/** This the method to determine risk **/
     public void determineRisk(){
         //TODO add code to determine the risk on this person
     }

	
	/** Display calls the display on Policy and then adds
	 * in the health policy specific info
	 **/
	 public void display() {
	     super.display();
	     System.out.println("The group id is: " + groupId);
	     System.out.println("The primary care provider is: " + primaryCareProvider);
	     
	 }
 
}
	
    
     

