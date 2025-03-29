package com.startup.skillupbe.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "associate_id", nullable = false) // ID of associated entity
    private Long associateId;

    @Column(name = "associate_type", nullable = false) // Type (Course, Lecture, etc.)
    private String associateType; // Values: "COURSE", "LECTURE", etc.

    @Column(nullable = false)
    private String fileUrl; // Storage path

    @Column(nullable = false)
    private String originalFilename; // Name of the uploaded file

    @Column(nullable = false)
    private String fileType; // PDF, MP4, PNG, etc.

    @Column(name = "upload_date", nullable = false, updatable = false)
    private Instant uploadDate = Instant.now();
}
