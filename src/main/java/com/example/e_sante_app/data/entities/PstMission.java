package com.example.e_sante_app.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "PST_MISSION")
public class PstMission {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TYPE_MISSION", nullable = false, length = 31)
    private String typeMission;

    @Column(name = "DATECREATION", nullable = false)
    private Instant datecreation;

    @Column(name = "DATEMODIFICATION")
    private Instant datemodification;

    @Column(name = "UTILISATEURCREATEUR", nullable = false)
    private String utilisateurcreateur;

    @Column(name = "UTILISATEURMODIFICATEUR")
    private String utilisateurmodificateur;

    @Column(name = "CODE_PRESTATAIRE")
    private String codePrestataire;

    @Column(name = "COMMENTAIRE")
    private String commentaire;

    @Column(name = "DATE_ANNULATION")
    private Instant dateAnnulation;

    @Column(name = "DEMANDEUR_ANNULATION")
    private String demandeurAnnulation;

    @Column(name = "LIEU_MISSION")
    private String lieuMission;

    @Column(name = "MOTIF_ANNULATION")
    private String motifAnnulation;

    @Column(name = "MOTIF_MODIFICATION")
    private String motifModification;

    @Column(name = "NOM_PRESTATAIRE")
    private String nomPrestataire;

    @Column(name = "UTILISATEUR_ANNULATION")
    private String utilisateurAnnulation;

    @Column(name = "CV_NON_EXECUTEE", nullable = false)
    private Boolean cvNonExecutee = false;

    @Column(name = "NATURE_MISSION")
    private String natureMission;

    @Column(name = "DATE_DEMANDE_VM")
    private Instant dateDemandeVm;

    @Column(name = "DATE_ENVOI_DOSSIER")
    private Instant dateEnvoiDossier;

    @Column(name = "DATE_LIMITE_VM")
    private Instant dateLimiteVm;

    @Column(name = "NB_RELANCE")
    private Long nbRelance;

    @Column(name = "NUM_DEMANDE_VM")
    private Long numDemandeVm;

    @Column(name = "OBSERVATION_REASSUREUR")
    private String observationReassureur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MISSION_BASE_ID")
    private PstMission missionBase;

}