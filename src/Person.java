import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String surname;
    String name;
    String street;
    String zipCode;
    String city;

    public void initialize() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Retrieving data about a person.");
        System.out.println("Enter your surname: ");
        surname = br.readLine();
        System.out.println("Enter your name: ");
        name = br.readLine();
        System.out.println("Enter the street: ");
        street = br.readLine();
        System.out.println("Enter your zip code: ");
        zipCode = br.readLine();
        System.out.println("Enter the city: ");
        city = br.readLine();
    }

    public void print(){
        System.out.println("Displaying the data.");
        System.out.println("====================");
        System.out.println("Surname: " + surname);
        System.out.println("Name: " + name);
        System.out.println("Street: " + street);
        System.out.println("Zip-Code: " + zipCode);
        System.out.println("City: " + city);
    }
}

class Staff extends Person {
    String education;
    String position;

    public void initialize1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        initialize();
        System.out.println("Enter your education: ");
        education = br.readLine();
        System.out.println("Enter your position: ");
        position = br.readLine();
    }

    public void print1() {
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

class HR {
    public static void main(String[] args) throws IOException {
        Staff employee = new Staff();

        employee.initialize1();
        employee.print1();

//                employee.initialize();
//                employee.print();
    }
}

