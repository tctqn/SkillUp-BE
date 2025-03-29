package com.startup.skillupbe.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // User who made the comment
    private User user;

    @Column(name = "associate_id", nullable = false) // ID of associated entity (Course, Lecture, etc.)
    private Long associateId;

    @Column(name = "associate_type", nullable = false) // Type of associated entity
    private String associateType; // Values: "COURSE", "LECTURE", etc.

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    @ManyToOne
    @JoinColumn(name = "comment_id") // Allows threaded comments
    private Comment parentComment;
}
