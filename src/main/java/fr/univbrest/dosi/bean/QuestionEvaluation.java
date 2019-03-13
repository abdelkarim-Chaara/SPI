package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the question_evaluation database table.
 * 
 */
@Entity
@Table(name="question_evaluation")
@NamedQuery(name="QuestionEvaluation.findAll", query="SELECT q FROM QuestionEvaluation q")
public class QuestionEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_question_evaluation")
	private int idQuestionEvaluation;

	@Column(name="id_qualificatif")
	private int idQualificatif;

	private String intitule;

	private int ordre;

	public QuestionEvaluation() {
	}

	public int getIdQuestionEvaluation() {
		return this.idQuestionEvaluation;
	}

	public void setIdQuestionEvaluation(int idQuestionEvaluation) {
		this.idQuestionEvaluation = idQuestionEvaluation;
	}

	public int getIdQualificatif() {
		return this.idQualificatif;
	}

	public void setIdQualificatif(int idQualificatif) {
		this.idQualificatif = idQualificatif;
	}

	public String getIntitule() {
		return this.intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}