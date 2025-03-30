package com.startup.skillupbe.model;

import com.startup.skillupbe.enums.CourseCategoryName;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "course_categories")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CourseCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING) // Lưu enum dưới dạng chuỗi
    @Column(nullable = false, unique = true)
    private CourseCategoryName name;
}

