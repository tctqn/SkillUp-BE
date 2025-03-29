package com.startup.skillupbe.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "user_course_progress")
public class UserCourseProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // User progressing
    private User user;

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false) // Tracked course
    private Course course;

    @Column(name = "progress_percentage", nullable = false)
    private float progressPercentage; // Example: 75.0%

    @Column(name = "is_completed", nullable = false)
    private boolean isCompleted; // True if all lectures are completed

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt = Instant.now();
}
