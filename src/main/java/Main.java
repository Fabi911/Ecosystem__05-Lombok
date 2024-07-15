import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S1", "Alice", "1234", "3");
        Student student2 = new Student("S2", "Bob", "5678", "1");
        Student student3 = new Student("S3", "Charlie", "9012", "4");
        Student student4 = new Student("S4", "David", "3456", "2");
        Student student5 = new Student("S5", "Eve", "7890", "3");
        Teacher teacher1 = new Teacher("T1", "Mr. Smith", "Math");
        Teacher teacher2 = new Teacher("T2", "Mrs. Johnson", "Science");
        Course course1 = new Course("C1", "Math 101", teacher1, List.of(student1, student2,student4));
        Course course2 = new Course("C2", "Science 101", teacher2, List.of(student2, student3,student5));
        Course course3 = new Course("C3", "History 101", teacher2, List.of(student1, student3, student4, student5));
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(student1.getName());
        System.out.println(student2.getName());
        System.out.println(course1.getName());
        Student student6 = Student.builder()
                .id("S4")
                .name("David")
                .address("3456")
                .grade("3")
                .build();
        System.out.println(student4);
        Teacher teacher3 = Teacher.builder()
                .id("T3")
                .name("Ms. Brown")
                .subject("History")
                .build();
        System.out.println(teacher3);
        Student student7 = student1.withGrade("1");
        Student student8 = student2.withGrade("2");
        System.out.println(student5);
        System.out.println(student6);
        University university = University.builder()
                .id("U1")
                .name("Harvard")
                .courses(List.of(course1, course2,course3))
                .build();
        System.out.println(university.courses());
        UniversityService universityService = new UniversityService();
        System.out.println(universityService.getAverageGradeOfCourse(course2));
        System.out.println(universityService.getAverageGradeOfUniversity(university));
        System.out.println(universityService.getStudentsWithGradeGreaterThan(university, 2));
    }
}
