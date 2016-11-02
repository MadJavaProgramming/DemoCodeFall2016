import java.util.*;

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
	    createAutoPolicies();
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
        
        //Policy[] policies = new Policy[3];
        ArrayList<Policy>  policies = new ArrayList<Policy>();
        
        // set each instance variable
        policy1.setPolicyHolderName("Darci Donaldson");
        policy1.setPolicyNumber("74-A-123-BC");
        policy1.setPremium(500.00);
        policy1.setTermInMonths(12);
         
        // set each instance variable
        policy2.setPolicyHolderName("Mickey Mouse");
        policy2.setPolicyNumber("75-123-BC");
        policy2.setPremium(250.00);
        policy2.setTermInMonths(6);
        
        // set each instance variable
        policy3.setPolicyHolderName("Daffy Duck");
        policy3.setPolicyNumber("75-123-BC");
        policy3.setPremium(250.00);
        policy3.setTermInMonths(6);
       
       
        // put the policies in the array
        policies.add(policy1);
        policies.add(policy2);
        policies.add(policy3);
        
        // set the array of policies into the book of business
        //book.setPolicies(policies);
 	     
	 }
	 
	  public void createAutoPolicies() {
	    ArrayList<AutoPolicy> autoPolicies = new ArrayList<AutoPolicy>();      
	      
	    // instantiate a policy object
        // Policy is the type
        // policy1 is the object reference variable
        AutoPolicy autoPolicy1 = new AutoPolicy();
        AutoPolicy autoPolicy2 = new AutoPolicy();
        AutoPolicy autoPolicy3 = new AutoPolicy();
        
        autoPolicy1.setPolicyHolderName("Mack Arnold");
        autoPolicy1.setPolicyNumber("74-A-123-BC");
        autoPolicy1.setPremium(500.00);
        autoPolicy1.setTermInMonths(12);
        autoPolicy1.setMake("Jeep");
        autoPolicy1.setModel("Compass");
        autoPolicy1.setVin("7837324897");
        
        autoPolicy2.setPolicyHolderName("Mack Arnold");
        autoPolicy2.setPolicyNumber("75-A-123-BC");
        autoPolicy2.setPremium(500.00);
        autoPolicy2.setTermInMonths(12);
        autoPolicy2.setMake("Jeep");
        autoPolicy2.setModel("Cherokee");
        autoPolicy2.setVin("7373739872347");
        
        autoPolicy3.setPolicyHolderName("Mack Arnold");
        autoPolicy3.setPolicyNumber("76-A-123-BC");
        autoPolicy3.setPremium(500.00);
        autoPolicy3.setTermInMonths(12);
        autoPolicy3.setMake("Jeep");
        autoPolicy3.setModel("Wrangler");
        autoPolicy3.setVin("203984039284");
        
        autoPolicies.add(autoPolicy1);
        autoPolicies.add(autoPolicy2);
        autoPolicies.add(autoPolicy3);
        
        book.setPolicies(autoPolicies);
        
     }
	 
	 public void displayBook() {
	     book.display();
	 
	 }
	 



	
     
     
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
