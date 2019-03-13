package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the promotion database table.
 * 
 */
@Entity
@NamedQuery(name="Promotion.findAll", query="SELECT p FROM Promotion p")
public class Promotion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PromotionPK id;

	private String commentaire;

	@Temporal(TemporalType.DATE)
	@Column(name="date_rentree")
	private Date dateRentree;

	@Temporal(TemporalType.DATE)
	@Column(name="date_reponse_lalp")
	private Date dateReponseLalp;

	@Temporal(TemporalType.DATE)
	@Column(name="date_reponse_lp")
	private Date dateReponseLp;

	@Column(name="lieu_rentree")
	private String lieuRentree;

	@Column(name="nb_max_etudiant")
	private int nbMaxEtudiant;

	@Column(name="processus_stage")
	private String processusStage;

	@Column(name="sigle_promotion")
	private String siglePromotion;

	public Promotion() {
	}

	public PromotionPK getId() {
		return this.id;
	}

	public void setId(PromotionPK id) {
		this.id = id;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDateRentree() {
		return this.dateRentree;
	}

	public void setDateRentree(Date dateRentree) {
		this.dateRentree = dateRentree;
	}

	public Date getDateReponseLalp() {
		return this.dateReponseLalp;
	}

	public void setDateReponseLalp(Date dateReponseLalp) {
		this.dateReponseLalp = dateReponseLalp;
	}

	public Date getDateReponseLp() {
		return this.dateReponseLp;
	}

	public void setDateReponseLp(Date dateReponseLp) {
		this.dateReponseLp = dateReponseLp;
	}

	public String getLieuRentree() {
		return this.lieuRentree;
	}

	public void setLieuRentree(String lieuRentree) {
		this.lieuRentree = lieuRentree;
	}

	public int getNbMaxEtudiant() {
		return this.nbMaxEtudiant;
	}

	public void setNbMaxEtudiant(int nbMaxEtudiant) {
		this.nbMaxEtudiant = nbMaxEtudiant;
	}

	public String getProcessusStage() {
		return this.processusStage;
	}

	public void setProcessusStage(String processusStage) {
		this.processusStage = processusStage;
	}

	public String getSiglePromotion() {
		return this.siglePromotion;
	}

	public void setSiglePromotion(String siglePromotion) {
		this.siglePromotion = siglePromotion;
	}

}