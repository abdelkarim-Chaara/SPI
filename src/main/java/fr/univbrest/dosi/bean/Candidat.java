package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the candidat database table.
 * 
 */
@Entity
@NamedQuery(name="Candidat.findAll", query="SELECT c FROM Candidat c")
public class Candidat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="no_candidat")
	private String noCandidat;

	private String adresse;

	@Column(name="code_postal")
	private String codePostal;

	@Column(name="confirmation_candidat")
	private String confirmationCandidat;

	@Temporal(TemporalType.DATE)
	@Column(name="date_naissance")
	private Date dateNaissance;

	@Temporal(TemporalType.DATE)
	@Column(name="date_reponse_candidat")
	private Date dateReponseCandidat;

	private String email;

	@Column(name="lieu_naissance")
	private String lieuNaissance;

	@Column(name="liste_selection")
	private String listeSelection;

	private String mobile;

	private String nationalite;

	private String nom;

	@Column(name="pays_origine")
	private String paysOrigine;

	private String prenom;

	@Column(name="selection_no_ordre")
	private int selectionNoOrdre;

	private String sexe;

	private String telephone;

	@Column(name="universite_origine")
	private String universiteOrigine;

	private String ville;

	public Candidat() {
	}

	public String getNoCandidat() {
		return this.noCandidat;
	}

	public void setNoCandidat(String noCandidat) {
		this.noCandidat = noCandidat;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getConfirmationCandidat() {
		return this.confirmationCandidat;
	}

	public void setConfirmationCandidat(String confirmationCandidat) {
		this.confirmationCandidat = confirmationCandidat;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateReponseCandidat() {
		return this.dateReponseCandidat;
	}

	public void setDateReponseCandidat(Date dateReponseCandidat) {
		this.dateReponseCandidat = dateReponseCandidat;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLieuNaissance() {
		return this.lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getListeSelection() {
		return this.listeSelection;
	}

	public void setListeSelection(String listeSelection) {
		this.listeSelection = listeSelection;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNationalite() {
		return this.nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPaysOrigine() {
		return this.paysOrigine;
	}

	public void setPaysOrigine(String paysOrigine) {
		this.paysOrigine = paysOrigine;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getSelectionNoOrdre() {
		return this.selectionNoOrdre;
	}

	public void setSelectionNoOrdre(int selectionNoOrdre) {
		this.selectionNoOrdre = selectionNoOrdre;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getUniversiteOrigine() {
		return this.universiteOrigine;
	}

	public void setUniversiteOrigine(String universiteOrigine) {
		this.universiteOrigine = universiteOrigine;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}