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
@Table(name = "PST_LOT")
public class PstLot {
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

    @Column(name = "CODE_APPORTEUR")
    private String codeApporteur;

    @Column(name = "CODE_GESTIONNAIRE")
    private String codeGestionnaire;

    @Column(name = "DATE_DEBUT_OUVERTURE")
    private Instant dateDebutOuverture;

    @Column(name = "DATE_ETAT_POLICE")
    private Instant dateEtatPolice;

    @Column(name = "DATE_FIN_OUVERTURE")
    private Instant dateFinOuverture;

    @Column(name = "DATE_RECEPTION")
    private Instant dateReception;

    @Column(name = "GESTIONNAIRE")
    private String gestionnaire;

    @Column(name = "MOTIF_MODIF_ANNUL")
    private String motifModifAnnul;

    @Column(name = "NOMBRE_OUVERTURE")
    private Long nombreOuverture;

    @Column(name = "NOMBRE_REACTIVATION")
    private Long nombreReactivation;

    @Column(name = "NOMBRE_REOUVERTURE")
    private Long nombreReouverture;

    @Column(name = "NOMBRE_SIN_DECL")
    private Long nombreSinDecl;

    @Column(name = "NOMBRE_SIN_RECU")
    private Long nombreSinRecu;

    @Column(name = "NUMERO_LOT")
    private String numeroLot;

    @Column(name = "NUMERO_POLICE")
    private String numeroPolice;

    @Column(name = "RAISON_SOCIALE_APPORTEUR")
    private String raisonSocialeApporteur;

    @Column(name = "RAISON_SOCIALE_CLIENT")
    private String raisonSocialeClient;

    @Column(name = "RAISON_SOCIALE_GESTIONNAIRE")
    private String raisonSocialeGestionnaire;

    @Column(name = "REF_ETAT_POLICE_LIBELLE")
    private String refEtatPoliceLibelle;

    @Column(name = "ID_ETAT_LOT")
    private Long idEtatLot;

}