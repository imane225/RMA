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
@Table(name = "PST_CHIFFRAGE")
public class PstChiffrage {
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

    @Column(name = "CUMUL_AVANT")
    private Double cumulAvant;

    @Column(name = "DATE_HOSPITALISATION_DEBUT")
    private Instant dateHospitalisationDebut;

    @Column(name = "DATE_HOSPITALISATION_FIN")
    private Instant dateHospitalisationFin;

    @Column(name = "ENF_MORT_NE")
    private Boolean enfMortNe;

    @Column(name = "MALADIE")
    private String maladie;

    @Column(name = "MONTANT_REGLEMENT")
    private Double montantReglement;

    @Column(name = "OBSERVATION")
    private String observation;

    @Column(name = "PLAFOND")
    private Double plafond;

    @Column(name = "REG_AMC_SUR_DECOMPTE")
    private Boolean regAmcSurDecompte;

    @Column(name = "RELIQUAT_AVANT")
    private Double reliquatAvant;

    @Column(name = "TYPE_HOSPITALISATION")
    private String typeHospitalisation;

    @Column(name = "URGENCE")
    private Boolean urgence;

}