package projects.student_information_system;

public class Teacher {
    String name;
    String branch;
    String mpno;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Branch: " + this.branch);
        System.out.println("Mobile phone number: " + this.mpno);
    }
}
