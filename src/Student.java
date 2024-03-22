public class Student {
    private String lastName;
    private String firstName;
    private int mathGrade;
    private int physicsGrade;
    private int computerScienceGrade;

    // ...

    public Student(String lastName, String firstName, int mathGrade, int physicsGrade, int computerScienceGrade) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.computerScienceGrade = computerScienceGrade;
    }

    // ...

    public int getMathGrade() {
        return mathGrade;
    }

    public int getPhysicsGrade() {
        return physicsGrade;
    }

    public int getComputerScienceGrade() {
        return computerScienceGrade;
    }


    public String getfirstName() {
        return firstName;
    }
}
