import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder

public class Student {
    private String id;
    private String name;
    @With
    private String address;
    @With
    private String grade;
}
