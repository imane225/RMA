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
@Table(name = "PST_BENEFICIAIRE_REGLEMENT")
public class PstBeneficiaireReglement {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADRESSE_BENEF")
    private String adresseBenef;

    @Column(name = "DATE_NAISSANCE")
    private Instant dateNaissance;

    @Column(name = "NOM_BENEF")
    private String nomBenef;

    @Column(name = "NUMDOCIDENTIF_BENEF_REG")
    private String numdocidentifBenefReg;

    @Column(name = "PRENOM_BENEF")
    private String prenomBenef;

    @Column(name = "DATECREATION")
    private Instant datecreation;

    @Column(name = "DATEMODIFICATION")
    private Instant datemodification;

    @Column(name = "UTILISATEURCREATEUR")
    private String utilisateurcreateur;

    @Column(name = "UTILISATEURMODIFICATEUR")
    private String utilisateurmodificateur;

}