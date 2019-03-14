package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the QUESTION_EVALUATION database table.
 * 
 */
@Entity
@Table(name="QUESTION_EVALUATION")
@NamedQuery(name="QuestionEvaluation.findAll", query="SELECT q FROM QuestionEvaluation q")
public class QuestionEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_QUESTION_EVALUATION", unique=true, nullable=false)
	private int idQuestionEvaluation;

	@Column(length=64)
	private String intitule;

	@Column(nullable=false)
	private int ordre;

	//bi-directional many-to-one association to Qualificatif
	@ManyToOne
	@JoinColumn(name="ID_QUALIFICATIF")
	private Qualificatif qualificatif;

	//bi-directional many-to-one association to Question
	@ManyToOne
	@JoinColumn(name="ID_QUESTION")
	private Question question;

	//bi-directional many-to-one association to RubriqueEvaluation
	@ManyToOne
	@JoinColumn(name="ID_RUBRIQUE_EVALUATION", nullable=false)
	private RubriqueEvaluation rubriqueEvaluation;

	//bi-directional many-to-one association to ReponseQuestion
	@OneToMany(mappedBy="questionEvaluation")
	private List<ReponseQuestion> reponseQuestions;

	public QuestionEvaluation() {
	}

	public int getIdQuestionEvaluation() {
		return this.idQuestionEvaluation;
	}

	public void setIdQuestionEvaluation(int idQuestionEvaluation) {
		this.idQuestionEvaluation = idQuestionEvaluation;
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

	public Qualificatif getQualificatif() {
		return this.qualificatif;
	}

	public void setQualificatif(Qualificatif qualificatif) {
		this.qualificatif = qualificatif;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public RubriqueEvaluation getRubriqueEvaluation() {
		return this.rubriqueEvaluation;
	}

	public void setRubriqueEvaluation(RubriqueEvaluation rubriqueEvaluation) {
		this.rubriqueEvaluation = rubriqueEvaluation;
	}

	public List<ReponseQuestion> getReponseQuestions() {
		return this.reponseQuestions;
	}

	public void setReponseQuestions(List<ReponseQuestion> reponseQuestions) {
		this.reponseQuestions = reponseQuestions;
	}

	public ReponseQuestion addReponseQuestion(ReponseQuestion reponseQuestion) {
		getReponseQuestions().add(reponseQuestion);
		reponseQuestion.setQuestionEvaluation(this);

		return reponseQuestion;
	}

	public ReponseQuestion removeReponseQuestion(ReponseQuestion reponseQuestion) {
		getReponseQuestions().remove(reponseQuestion);
		reponseQuestion.setQuestionEvaluation(null);

		return reponseQuestion;
	}

}