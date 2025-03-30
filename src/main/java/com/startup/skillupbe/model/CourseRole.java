package com.startup.skillupbe.model;

import com.startup.skillupbe.enums.CourseRoleName;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "course_roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CourseRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private CourseRoleName name;
}

