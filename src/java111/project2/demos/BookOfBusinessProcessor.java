/** Class to create the book of business and the policies in that book.
 * @author pwaite
 */
 
 public class BookOfBusinessProcessor {
     private BookOfBusiness book;
     
	/**
	 * Returns the value of book.
	 * @return the book of business
	 */

	public BookOfBusiness getBook() {
		return book;
	}

	/**
	 * Sets the value of book.
	 * @param book The value to assign book.
	 */

	public void setBook(BookOfBusiness book) {
		this.book = book;
	}
	
	/** main method to process the book of business
	 */
	 
	 public void run(){
	    // instantiate the book of business object and 
	    // assign it to the instance variable
	    createBook();
	    createPolicies();
	    displayBook();
 
	 }
	 
	 public void createBook() {
	   // BookOfBusiness book = new BookOfBusiness(); // creates a local variable only
	   
	    book = new BookOfBusiness(); // creates the object for the instance variable
	   
	    book.setAgentName("Sam"); 
	 }
	 
	 /** create agent's policies */
	 public void createPolicies() {
	    // instantiate a policy object
        // Policy is the type
        // policy1 is the object reference variable
        Policy policy1 = new Policy();
        Policy policy2 = new Policy();
        Policy policy3 = new Policy();
        
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
        
        // set each instance variable
        policy3.setPolicyHolderName("Daffy Duck");
        policy3.setPolicyNumber("75-123-BC");
        policy3.setPremium(250.00);
        policy3.setTermInMonths(6);
        policy3.setPolicyType("Auto");
        policy3.setInsuredItem("Some Goofy Car");
        policy3.setInsuredName(policy3.getPolicyHolderName());
       
       
        // put the policies in the array
        policies[0] = policy1;
        policies[1] = policy2;
        policies[2] = policy3;
        
        // set the array of policies into the book of business
        book.setPolicies(policies);
 	     
	 }
	 
	 public void displayBook() {
	     book.display();
	 
	 }
	 



	
     
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
