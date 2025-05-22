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
@Table(name = "PST_FEUILLE_SOINS")
public class PstFeuilleSoin {
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

    @Column(name = "DATE_HOSPITALISATION_DEBUT")
    private Instant dateHospitalisationDebut;

    @Column(name = "DATE_HOSPITALISATION_FIN")
    private Instant dateHospitalisationFin;

    @Column(name = "DATE_PROPOSITION_DEVIS")
    private Instant datePropositionDevis;

    @Column(name = "ENF_MORT_NE")
    private Boolean enfMortNe;

    @Column(name = "MALADIE")
    private String maladie;

    @Column(name = "OBSERVATION")
    private String observation;

    @Column(name = "PST_PRESTATAIRE_CODE")
    private String pstPrestataireCode;

    @Column(name = "TYPE_HOSPITALISATION")
    private String typeHospitalisation;

    @Column(name = "URGENCE")
    private Boolean urgence;

}