package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the RUBRIQUE database table.
 * 
 */
@Entity
@Table(name="RUBRIQUE")
@NamedQuery(name="Rubrique.findAll", query="SELECT r FROM Rubrique r")
public class Rubrique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_RUBRIQUE", unique=true, nullable=false)
	private int idRubrique;

	@Column(nullable=false, length=32)
	private String designation;

	private int ordre;

	@Column(nullable=false, length=10)
	private String type;

	//bi-directional many-to-one association to Enseignant
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT")
	private Enseignant enseignant;

	//bi-directional many-to-one association to RubriqueEvaluation
	@OneToMany(mappedBy="rubrique")
	private List<RubriqueEvaluation> rubriqueEvaluations;

	//bi-directional many-to-one association to RubriqueQuestion
	@OneToMany(mappedBy="rubrique")
	private List<RubriqueQuestion> rubriqueQuestions;

	public Rubrique() {
	}

	public int getIdRubrique() {
		return this.idRubrique;
	}

	public void setIdRubrique(int idRubrique) {
		this.idRubrique = idRubrique;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public List<RubriqueEvaluation> getRubriqueEvaluations() {
		return this.rubriqueEvaluations;
	}

	public void setRubriqueEvaluations(List<RubriqueEvaluation> rubriqueEvaluations) {
		this.rubriqueEvaluations = rubriqueEvaluations;
	}

	public RubriqueEvaluation addRubriqueEvaluation(RubriqueEvaluation rubriqueEvaluation) {
		getRubriqueEvaluations().add(rubriqueEvaluation);
		rubriqueEvaluation.setRubrique(this);

		return rubriqueEvaluation;
	}

	public RubriqueEvaluation removeRubriqueEvaluation(RubriqueEvaluation rubriqueEvaluation) {
		getRubriqueEvaluations().remove(rubriqueEvaluation);
		rubriqueEvaluation.setRubrique(null);

		return rubriqueEvaluation;
	}

	public List<RubriqueQuestion> getRubriqueQuestions() {
		return this.rubriqueQuestions;
	}

	public void setRubriqueQuestions(List<RubriqueQuestion> rubriqueQuestions) {
		this.rubriqueQuestions = rubriqueQuestions;
	}

	public RubriqueQuestion addRubriqueQuestion(RubriqueQuestion rubriqueQuestion) {
		getRubriqueQuestions().add(rubriqueQuestion);
		rubriqueQuestion.setRubrique(this);

		return rubriqueQuestion;
	}

	public RubriqueQuestion removeRubriqueQuestion(RubriqueQuestion rubriqueQuestion) {
		getRubriqueQuestions().remove(rubriqueQuestion);
		rubriqueQuestion.setRubrique(null);

		return rubriqueQuestion;
	}

}