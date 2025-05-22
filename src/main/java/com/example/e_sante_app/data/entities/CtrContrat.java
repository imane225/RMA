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
@Table(name = "CTR_CONTRAT")
public class CtrContrat {
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

    @Column(name = "CONTRATURGENT")
    private Boolean contraturgent;

    @Column(name = "DATEEFFETCONTRAT")
    private Instant dateeffetcontrat;

    @Column(name = "MATRICULE_OBLIGATOIRE")
    private Boolean matriculeObligatoire;

    @Column(name = "NUMPOLICE")
    private String numpolice;

    @Column(name = "NUMERO_FILIALE")
    private Long numeroFiliale;

    @Column(name = "NUMERO_RACINE")
    private String numeroRacine;

    @Column(name = "OBSERVATION")
    private String observation;

    @Column(name = "REFEXTERNE")
    private String refexterne;

    @Column(name = "REFINTERMEDIAIREAPPCODE")
    private String refintermediaireappcode;

    @Column(name = "REFINTERMEDIAIRECOMCODE")
    private String refintermediairecomcode;

    @Column(name = "REFINTERMEDIAIREGESTCODE")
    private String refintermediairegestcode;

    @Column(name = "CONFIDENTIEL")
    private Boolean confidentiel;

    @Column(name = "CONFIDENTIEL_INTERMEDIAIRE")
    private Boolean confidentielIntermediaire;

}