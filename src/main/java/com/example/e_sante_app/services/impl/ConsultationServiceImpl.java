package com.example.e_sante_app.services.impl;

import com.example.e_sante_app.data.dtos.SinistreDTO;
import com.example.e_sante_app.data.entities.PstSinistre;
import com.example.e_sante_app.data.repositories.SinistreRepository;
import com.example.e_sante_app.mappers.SinistreMapper;
import com.example.e_sante_app.services.iservice.ConsultationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ConsultationServiceImpl implements ConsultationService {

    private final SinistreRepository sinistreRepository;
    private final SinistreMapper sinistreMapper;

    @Override
    public Page<SinistreDTO> getAllSinistres(Pageable pageable) {
        Page<PstSinistre> sinistresPage = sinistreRepository.findAll(pageable);
        return sinistresPage.map(sinistreMapper::toDTO);
    }

    @Override
    public Optional<SinistreDTO> getSinistreByNumSinistre(String numSinistre) {
        PstSinistre sinistre = sinistreRepository.findByNumSinistre(numSinistre);
        return Optional.ofNullable(sinistre).map(sinistreMapper::toDTO);
    }

    @Override
    public Page<SinistreDTO> getSinistresByNomComplet(String nomComplet, Pageable pageable) {
        Page<PstSinistre> sinistresPage = sinistreRepository.findByNomCompletContainingIgnoreCase(nomComplet, pageable);
        return sinistresPage.map(sinistreMapper::toDTO);
    }

    @Override
    public Page<SinistreDTO> getSinistresByNatureMaladie(String natureMaladie, Pageable pageable) {
        Page<PstSinistre> sinistresPage = sinistreRepository.findByNatureMaladieContainingIgnoreCase(natureMaladie, pageable);
        return sinistresPage.map(sinistreMapper::toDTO);
    }
}