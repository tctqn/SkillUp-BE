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

    @Column(name = "associate_id", nullable = false) // ID của thực thể liên kết
    private Long associateId;

    @Enumerated(EnumType.STRING) // Lưu enum dưới dạng chuỗi
    @Column(name = "associate_type", nullable = false)
    private AssociateType associateType;

    @Column(nullable = false)
    private String fileUrl; // Đường dẫn file lưu trữ

    @Column(nullable = false)
    private String originalFilename; // Tên gốc của file

    @Column(nullable = false)
    private String fileType; // PDF, MP4, PNG, etc.

    @Column(name = "upload_date", nullable = false, updatable = false)
    private Instant uploadDate = Instant.now();
}
