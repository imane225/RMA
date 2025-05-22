package com.example.e_sante_app.data.repositories;

import com.example.e_sante_app.data.dtos.SinistreDTO;
import com.example.e_sante_app.data.entities.PstSinistre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SinistreRepository extends JpaRepository<PstSinistre, Long> {
    // Méthode existante
    Page<PstSinistre> findAll(Pageable pageable);

    // Méthode pour trouver par numéro de sinistre
    PstSinistre findByNumSinistre(String numSinistre);

    // Méthode pour rechercher par nom complet (jointure nécessaire)
    @Query("SELECT ps FROM PstSinistre ps JOIN ps.adhAssure aa WHERE LOWER(CONCAT(aa.prenomAssure, ' ', aa.nomAssure)) LIKE LOWER(CONCAT('%', :nomComplet, '%'))")
    Page<PstSinistre> findByNomCompletContainingIgnoreCase(@Param("nomComplet") String nomComplet, Pageable pageable);

    // Méthode pour rechercher par nature de maladie
    Page<PstSinistre> findByNatureMaladieContainingIgnoreCase(String natureMaladie, Pageable pageable);
}
