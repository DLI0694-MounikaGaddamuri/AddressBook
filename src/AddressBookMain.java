import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        Scanner input = new Scanner(System.in);

        Contact contact1 = new Contact();
        System.out.println("Enter First Name: ");
        contact1.firstName = input.nextLine();

        System.out.println("Enter Last Name: ");
        contact1.lastName = input.nextLine();

        System.out.println("Enter Address: ");
        contact1.address = input.nextLine();

        System.out.println("Enter City: ");
        contact1.city = input.nextLine();

        System.out.println("Enter State: ");
        contact1.state = input.nextLine();

        System.out.println("Enter zip: ");
        contact1.zip = input.nextLine();

        System.out.println("Enter Phone Number: ");
        contact1.phoneNumber = input.nextLine();

        System.out.println("Enter Email: ");
        contact1.email = input.nextLine();
    }
}