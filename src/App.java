import java.awt.*;
import java.util.Scanner;

/**
 * Created by jc302404 on 16/03/15.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("BMI Manager");
        Patient patient = new Patient();
        running: while (true) {
            System.out.println("Please select from the " +
                    "following menu options:\n" +
                    "\t1. Add new Patient\n" +
                    "\t2. View patient\n" +
                    "\t3. Exit\n");
            System.out.println("Enter choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Enter patients name: ");
                    String name = scanner.nextLine();
                    System.out.println("What is patients age: ");
                    int age = scanner.nextInt();
                    System.out.println("Enter patients height");
                    double height = scanner.nextDouble();
                    System.out.println("Enter patients weight");
                    double weight = scanner.nextDouble();

                    patient.setName(name);
                    patient.setAge(age);
                    patient.setHeight(height);
                    patient.setWeight(weight);



                    break;
                }
                case 2: {
                    String output = String.format("Patients name %s ",
                            patient.getName());
                    String output1 = String.format("patients age %d",
                            patient.getAge());
                    String output2 = String.format("patients BMI %.2f",
                            patient.getBMI());

                    System.out.println()

                    break;
                }
                case 3: {
                    System.out.println("Good bye!");
                    break running;

                }

            }
        }
    }
}


