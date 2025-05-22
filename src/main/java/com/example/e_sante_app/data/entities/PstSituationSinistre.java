package com.example.e_sante_app.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "PST_SITUATION_SINISTRE")
public class PstSituationSinistre {
    @EmbeddedId
    private PstSituationSinistreId id;

    @Column(name = "DATECREATION", nullable = false)
    private Instant datecreation;

    @Column(name = "DATEMODIFICATION")
    private Instant datemodification;

    @Column(name = "UTILISATEURCREATEUR", nullable = false)
    private String utilisateurcreateur;

    @Column(name = "UTILISATEURMODIFICATEUR")
    private String utilisateurmodificateur;

    @Column(name = "DATE_SITUATION", nullable = false)
    private Instant dateSituation;

}