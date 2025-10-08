import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // get patient info
        System.out.println("Enter patient first name: ");
        String first = input.nextLine();
        System.out.println("Enter middle name: ");
        String middle = input.nextLine();
        System.out.println("Enter last name: ");
        String last = input.nextLine();
        System.out.println("Enter street address: ");
        String street = input.nextLine();
        System.out.println("Enter city: ");
        String city = input.nextLine();
        System.out.println("Enter state: ");
        String state = input.nextLine();
        System.out.println("Enter zip: ");
        String zip = input.nextLine();
        System.out.println("Enter phone number: ");
        String phone = input.nextLine();
        System.out.println("Enter emergency contact name: ");
        String emName = input.nextLine();
        System.out.println("Enter emergency contact phone: ");
        String emPhone = input.nextLine();

        Patient patient = new Patient(first, middle, last, street, city,
        							  state, zip, phone, emName, emPhone);
		// procedures
        Procedure procedure1 = new Procedure();
        procedure1.setProcedureName("Physical Exam");
        procedure1.setProcedureDate("10/01/2025");
        procedure1.setPractitioner("Dr. Irvine");
        procedure1.setCharges(3250.00);

        Procedure procedure2 = new Procedure("X-ray", "10/02/2025");
        procedure2.setPractitioner("Dr. Jamison");
        procedure2.setCharges(5500.00);

        Procedure procedure3 = new Procedure("Physical Therapy", "10/03/2025", "Dr. Ross", 2900.75);

        // display info
        displayPatient(patient);

        System.out.println(procedure1.toString());
        System.out.println(procedure2.toString());
        System.out.println(procedure3.toString());

        double total = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%,.2f\n\n", total);
        
        // my info
        System.out.println("Student Name: Jacqueline Wong");
        System.out.println("MC#: 21184718");
        System.out.println("Due Date: 10/5/2025");
	}
	
	// methods
    public static void displayPatient(Patient patient) {
        System.out.println(patient.toString());
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}