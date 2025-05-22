package com.example.e_sante_app.data.entities;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;



@Getter
@Setter
@Table(name = "PST_SINISTRE")
@Entity
public class PstSinistre implements Serializable {

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


    @Column(name = "BENEF_EST_ASSURE")

    private Boolean benefEstAssure;


    @Column(name = "CONSO_FRANCHISE")

    private String consoFranchise;


    @Column(name = "DATE_DECLARATION")

    private Instant dateDeclaration;


    @Column(name = "DATE_FACTURE")

    private Instant dateFacture;


    @Column(name = "DATE_OUVERTURE", nullable = false)

    private Instant dateOuverture;


    @Column(name = "DATE_RECONNAISS_MALADIE")

    private Instant dateReconnaissMaladie;


    @Column(name = "DATE_SURVENANCE", nullable = false)

    private Instant dateSurvenance;


    @Column(name = "FACTURE_DEFINITIVE")

    private Boolean factureDefinitive;


    @Column(name = "FRAIS_ENGAGES")

    private Double fraisEngages;


    @Column(name = "NATURE_MALADIE")

    private String natureMaladie;


    @Column(name = "NOMBRE_REACTIVATION")

    private Long nombreReactivation;


    @Column(name = "NOMBRE_REOUVERTURE")

    private Long nombreReouverture;


    @Column(name = "NUM_RECIPISSE")

    private String numRecipisse;


    @Column(name = "NUM_SINISTRE", nullable = false)

    private String numSinistre;


    @Column(name = "NUM_SINISTRE_REDUIT", nullable = false)

    private String numSinistreReduit;


    @Column(name = "NUMERO_ORDRE_REOUVERTURE")

    private Long numeroOrdreReouverture;


    @Column(name = "REF_EXTERNE_SIN")

    private String refExterneSin;


    @Column(name = "REF_FACTURE")

    private String refFacture;


    @Column(name = "RELIQUAT_FRANCHISE")

    private String reliquatFranchise;


    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "ACCORD_PRINCIPAL_ID")

    private PstSinistre accordPrincipal;


    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "SIN_ORIGINE_ID")

    private PstSinistre sinOrigine;


    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "SIN_OUV_ID")

    private PstSinistre sinOuv;


    @Column(name = "SITUATION_ID")

    private Long situationId;


    @Column(name = "IS_SKIPPED_QUITTANCEMENT", nullable = false)

    private Boolean isSkippedQuittancement = false;


    @Column(name = "SKIP_MESSAGE", length = 500)

    private String skipMessage;


    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "ADH_ASSURE_ID")

    private AdhAssure adhAssure;


    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "ID_CONTRAT")

    private CtrContrat idContrat;


    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "TYPE_DECLARATION_ID")

    private RefTypeDeclaration typeDeclaration;

    @Transient
    private Long adhAssureId;

    @Transient
    private Long typeDeclarationId;
}