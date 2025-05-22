package com.example.e_sante_app.services.iservice;

import com.example.e_sante_app.data.dtos.SinistreDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ConsultationService {
    Page<SinistreDTO> getAllSinistres(Pageable pageable);
    Optional<SinistreDTO> getSinistreByNumSinistre(String numSinistre);
    Page<SinistreDTO> getSinistresByNomComplet(String nomComplet, Pageable pageable);
    Page<SinistreDTO> getSinistresByNatureMaladie(String natureMaladie, Pageable pageable);
}