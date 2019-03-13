package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the reponse_evaluation database table.
 * 
 */
@Entity
@Table(name="reponse_evaluation")
@NamedQuery(name="ReponseEvaluation.findAll", query="SELECT r FROM ReponseEvaluation r")
public class ReponseEvaluation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_reponse_evaluation")
	private int idReponseEvaluation;

	private String commentaire;

	private String nom;

	private String prenom;

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

}