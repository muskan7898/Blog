package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EqualsAndHashCode(callSuper = true)
public class Like extends BaseEntity{

    @Column(nullable = false)
    private Long blogId;
    @Column(nullable = false)
    private Long userId;
}
