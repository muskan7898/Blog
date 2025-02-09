package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Data
@EqualsAndHashCode(callSuper = true)
public class Category extends BaseEntity{
    @Column(nullable = false)
    private String name;
}
