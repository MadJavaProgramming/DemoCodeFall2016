/**
 *  A class to test the Dog Food Needs Calculation
 *
 * @author    pwaite
 */
public class TestDogFoodNeeds {
 
    /**
     *  The main method for the TestDogFoodNeeds class
     *
     * @param  args  The command line arguments
     */
    public static void main(String[] args) {
        Dog smallDog = new Dog();
        smallDog.setWeight(15);
        int smallDogFood = smallDog.calculateFoodNeeded();
        
        if (smallDogFood == 1) {
            System.out.println("Small Dog test passed");
        } else {
             System.out.println("Small Dog test failed");
        }
        
        
    }
 
