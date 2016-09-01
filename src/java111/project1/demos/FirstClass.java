/** First class created as a demo for Java111
 *   @author pwaite
 */
 
public class FirstClass {
    /** Display a message at the command line
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        clsint weekNumber = 1;
        String welcomeMessage = "Welcome to Java Programming!";
        boolean isSunny = true;
        
        System.out.print(welcomeMessage);
        
        if (weekNumber ==1) {
            System.out.println("This is the first week");    
        } else {
            System.out.println("We are rolling along in the semester");
        } 
        
        if (isSunny) {
            System.out.println("The sun is not out :(");
        }
    }
}
