package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rubrique_question database table.
 * 
 */
@Entity
@Table(name="rubrique_question")
@NamedQuery(name="RubriqueQuestion.findAll", query="SELECT r FROM RubriqueQuestion r")
public class RubriqueQuestion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RubriqueQuestionPK id;

	private int ordre;

	public RubriqueQuestion() {
	}

	public RubriqueQuestionPK getId() {
		return this.id;
	}

	public void setId(RubriqueQuestionPK id) {
		this.id = id;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}