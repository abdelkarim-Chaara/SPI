package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EVALUATION database table.
 * 
 */
@Entity
@Table(name="EVALUATION")
@NamedQuery(name="Evaluation.findAll", query="SELECT e FROM Evaluation e")
public class Evaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_EVALUATION", unique=true, nullable=false)
	private int idEvaluation;

	@Temporal(TemporalType.DATE)
	@Column(name="DEBUT_REPONSE", nullable=false)
	private Date debutReponse;

	@Column(nullable=false, length=16)
	private String designation;

	@Column(nullable=false, length=3)
	private String etat;

	@Temporal(TemporalType.DATE)
	@Column(name="FIN_REPONSE", nullable=false)
	private Date finReponse;

	@Column(name="NO_EVALUATION", nullable=false)
	private int noEvaluation;

	@Column(length=64)
	private String periode;

	//bi-directional many-to-one association to Droit
	@OneToMany(mappedBy="evaluation")
	private List<Droit> droits;

	//bi-directional many-to-one association to ElementConstitutif
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CODE_EC", referencedColumnName="CODE_EC", insertable=false, updatable=false),
		@JoinColumn(name="CODE_FORMATION", referencedColumnName="CODE_FORMATION", insertable=false, updatable=false),
		@JoinColumn(name="CODE_UE", referencedColumnName="CODE_UE", insertable=false, updatable=false)
		})
	private ElementConstitutif elementConstitutif;

	//bi-directional many-to-one association to Enseignant
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT", nullable=false)
	private Enseignant enseignant;

	//bi-directional many-to-one association to Promotion
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ANNEE_UNIVERSITAIRE", referencedColumnName="CODE_FORMATION", insertable=false, updatable=false),
		@JoinColumn(name="CODE_FORMATION", referencedColumnName="ANNEE_UNIVERSITAIRE", insertable=false, updatable=false)
		})
	private Promotion promotion;

	//bi-directional many-to-one association to UniteEnseignement
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CODE_FORMATION", referencedColumnName="CODE_FORMATION", insertable=false, updatable=false),
		@JoinColumn(name="CODE_UE", referencedColumnName="CODE_UE", insertable=false, updatable=false)
		})
	private UniteEnseignement uniteEnseignement;

	//bi-directional many-to-one association to ReponseEvaluation
	@OneToMany(mappedBy="evaluation")
	private List<ReponseEvaluation> reponseEvaluations;

	//bi-directional many-to-one association to RubriqueEvaluation
	@OneToMany(mappedBy="evaluation")
	private List<RubriqueEvaluation> rubriqueEvaluations;

	public Evaluation() {
	}

	public int getIdEvaluation() {
		return this.idEvaluation;
	}

	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public Date getDebutReponse() {
		return this.debutReponse;
	}

	public void setDebutReponse(Date debutReponse) {
		this.debutReponse = debutReponse;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getFinReponse() {
		return this.finReponse;
	}

	public void setFinReponse(Date finReponse) {
		this.finReponse = finReponse;
	}

	public int getNoEvaluation() {
		return this.noEvaluation;
	}

	public void setNoEvaluation(int noEvaluation) {
		this.noEvaluation = noEvaluation;
	}

	public String getPeriode() {
		return this.periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public List<Droit> getDroits() {
		return this.droits;
	}

	public void setDroits(List<Droit> droits) {
		this.droits = droits;
	}

	public Droit addDroit(Droit droit) {
		getDroits().add(droit);
		droit.setEvaluation(this);

		return droit;
	}

	public Droit removeDroit(Droit droit) {
		getDroits().remove(droit);
		droit.setEvaluation(null);

		return droit;
	}

	public ElementConstitutif getElementConstitutif() {
		return this.elementConstitutif;
	}

	public void setElementConstitutif(ElementConstitutif elementConstitutif) {
		this.elementConstitutif = elementConstitutif;
	}

	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Promotion getPromotion() {
		return this.promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public UniteEnseignement getUniteEnseignement() {
		return this.uniteEnseignement;
	}

	public void setUniteEnseignement(UniteEnseignement uniteEnseignement) {
		this.uniteEnseignement = uniteEnseignement;
	}

	public List<ReponseEvaluation> getReponseEvaluations() {
		return this.reponseEvaluations;
	}

	public void setReponseEvaluations(List<ReponseEvaluation> reponseEvaluations) {
		this.reponseEvaluations = reponseEvaluations;
	}

	public ReponseEvaluation addReponseEvaluation(ReponseEvaluation reponseEvaluation) {
		getReponseEvaluations().add(reponseEvaluation);
		reponseEvaluation.setEvaluation(this);

		return reponseEvaluation;
	}

	public ReponseEvaluation removeReponseEvaluation(ReponseEvaluation reponseEvaluation) {
		getReponseEvaluations().remove(reponseEvaluation);
		reponseEvaluation.setEvaluation(null);

		return reponseEvaluation;
	}

	public List<RubriqueEvaluation> getRubriqueEvaluations() {
		return this.rubriqueEvaluations;
	}

	public void setRubriqueEvaluations(List<RubriqueEvaluation> rubriqueEvaluations) {
		this.rubriqueEvaluations = rubriqueEvaluations;
	}

	public RubriqueEvaluation addRubriqueEvaluation(RubriqueEvaluation rubriqueEvaluation) {
		getRubriqueEvaluations().add(rubriqueEvaluation);
		rubriqueEvaluation.setEvaluation(this);

		return rubriqueEvaluation;
	}

	public RubriqueEvaluation removeRubriqueEvaluation(RubriqueEvaluation rubriqueEvaluation) {
		getRubriqueEvaluations().remove(rubriqueEvaluation);
		rubriqueEvaluation.setEvaluation(null);

		return rubriqueEvaluation;
	}

}