public class UniversityService {
    public String getAverageGradeOfCourse(Course course) {
        return course.getStudents().stream()
                .map(Student::getGrade)
                .mapToInt(Integer::parseInt)
                .average()
                .orElse(0.0) + "";
    }

    public String getAverageGradeOfUniversity(University university) {
        return university.courses().stream()
                .map(this::getAverageGradeOfCourse)
                .mapToDouble(Double::parseDouble)
                .average()
                .orElse(0.0) + "";
    }

    public String getStudentsWithGradeGreaterThan(University university, int grade) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> Integer.parseInt(student.getGrade()) <= grade)
                .map(Student::getName)
                .distinct()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("");

    }

}
