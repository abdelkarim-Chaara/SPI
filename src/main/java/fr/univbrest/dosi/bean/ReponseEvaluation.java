package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REPONSE_EVALUATION database table.
 * 
 */
@Entity
@Table(name="REPONSE_EVALUATION")
@NamedQuery(name="ReponseEvaluation.findAll", query="SELECT r FROM ReponseEvaluation r")
public class ReponseEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_REPONSE_EVALUATION", unique=true, nullable=false)
	private int idReponseEvaluation;

	@Column(length=512)
	private String commentaire;

	@Column(length=32)
	private String nom;

	@Column(length=32)
	private String prenom;

	//bi-directional many-to-one association to Etudiant
	@ManyToOne
	@JoinColumn(name="NO_ETUDIANT")
	private Etudiant etudiant;

	//bi-directional many-to-one association to Evaluation
	@ManyToOne
	@JoinColumn(name="ID_EVALUATION", nullable=false)
	private Evaluation evaluation;

	public ReponseEvaluation() {
	}

	public int getIdReponseEvaluation() {
		return this.idReponseEvaluation;
	}

	public void setIdReponseEvaluation(int idReponseEvaluation) {
		this.idReponseEvaluation = idReponseEvaluation;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Etudiant getEtudiant() {
		return this.etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

}