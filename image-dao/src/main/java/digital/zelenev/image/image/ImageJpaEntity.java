package digital.zelenev.image.image;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "image")
@Data
@NoArgsConstructor
public class ImageJpaEntity {

    @Id
    private UUID id;

    private String name;

    @Lob
    @Column(name = "image_content")
    private byte[] imageContent;

    private String extension;

    private Long length;
}
