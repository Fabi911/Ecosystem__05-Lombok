import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder

public class Course {
    @With
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students=new ArrayList<>();
}
