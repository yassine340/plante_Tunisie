package com.plants.projet_des_plants.Entities;

import jakarta.persistence.*;
import lombok.*;


@Entity @NoArgsConstructor @AllArgsConstructor
@Data

public class Utilisateur  {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @Column(unique = true)
    private String email;
    private String role;
    private String password;


}
