package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RUBRIQUE_EVALUATION database table.
 * 
 */
@Entity
@Table(name="RUBRIQUE_EVALUATION")
@NamedQuery(name="RubriqueEvaluation.findAll", query="SELECT r FROM RubriqueEvaluation r")
public class RubriqueEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RUBRIQUE_EVALUATION", unique=true, nullable=false)
	private int idRubriqueEvaluation;

	@Column(length=64)
	private String designation;

	@Column(nullable=false)
	private int ordre;

	//bi-directional many-to-one association to QuestionEvaluation
	@OneToMany(mappedBy="rubriqueEvaluation")
	private List<QuestionEvaluation> questionEvaluations;

	//bi-directional many-to-one association to Evaluation
	@ManyToOne
	@JoinColumn(name="ID_EVALUATION", nullable=false)
	private Evaluation evaluation;

	//bi-directional many-to-one association to Rubrique
	@ManyToOne
	@JoinColumn(name="ID_RUBRIQUE")
	private Rubrique rubrique;

	public RubriqueEvaluation() {
	}

	public int getIdRubriqueEvaluation() {
		return this.idRubriqueEvaluation;
	}

	public void setIdRubriqueEvaluation(int idRubriqueEvaluation) {
		this.idRubriqueEvaluation = idRubriqueEvaluation;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public List<QuestionEvaluation> getQuestionEvaluations() {
		return this.questionEvaluations;
	}

	public void setQuestionEvaluations(List<QuestionEvaluation> questionEvaluations) {
		this.questionEvaluations = questionEvaluations;
	}

	public QuestionEvaluation addQuestionEvaluation(QuestionEvaluation questionEvaluation) {
		getQuestionEvaluations().add(questionEvaluation);
		questionEvaluation.setRubriqueEvaluation(this);

		return questionEvaluation;
	}

	public QuestionEvaluation removeQuestionEvaluation(QuestionEvaluation questionEvaluation) {
		getQuestionEvaluations().remove(questionEvaluation);
		questionEvaluation.setRubriqueEvaluation(null);

		return questionEvaluation;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

	public Rubrique getRubrique() {
		return this.rubrique;
	}

	public void setRubrique(Rubrique rubrique) {
		this.rubrique = rubrique;
	}

}