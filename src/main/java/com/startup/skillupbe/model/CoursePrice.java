package com.startup.skillupbe.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "course_prices")
public class CoursePrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currency_code", nullable = false)
    private String currencyCode; // e.g., "USD", "EUR", "INR"

    @Column(nullable = false)
    private BigDecimal price;

    @OneToOne
    @JoinColumn(name = "course_id", nullable = false, unique = true) // Foreign Key
    private Course course;
}
