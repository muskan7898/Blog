package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity{

    @Column(nullable = false)
    private String name;
    private String gender;
    private String about;

    @Email(message = "email should be valid")
    @Column(nullable = false)
    private String email;

    private String password;

    private String Linkedin;
    private String instagram;
    private String facebook;

}
