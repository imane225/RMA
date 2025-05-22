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
@Table(name = "PST_MOYEN_PAIEMENT")
public class PstMoyenPaiement {
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

    @Column(name = "ADRESSE_APPORTEUR")
    private String adresseApporteur;

    @Column(name = "ADRESSE_BENEFICIAIRE")
    private String adresseBeneficiaire;

    @Column(name = "ADRESSE_DESTINATAIRE")
    private String adresseDestinataire;

    @Column(name = "ADRESSE_SOCIETE")
    private String adresseSociete;

    @Column(name = "CIN_PASSPORT")
    private String cinPassport;

    @Column(name = "CODE_DESTINATAIRE")
    private String codeDestinataire;

    @Column(name = "CODE_INTERMEDIAIRE")
    private String codeIntermediaire;

    @Column(name = "CODE_INTERMEDIAIRE_APP")
    private String codeIntermediaireApp;

    @Column(name = "DATE_NAISSANCE")
    private Instant dateNaissance;

    @Column(name = "DATE_POSITIONNEMENT")
    private Instant datePositionnement;

    @Column(name = "ID_POSITIONNEMENT")
    private String idPositionnement;

    @Column(name = "LIB_PAIEMENT")
    private String libPaiement;

    @Column(name = "MDP_REPOSITIONNEMENT")
    private Boolean mdpRepositionnement;

    @Column(name = "MONTANT_PAIEMENT")
    private Double montantPaiement;

    @Column(name = "NOM_BENEFICIAIRE_PAIEMENT")
    private String nomBeneficiairePaiement;

    @Column(name = "NOM_PROPRIETAIRE_CARTE")
    private String nomProprietaireCarte;

    @Column(name = "NOS_REFERENCE")
    private String nosReference;

    @Column(name = "NUM_AFFILIATION")
    private String numAffiliation;

    @Column(name = "NUM_CARTE_BANCAIRE")
    private String numCarteBancaire;

    @Column(name = "NUM_CHEQUE")
    private String numCheque;

    @Column(name = "NUM_CLIENT")
    private String numClient;

    @Column(name = "NUM_CONTRAT")
    private String numContrat;

    @Column(name = "NUM_MOBILE")
    private String numMobile;

    @Column(name = "PRESTATAIRE_CODE")
    private String prestataireCode;

    @Column(name = "RAISON_SOCIALE")
    private String raisonSociale;

    @Column(name = "RAISON_SOCIALE_APPORTEUR")
    private String raisonSocialeApporteur;

    @Column(name = "RAISON_SOCIALE_DESTINATAIRE")
    private String raisonSocialeDestinataire;

    @Column(name = "REF_REGLEMENT")
    private String refReglement;

    @Column(name = "RIB")
    private String rib;

    @Column(name = "SINISTRE_PRISE_ENCHARGE")
    private Boolean sinistrePriseEncharge;

    @Column(name = "TITRE")
    private String titre;

    @Column(name = "TYPE_DESTINATAIRE")
    private String typeDestinataire;

    @Column(name = "VILLE_APPORTEUR")
    private String villeApporteur;

    @Column(name = "VILLE_DESTINATAIRE")
    private String villeDestinataire;

    @Column(name = "VILLE_SOCIETE")
    private String villeSociete;

    @Column(name = "VOS_REFERENCE")
    private String vosReference;

    @Column(name = "NBR_DECOMPTE")
    private Long nbrDecompte;

    @Column(name = "REJET_MESSAGE", length = 2500)
    private String rejetMessage;

    @Column(name = "ID_POSITIONNEMENT_ANNULE")
    private String idPositionnementAnnule;

}