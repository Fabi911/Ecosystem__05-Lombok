import lombok.Builder;
import lombok.With;

@Builder

public record Teacher(String id,String name, String subject) {
}
