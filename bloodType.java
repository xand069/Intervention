import java.util.Scanner;

public class bloodType {
    private String bloodType;
    private char rhFactor;

    // Setter methods
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Getter methods
    public String getBloodType() {
        return bloodType;
    }

    public char getRhFactor() {
        return rhFactor;
    }

    public static void main(String[] args) {
        bloodType patient1 = new bloodType();
        bloodType patient2 = new bloodType();

        // Accept user input using setter methods
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter blood type of patient 1: ");
        patient1.setBloodType(scanner.nextLine());

        System.out.print("Enter the Rhesus factor (+ or -) of patient 1: ");
        patient1.setRhFactor(scanner.next().charAt(0));

        System.out.println(patient1.getBloodType() + patient1.getRhFactor() + " is added to the blood bank.");

        // Repeat for patient 2
        System.out.print("\nEnter blood type of patient 2: ");
        patient2.setBloodType(scanner.next());

        System.out.print("Enter the Rhesus factor (+ or -) of patient 2: ");
        patient2.setRhFactor(scanner.next().charAt(0));

        System.out.println(patient2.getBloodType() + patient2.getRhFactor() + " is added to the blood bank.");
        
        // Close the scanner
        scanner.close();
    }
}