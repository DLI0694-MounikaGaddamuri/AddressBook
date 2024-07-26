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

        System.out.println("Enter person name to edit their contact: ");
        String editPerson = input.nextLine();

        if(contact1.getFirstName().contains(editPerson)){
            System.out.println("Enter contact details to edit: ");

            System.out.println("Enter the details you want to edit: ");
            String editDetails= input.nextLine();

            switch(editDetails) {

                case "firstName":
                    System.out.println("Enter First Name: ");
                    contact1.firstName = input.nextLine();
                    break;

                case "lastName":
                    System.out.println("Enter Last Name: ");
                    contact1.lastName = input.nextLine();
                    break;

                case "Address":
                    System.out.println("Enter Address: ");
                    contact1.address = input.nextLine();
                    break;

                case "City":
                    System.out.println("Enter City: ");
                    contact1.city = input.nextLine();
                    break;

                case "State":
                    System.out.println("Enter State: ");
                    contact1.state = input.nextLine();
                    break;

                case "zip":
                    System.out.println("Enter zip: ");
                    contact1.zip = input.nextLine();
                    break;


                case "PhoneNumber":
                    System.out.println("Enter Phone Number: ");
                    contact1.phoneNumber = input.nextLine();
                    break;

                case "Email":
                    System.out.println("Enter Email: ");
                    contact1.email = input.nextLine();
                    break;
            }

        }
        else System.out.println("Person is not present in the address book");


    }
}