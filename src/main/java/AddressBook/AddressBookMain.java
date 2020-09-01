package AddressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class AddressBookMain {
        static List<Person> list=new ArrayList<Person>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Person person = new Person();
            System.out.println("Enter first name");
            String firstName = scanner.next();
            person.setFirstName(firstName);
            System.out.println("Enter last name");
            String lastName = scanner.next();
            person.setLastName(lastName);
            System.out.println("Enter mobile number");
            int mobileNumber = scanner.nextInt();
            person.setMobileNo(mobileNumber);
            System.out.println("Enter State");
            String stete = scanner.next();
            person.setState(stete);
            System.out.println("Enter city");
            String city = scanner.next();
            person.setCity(city);
            System.out.println("Enter zip");
            int zip = scanner.nextInt();
            person.setZip(zip);

            System.out.println(person);
            list.add(person);
            System.out.println(list);
        }
    }

