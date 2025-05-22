package com.example.e_sante_app.mappers;

import com.example.e_sante_app.data.dtos.SinistreDTO;
import com.example.e_sante_app.data.entities.PstSinistre;
import org.springframework.stereotype.Component;

@Component
public class SinistreMapper {

    public SinistreDTO toDTO(PstSinistre entity) {
        if (entity == null) {
            return null;
        }

        return SinistreDTO.builder()
                .dateCreation(entity.getDatecreation())
                .dateDeclaration(entity.getDateDeclaration())
                .dateOuverture(entity.getDateOuverture())
                .dateSurvenance(entity.getDateSurvenance())
                .fraisEngages(entity.getFraisEngages())
                .natureMaladie(entity.getNatureMaladie())
                .numSinistre(entity.getNumSinistre())
                .numSinistreReduit(entity.getNumSinistreReduit())
                .nomComplet(entity.getAdhAssure() != null ?
                        entity.getAdhAssure().getPrenomAssure() + " " + entity.getAdhAssure().getNomAssure() : null)
                .dateAffiliation(entity.getAdhAssure() != null ? entity.getAdhAssure().getDateAffiliation() : null)
                .adresseAssure(entity.getAdhAssure() != null ? entity.getAdhAssure().getAdresseAssure() : null)
                .numPolice(entity.getIdContrat() != null ? entity.getIdContrat().getNumpolice() : null)
                .numeroFiliale(entity.getIdContrat() != null ? entity.getIdContrat().getNumeroFiliale() : null)
                .numeroRacine(entity.getIdContrat() != null ? entity.getIdContrat().getNumeroRacine() : null)
                .refIntermediaireAppCode(entity.getIdContrat() != null ?
                        entity.getIdContrat().getRefintermediaireappcode() : null)
                .typeDeclarationLibelle(entity.getTypeDeclaration() != null ?
                        entity.getTypeDeclaration().getLibelle() : null)
                .build();
    }
}