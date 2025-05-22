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
@Table(name = "PST_QUITTANCE_REGLEMENT")
public class PstQuittanceReglement {
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

    @Column(name = "ADRESSE_DESTINATAIRE")
    private String adresseDestinataire;

    @Column(name = "ADRESSE_SOCIETE")
    private String adresseSociete;

    @Column(name = "CODE_DESTINATAIRE")
    private String codeDestinataire;

    @Column(name = "CODE_INTERMEDIAIRE")
    private String codeIntermediaire;

    @Column(name = "CODE_INTERMEDIAIRE_APP")
    private String codeIntermediaireApp;

    @Column(name = "CODE_PAYS")
    private String codePays;

    @Column(name = "CODE_PRODUIT")
    private String codeProduit;

    @Column(name = "CODE_PRODUIT_COMPTABLE")
    private String codeProduitComptable;

    @Column(name = "CONSO_FRANCHISE")
    private String consoFranchise;

    @Column(name = "DATE_EFFET_CONTRAT")
    private Instant dateEffetContrat;

    @Column(name = "DATE_EMISSION")
    private Instant dateEmission;

    @Column(name = "DATE_MODIFICATION_ETAT")
    private Instant dateModificationEtat;

    @Column(name = "DATE_SINISTRE")
    private Instant dateSinistre;

    @Column(name = "ID_MOUVEMENT_ANN_TRANSVERES")
    private String idMouvementAnnTransveres;

    @Column(name = "MONTANT_QUITTANCE")
    private Double montantQuittance;

    @Column(name = "NATURE_CONTRAT")
    private String natureContrat;

    @Column(name = "NOM_ASSURE")
    private String nomAssure;

    @Column(name = "NOM_BENEFICIAIRE_REGLEMENT")
    private String nomBeneficiaireReglement;

    @Column(name = "NOM_TIERS")
    private String nomTiers;

    @Column(name = "NUM_AFFILIATION")
    private String numAffiliation;

    @Column(name = "NUM_CLIENT")
    private String numClient;

    @Column(name = "NUM_CONTRAT")
    private String numContrat;

    @Column(name = "NUM_QUITTANCE", nullable = false)
    private String numQuittance;

    @Column(name = "NUM_SINISTRE")
    private String numSinistre;

    @Column(name = "NUM_SINISTRE_REDUIT")
    private String numSinistreReduit;

    @Column(name = "NUM_SINISTRE_TRANSVERSE")
    private String numSinistreTransverse;

    @Column(name = "NUMERO_LOT")
    private String numeroLot;

    @Column(name = "PRENOM_ASSURE")
    private String prenomAssure;

    @Column(name = "PRENOM_TIERS")
    private String prenomTiers;

    @Column(name = "PRESTATAIRE_CODE")
    private String prestataireCode;

    @Column(name = "RAISON_SOCIALE")
    private String raisonSociale;

    @Column(name = "RAISON_SOCIALE_APPORTEUR")
    private String raisonSocialeApporteur;

    @Column(name = "RAISON_SOCIALE_DESTINATAIRE")
    private String raisonSocialeDestinataire;

    @Column(name = "SINISTRE_PRISE_ENCHARGE")
    private Boolean sinistrePriseEncharge;

    @Column(name = "TYPE_CONTRAT")
    private String typeContrat;

    @Column(name = "TYPE_DESTINATAIRE")
    private String typeDestinataire;

    @Column(name = "VILLE_APPORTEUR")
    private String villeApporteur;

    @Column(name = "VILLE_DESTINATAIRE")
    private String villeDestinataire;

    @Column(name = "VILLE_SOCIETE")
    private String villeSociete;

    @Column(name = "MODIFICATION_MDP_REG")
    private Boolean modificationMdpReg;

    @Column(name = "SKIP_CONTROLE_BLOCAGE_PREST")
    private Boolean skipControleBlocagePrest;

}