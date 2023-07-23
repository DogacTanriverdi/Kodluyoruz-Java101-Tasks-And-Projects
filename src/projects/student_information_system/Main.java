package projects.student_information_system;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut", "TRH", "+90 (505) 505 50 05");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000000");
        Teacher t3 = new Teacher("Harun", "BIO", "1111");

        Lesson history = new Lesson("Tarih", "101", "TRH");
        history.addTeacher(t1);

        Lesson physics = new Lesson("Fizik", "102", "FZK");
        physics.addTeacher(t2);

        Lesson biology = new Lesson("Biyoloji", "101", "BIO");
        biology.addTeacher(t3);

        Student s1 = new Student("Kemal", "123", "4", history, physics, biology);
        s1.addBulkExamNote(100, 75, 50);
        s1.isPass();

        Student s2 = new Student("Necmi", "444", "4", history, physics, biology);
        s2.addBulkExamNote(70, 40, 30);
        s2.isPass();
    }
}
