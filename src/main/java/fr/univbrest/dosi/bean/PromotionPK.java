package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the promotion database table.
 * 
 */
@Embeddable
public class PromotionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_formation")
	private String codeFormation;

	@Column(name="annee_universitaire")
	private String anneeUniversitaire;

	public PromotionPK() {
	}
	public String getCodeFormation() {
		return this.codeFormation;
	}
	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}
	public String getAnneeUniversitaire() {
		return this.anneeUniversitaire;
	}
	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PromotionPK)) {
			return false;
		}
		PromotionPK castOther = (PromotionPK)other;
		return 
			this.codeFormation.equals(castOther.codeFormation)
			&& this.anneeUniversitaire.equals(castOther.anneeUniversitaire);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeFormation.hashCode();
		hash = hash * prime + this.anneeUniversitaire.hashCode();
		
		return hash;
	}
}