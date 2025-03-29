package com.startup.skillupbe.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "lectures")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "order_number", nullable = false)
    private int orderNumber; // Position in section

    @ManyToOne
    @JoinColumn(name = "section_id", nullable = false) // Foreign Key
    private Section section;
}
