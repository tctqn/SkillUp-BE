package com.startup.skillupbe.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false) // Feedback for a course
    private Course course;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // User who gave feedback
    private User user;

    @Column(nullable = false)
    private int rating; // Rating (e.g., 1-5 stars)

    @Column(columnDefinition = "TEXT")
    private String content; // User review text

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt = Instant.now();
}
