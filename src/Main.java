import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String lastName = scanner.next();
            String firstName = scanner.next();
            int mathGrade = scanner.nextInt();
            int physicsGrade = scanner.nextInt();
            int computerScienceGrade = scanner.nextInt();

            students[i] = new Student(lastName, firstName, mathGrade, physicsGrade, computerScienceGrade);
        }

        double mathAverage = 0;
        double physicsAverage = 0;
        double computerScienceAverage = 0;
        DecimalFormat df = new DecimalFormat("#.#");

        for (Student student : students) {
            if (student != null) {
                mathAverage += student.getMathGrade();
                physicsAverage += student.getPhysicsGrade();
                computerScienceAverage += student.getComputerScienceGrade();
            }
        }

        mathAverage /= n;
        physicsAverage /= n;
        computerScienceAverage /= n;

        System.out.println(df.format(mathAverage) +" "+ df.format( physicsAverage)+" "+df.format(computerScienceAverage ));



//        Student[] students = new Student[3];
//        students[0] = new Student("John", "Doe", 90, 85, 78);
//        students[1] = new Student("Jane", "Smith", 80, 92, 88);
//        students[2] = new Student("Mike", "Lee", 75, 80, 95);
//
//        for (Student student : students) {
//            System.out.printf("%.2f %.2f %.2f\n" , student.getfirstName() + " - Average: " + (student.getMathGrade() + student.getPhysicsGrade() + student.getComputerScienceGrade()) / 3.0);
//        }

    }
}
