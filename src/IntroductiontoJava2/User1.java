package IntroductiontoJava2;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User2{
    String firstname;
    String lastname;
    int age;
    String phonenumber;

    // Constructor
    User2(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    // Method to convert user data to string format
    public String toString() {
        return firstname + "," + lastname + "," + age + "," + phonenumber;
    }
}

public class User1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("users.txt");

        // Create file if it doesn't exist
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            while (true) {
                // Accept user details
                System.out.print("Enter First Name: ");
                String firstname = scanner.nextLine();
                System.out.print("Enter Last Name: ");
                String lastname = scanner.nextLine();
                System.out.print("Enter Age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter Phone Number: ");
                String phonenumber = scanner.nextLine();

                // Create User object
                User2 user = new User2(firstname, lastname, age, phonenumber);

                // Append user data to file
                try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write(user.toString() + "\n");
                }

                // Ask if the user wants to continue
                System.out.print("Do you want to continue creating users? (Type QUIT to exit): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
