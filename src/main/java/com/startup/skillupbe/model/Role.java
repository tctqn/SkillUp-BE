package com.startup.skillupbe.model;

import com.startup.skillupbe.enums.RoleType;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING) // Store as a string in DB
    @Column(nullable = false, unique = true)
    private RoleType name;
}
