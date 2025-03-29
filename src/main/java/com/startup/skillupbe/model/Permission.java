package com.startup.skillupbe.model;

import com.startup.skillupbe.enums.PermissionName;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "permissions")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private PermissionName name;
}
