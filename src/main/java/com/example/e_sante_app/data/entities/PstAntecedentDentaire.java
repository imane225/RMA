package com.example.e_sante_app.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "PST_ANTECEDENT_DENTAIRE")
public class PstAntecedentDentaire {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DATECREATION", nullable = false)
    private Instant datecreation;

    @Column(name = "DATEMODIFICATION")
    private Instant datemodification;

    @Column(name = "UTILISATEURCREATEUR", nullable = false)
    private String utilisateurcreateur;

    @Column(name = "UTILISATEURMODIFICATEUR")
    private String utilisateurmodificateur;

    @Column(name = "DENT")
    private Long dent;

    @Column(name = "OBSERVATION", length = 1000)
    private String observation;

}