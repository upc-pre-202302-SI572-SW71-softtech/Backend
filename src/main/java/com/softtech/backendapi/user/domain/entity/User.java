package com.softtech.backendapi.user.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Length(min = 1, max = 75)
    @Column(name = "name")
    private String name;

    @NotNull
    @Length(min = 1, max = 75)
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Length(min = 1, max = 20)
    @Column(name = "phone_number")
    private String phoneNumber;

    @NotNull
    @Length(min = 8, max = 8)
    @Column(name = "dni")
    private String dni;

    @NotNull
    @Min(0)
    @Column(name = "age")
    private int age;

    @NotNull
    @Length(min = 1, max = 100)
    @Column(name = "email")
    private String email;

    @NotNull
    @Length(min = 1, max = 10)
    @Column(name = "gender")
    private String gender;
}
