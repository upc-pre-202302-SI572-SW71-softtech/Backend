package com.softtech.backendapi.travel.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "travels")
@AllArgsConstructor
@NoArgsConstructor
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 1, max = 75)
    @NotBlank
    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @NotBlank
    @Column(name = "photo_logo")
    private String photoLogo;

    @Size(max = 1000)
    @Column(name = "description")
    private String description;

    @Column(name = "stars")
    private Integer stars;

    @Column(name = "price")
    private Integer price;

    @NotNull
    @NotBlank
    @Size(max = 100)
    @Column(name = "location")
    private String location;

    @NotNull
    @NotBlank
    @Column(name = "photo-portada")
    private String photoPortada;

    @NotNull
    @NotBlank
    @Column(name = "photo1")
    private String photo1;

    @NotNull
    @NotBlank
    @Column(name = "photo2")
    private String photo2;

    @NotNull
    @NotBlank
    @Column(name = "photo3")
    private String photo3;

    @NotNull
    @NotBlank
    @Column(name = "photo4")
    private String photo4;

//    @NotNull
//    @Column(name = "agency_id")
//    private Agency agencyId;

    @Column(name = "created_date")
    private String createdDate;

//    @NotNull
//    @Column(name = "activities")
//    private List<Activity> activities;
//
//    @NotNull
//    @Column(name = "tips")
//    private List<Tip> tips;
}
