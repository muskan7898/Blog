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
public class Comment extends BaseEntity{

    @Column(nullable = false)
    private Long blogId;
    @Column(nullable = false)
    private Long userId;
    @Column(nullable = false)
    private String body;
}


