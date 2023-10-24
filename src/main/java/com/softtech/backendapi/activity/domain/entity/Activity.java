package com.softtech.backendapi.activity.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softtech.backendapi.travel.domain.entity.Travel;
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
@Table(name = "activities")
@AllArgsConstructor
@NoArgsConstructor
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 1, max = 75)
    @NotBlank
    @NotNull
    @Column(name = "name")
    private String name;

    @Size(max = 1000)
    @Column(name = "description")
    private String description;

    @JsonIgnoreProperties({"activities", "tips", "agency"})
    @ManyToOne()
    @JoinColumn(name = "travel_id")
    private Travel travel;
}