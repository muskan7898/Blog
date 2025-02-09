package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
public class Blog extends BaseEntity {
    private String imageUrl;
    @Column(nullable = false)
    private String heading;

    @Column(nullable = false)
    private UUID authorId;
    @Column(nullable = false)
    private boolean internal;

    @Column(nullable = false, unique = true)
    private String slug;

    @Column(nullable = false)
    private String content;
}
