/** Test Drive for the Book/object reference demo
 *  @author pwaite
 */
 
 public class BookTestDrive {
     public static void main(String[] args) {
         
         Book bookA = new Book();
         Book bookB = new Book();
         Book bookC = new Book();
         
         bookA.title = "Sula";
         bookA.author = "Toni Morrison";
         bookA.numberOfPages = 300;
         
         bookB.title = "The Bell Jar";
         bookB.author = "Sylvia Plath";
         bookB.numberOfPages = 600;
         
         bookC.title = "Winters Tale";
         bookC.author = "Peter Helprin";
         bookC.numberOfPages = 600;
         
         bookA.display();
         bookB.display();
         bookC.display();
         
         System.out.println("*************************");
         System.out.println();
         
         bookA = bookB;
         
         bookA.display();
         bookB.display();
         bookC.display();
         
         System.out.println("*************************");
         System.out.println();
         
         // bookC = null; 
         // bookC.display(); <= null pointer exception 
         
         
     }
 
 }
