import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Value
@AllArgsConstructor

public class Course {
    @With
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;


}
