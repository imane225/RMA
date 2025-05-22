package com.example.e_sante_app.data.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SinistreDTO {
    // From PstSinistre
    private Instant dateCreation;
    private Instant dateDeclaration;
    private Instant dateOuverture;
    private Instant dateSurvenance;
    private Double fraisEngages;
    private String natureMaladie;
    private String numSinistre;
    private String numSinistreReduit;

    // From AdhAssure
    private String nomComplet;
    private Instant dateAffiliation;
    private String adresseAssure;


    // From CtrContrat
    private String numPolice;
    private Long numeroFiliale;
    private String numeroRacine;
    private String refIntermediaireAppCode;

    // From RefTypeDeclaration
    private String typeDeclarationLibelle;
}