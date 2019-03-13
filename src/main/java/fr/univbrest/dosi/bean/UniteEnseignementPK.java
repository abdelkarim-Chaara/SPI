package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the unite_enseignement database table.
 * 
 */
@Embeddable
public class UniteEnseignementPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_ue")
	private String codeUe;

	@Column(name="code_formation")
	private String codeFormation;

	public UniteEnseignementPK() {
	}
	public String getCodeUe() {
		return this.codeUe;
	}
	public void setCodeUe(String codeUe) {
		this.codeUe = codeUe;
	}
	public String getCodeFormation() {
		return this.codeFormation;
	}
	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UniteEnseignementPK)) {
			return false;
		}
		UniteEnseignementPK castOther = (UniteEnseignementPK)other;
		return 
			this.codeUe.equals(castOther.codeUe)
			&& this.codeFormation.equals(castOther.codeFormation);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeUe.hashCode();
		hash = hash * prime + this.codeFormation.hashCode();
		
		return hash;
	}
}