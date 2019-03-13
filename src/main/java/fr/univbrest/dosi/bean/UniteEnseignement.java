package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unite_enseignement database table.
 * 
 */
@Entity
@Table(name="unite_enseignement")
@NamedQuery(name="UniteEnseignement.findAll", query="SELECT u FROM UniteEnseignement u")
public class UniteEnseignement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UniteEnseignementPK id;

	private String description;

	private String designation;

	@Column(name="nbh_cm")
	private int nbhCm;

	@Column(name="nbh_td")
	private int nbhTd;

	@Column(name="nbh_tp")
	private int nbhTp;

	private String semestre;

	public UniteEnseignement() {
	}

	public UniteEnseignementPK getId() {
		return this.id;
	}

	public void setId(UniteEnseignementPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getNbhCm() {
		return this.nbhCm;
	}

	public void setNbhCm(int nbhCm) {
		this.nbhCm = nbhCm;
	}

	public int getNbhTd() {
		return this.nbhTd;
	}

	public void setNbhTd(int nbhTd) {
		this.nbhTd = nbhTd;
	}

	public int getNbhTp() {
		return this.nbhTp;
	}

	public void setNbhTp(int nbhTp) {
		this.nbhTp = nbhTp;
	}

	public String getSemestre() {
		return this.semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}