package com.startup.skillupbe.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "user_lecture_progress")
public class UserLectureProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // User who watched
    private User user;

    @ManyToOne
    @JoinColumn(name = "lecture_id", nullable = false) // Tracked lecture
    private Lecture lecture;

    @Column(name = "progress_percentage", nullable = false)
    private float progressPercentage; // Example: 50.5%

    @Column(name = "last_watched_seconds")
    private int lastWatchedSeconds; // Example: 120 sec into the video

    @Column(name = "is_completed", nullable = false)
    private boolean isCompleted; // True if fully watched

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt = Instant.now();
}
