import java.util.Scanner; 

public class password { 

    public static void main(String[] args) {
        int attempts = 3;
        Scanner scanner = new Scanner(System.in); 

        while (attempts > 0) { 
            System.out.print("Enter password: "); 

            String password = scanner.next(); 

            if (password.equals("correct_password")) { 
                System.out.println("Access granted!");
                break; 
            } else {
                attempts--; 
                System.out.println("Incorrect password. You have " + attempts + " attempts remaining.");
            }
        }

        if (attempts == 0) { 
            System.out.println("Sorry, you've run out of attempts.");
        }
    }
}

