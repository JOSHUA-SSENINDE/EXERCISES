import java.util.Scanner; // Import the Scanner class

public class password { // Class name should follow CamelCase convention

    public static void main(String[] args) {
        int attempts = 3; // Number of allowed attempts
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        while (attempts > 0) { // Loop for password attempts
            System.out.print("Enter password: "); // Prompt the user

            String password = scanner.next(); // Read the password

            if (password.equals("correct_password")) { // Check if the password is correct
                System.out.println("Access granted!");
                break; // Exit the loop if the password is correct
            } else {
                attempts--; // Decrement remaining attempts
                System.out.println("Incorrect password. You have " + attempts + " attempts remaining.");
            }
        }

        if (attempts == 0) { // Handle failed attempts
            System.out.println("Sorry, you've run out of attempts.");
        }
    }
}

