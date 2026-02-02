import java.io.FileWriter;
import java.io.IOException;

public class Profile {
    public static void main(String[] args) {

        
        String firstName = "reymart";
        String lastName  = "dacumos";
        int age = 18;
        String email = "reymartdacumos@email.com";
        String phone = "09858232751";

        
        try (FileWriter writer = new FileWriter("profile.txt")) {
            writer.write("First Name: " + firstName + "\n");
            writer.write("Last Name: " + lastName + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Phone: " + phone + "\n");

            System.out.println("Profile save successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
