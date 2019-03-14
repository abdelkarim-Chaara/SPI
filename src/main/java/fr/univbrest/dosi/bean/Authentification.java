package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AUTHENTIFICATION database table.
 * 
 */
@Entity
@Table(name="AUTHENTIFICATION")
@NamedQuery(name="Authentification.findAll", query="SELECT a FROM Authentification a")
public class Authentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CONNECTION", unique=true, nullable=false)
	private int idConnection;

	@Column(name="LOGIN_CONNECTION", nullable=false, length=64)
	private String loginConnection;

	@Column(name="MOT_PASSE", length=32)
	private String motPasse;

	@Column(name="NO_ENSEIGNANT")
	private int noEnseignant;

	@Column(name="NO_ETUDIANT", length=50)
	private String noEtudiant;

	@Column(name="PSEUDO_CONNECTION", length=240)
	private String pseudoConnection;

	@Column(nullable=false, length=5)
	private String role;

	public Authentification() {
	}

	public int getIdConnection() {
		return this.idConnection;
	}

	public void setIdConnection(int idConnection) {
		this.idConnection = idConnection;
	}

	public String getLoginConnection() {
		return this.loginConnection;
	}

	public void setLoginConnection(String loginConnection) {
		this.loginConnection = loginConnection;
	}

	public String getMotPasse() {
		return this.motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public int getNoEnseignant() {
		return this.noEnseignant;
	}

	public void setNoEnseignant(int noEnseignant) {
		this.noEnseignant = noEnseignant;
	}

	public String getNoEtudiant() {
		return this.noEtudiant;
	}

	public void setNoEtudiant(String noEtudiant) {
		this.noEtudiant = noEtudiant;
	}

	public String getPseudoConnection() {
		return this.pseudoConnection;
	}

	public void setPseudoConnection(String pseudoConnection) {
		this.pseudoConnection = pseudoConnection;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}