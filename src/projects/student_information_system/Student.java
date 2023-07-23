package projects.student_information_system;

public class Student {
    Lesson l1;
    Lesson l2;
    Lesson l3;
    String name;
    String stuNo;
    String stuClass;
    Double average;
    boolean isPass;

    Student(String name, String stuNo, String stuClass, Lesson l1, Lesson l2, Lesson l3) {
        this.name = name;
        this.stuNo = stuNo;
        this.stuClass = stuClass;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100)
            this.l1.note = note1;
        if (note2 >= 0 && note2 <= 100)
            this.l2.note = note2;
        if (note3 >= 0 && note3 <= 100)
            this.l3.note = note3;
    }

    void isPass() {
        System.out.println("=====================");
        this.average = (this.l1.note + this.l2.note + this.l3.note) / 3.0;
        printNote();
        if (this.average > 55) {
            this.isPass = true;
            System.out.println("Sınıfı geçtiniz! :)");
        } else {
            System.out.println("Sınıfta kaldınız! :(");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println("Öğrenci: " + this.name);
        System.out.println(l1.name + " Notu: " + l1.note);
        System.out.println(l2.name + " Notu: " + l2.note);
        System.out.println(l3.name + " Notu: " + l3.note);
        System.out.println("Ortalamanız: " + this.average);
    }
}
