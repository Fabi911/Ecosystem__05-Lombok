import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S1", "Alice", "1234", "A");
        Student student2 = new Student("S2", "Bob", "5678", "B");
        Student student3 = new Student("S3", "Charlie", "9012", "C");
        Teacher teacher1 = new Teacher("T1", "Mr. Smith", "Math");
        Teacher teacher2 = new Teacher("T2", "Mrs. Johnson", "Science");
        Course course1 = new Course("C1", "Math 101", teacher1, List.of(student1, student2));
        Course course2 = new Course("C2", "Science 101", teacher2, List.of(student2, student3));
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(course1.getName());
        Student student4 = Student.builder()
                .id("S4")
                .name("David")
                .address("3456")
                .grade("D")
                .build();
        System.out.println(student4);
        Teacher teacher3 = Teacher.builder()
                .id("T3")
                .name("Ms. Brown")
                .subject("History")
                .build();
        System.out.println(teacher3);
        Student student5 = student1.withGrade("A+");
        Student student6 = student2.withGrade("B+");
        System.out.println(student5);
        System.out.println(student6);
    }
}
