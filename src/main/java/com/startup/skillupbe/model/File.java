package com.startup.skillupbe.model;

import com.startup.skillupbe.enums.AssociateType;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Table(name = "files")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "associate_id", nullable = false)
    private Long associateId;

    @Enumerated(EnumType.STRING)
    @Column(name = "associate_type", nullable = false)
    private AssociateType associateType;

    @Column(nullable = false)
    private String fileUrl;

    @Column(nullable = false)
    private String originalFilename;

    @Column(nullable = false)
    private String fileType;

    @Column(name = "upload_date", nullable = false, updatable = false)
    private Instant uploadDate = Instant.now();
}
