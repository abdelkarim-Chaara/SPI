package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the RUBRIQUE_QUESTION database table.
 * 
 */
@Embeddable
public class RubriqueQuestionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_RUBRIQUE", insertable=false, updatable=false)
	private int idRubrique;

	@Column(name="ID_QUESTION", insertable=false, updatable=false)
	private int idQuestion;

	public RubriqueQuestionPK() {
	}
	public int getIdRubrique() {
		return this.idRubrique;
	}
	public void setIdRubrique(int idRubrique) {
		this.idRubrique = idRubrique;
	}
	public int getIdQuestion() {
		return this.idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RubriqueQuestionPK)) {
			return false;
		}
		RubriqueQuestionPK castOther = (RubriqueQuestionPK)other;
		return 
			(this.idRubrique == castOther.idRubrique)
			&& (this.idQuestion == castOther.idQuestion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idRubrique;
		hash = hash * prime + this.idQuestion;
		
		return hash;
	}
}