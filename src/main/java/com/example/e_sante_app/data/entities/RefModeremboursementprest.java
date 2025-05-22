package com.example.e_sante_app.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "REF_MODEREMBOURSEMENTPREST")
public class RefModeremboursementprest {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "LIBELLE")
    private String libelle;

}