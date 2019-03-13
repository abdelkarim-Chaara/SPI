package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the droit database table.
 * 
 */
@Embeddable
public class DroitPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="no_enseignant")
	private int noEnseignant;

	@Column(name="id_evaluation")
	private int idEvaluation;

	public DroitPK() {
	}
	public int getNoEnseignant() {
		return this.noEnseignant;
	}
	public void setNoEnseignant(int noEnseignant) {
		this.noEnseignant = noEnseignant;
	}
	public int getIdEvaluation() {
		return this.idEvaluation;
	}
	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DroitPK)) {
			return false;
		}
		DroitPK castOther = (DroitPK)other;
		return 
			(this.noEnseignant == castOther.noEnseignant)
			&& (this.idEvaluation == castOther.idEvaluation);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.noEnseignant;
		hash = hash * prime + this.idEvaluation;
		
		return hash;
	}
}