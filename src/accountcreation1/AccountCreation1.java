
package accountcreation1;
 import java.util.Scanner;


public class AccountCreation1 {
public static void main(String[] args) {
        
     
    
 
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a username: ");
        String username = input.nextLine();

        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // Validate conditions
        if (username.isEmpty() || password.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Fill in all fields!");
        } else if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
        } else {
            // Account creation logic (store data in a database or file)
            System.out.println("Account created successfully!");
         
            
            
        }
        
        
     }}
