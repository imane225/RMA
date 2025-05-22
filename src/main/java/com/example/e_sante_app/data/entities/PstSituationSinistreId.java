package com.example.e_sante_app.data.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class PstSituationSinistreId implements Serializable {
    private static final long serialVersionUID = -3250404944802191225L;

    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "REF_ETAT_SINISTRE_ID")
    private Long refEtatSinistreId;

    // Add equals and hashCode methods for proper composite key functionality
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PstSituationSinistreId that = (PstSituationSinistreId) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return refEtatSinistreId != null ? refEtatSinistreId.equals(that.refEtatSinistreId) : that.refEtatSinistreId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (refEtatSinistreId != null ? refEtatSinistreId.hashCode() : 0);
        return result;
    }
}