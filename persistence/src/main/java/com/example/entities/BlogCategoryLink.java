package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class BlogCategoryLink extends BaseEntity {

    @Column(nullable = false)
    private Long blogId;
    @Column(nullable = false)
    private Long categoryId;
}

