package com.example.e_sante_app.controllers;

import com.example.e_sante_app.data.dtos.SinistreDTO;
import com.example.e_sante_app.services.iservice.ConsultationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/sinistres")
@RequiredArgsConstructor
public class ConsultationController {

    private final ConsultationService consultationService;

    @GetMapping
    public ResponseEntity<Page<SinistreDTO>> getAllSinistres(@PageableDefault(size = 10) Pageable pageable) {
        return ResponseEntity.ok(consultationService.getAllSinistres(pageable));
    }

    @GetMapping("/{numSinistre}")
    public ResponseEntity<SinistreDTO> getSinistreByNumSinistre(@PathVariable String numSinistre) {
        return consultationService.getSinistreByNumSinistre(numSinistre)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/by-nom")
    public ResponseEntity<Page<SinistreDTO>> getSinistresByNomComplet(
            @RequestParam String nomComplet,
            @PageableDefault(size = 10) Pageable pageable) {
        Page<SinistreDTO> sinistres = consultationService.getSinistresByNomComplet(nomComplet, pageable);
        if (sinistres.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(sinistres);
    }

    @GetMapping("/by-maladie")
    public ResponseEntity<Page<SinistreDTO>> getSinistresByNatureMaladie(
            @RequestParam String natureMaladie,
            @PageableDefault(size = 10) Pageable pageable) {
        Page<SinistreDTO> sinistres = consultationService.getSinistresByNatureMaladie(natureMaladie, pageable);
        if (sinistres.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(sinistres);
    }
}