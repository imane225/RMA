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
@Table(name = "ADH_ASSURE")
public class AdhAssure {
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

    @Column(name = "ADEMAIL_ASSURE")
    private String ademailAssure;

    @Column(name = "ADRESSE_ASSURE")
    private String adresseAssure;

    @Column(name = "AUTRE_PROFESSION")
    private String autreProfession;

    @Column(name = "CHAMPS_REQUIS_REMPLIS")
    private Boolean champsRequisRemplis;

    @Column(name = "ADCP_ASSURE")
    private String adcpAssure;

    @Column(name = "CODE_TRANSFERT")
    private Long codeTransfert;

    @Column(name = "DATE_AFFILIATION")
    private Instant dateAffiliation;

    @Column(name = "DATEENTFCT_ASSURE")
    private Instant dateentfctAssure;

    @Column(name = "DATENAISSANCE_ASSURE")
    private Instant datenaissanceAssure;

    @Column(name = "DATE_TRANSFERT")
    private Instant dateTransfert;

    @Column(name = "NBRCONJ_ASSURE")
    private Long nbrconjAssure;

    @Column(name = "NB_CONJ_SAISI")
    private Long nbConjSaisi;

    @Column(name = "NBRENF_ASSURE")
    private Long nbrenfAssure;

    @Column(name = "NB_ENF_SAISI")
    private Long nbEnfSaisi;

    @Column(name = "NOM_ASSURE")
    private String nomAssure;

    @Column(name = "NOM_PRENOM_EMB")
    private String nomPrenomEmb;

    @Column(name = "NUM_AFFILIATION")
    private String numAffiliation;

    @Column(name = "NUMDOCIDENTIF_ASSURE")
    private String numdocidentifAssure;

    @Column(name = "NUMFAX_ASSURE")
    private String numfaxAssure;

    @Column(name = "NUMMATRICULE_ASSURE")
    private String nummatriculeAssure;

    @Column(name = "NUM_REGIMEBASE")
    private String numRegimebase;

    @Column(name = "NUMTEL_ASSURE")
    private String numtelAssure;

    @Column(name = "NUMDOMICILE_ASSURE")
    private String numdomicileAssure;

    @Column(name = "PRENOM_ASSURE")
    private String prenomAssure;

    @Column(name = "RIB")
    private String rib;

}