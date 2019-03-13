package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the formation database table.
 * 
 */
@Entity
@NamedQuery(name="Formation.findAll", query="SELECT f FROM Formation f")
public class Formation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_formation")
	private String codeFormation;

	@Temporal(TemporalType.DATE)
	@Column(name="debut_accreditation")
	private Date debutAccreditation;

	private String diplome;

	@Column(name="double_diplome")
	private String doubleDiplome;

	@Temporal(TemporalType.DATE)
	@Column(name="fin_accreditation")
	private Date finAccreditation;

	@Column(name="n0_annee")
	private int n0Annee;

	@Column(name="nom_formation")
	private String nomFormation;

	public Formation() {
	}

	public String getCodeFormation() {
		return this.codeFormation;
	}

	public void setCodeFormation(String codeFormation) {
		this.codeFormation = codeFormation;
	}

	public Date getDebutAccreditation() {
		return this.debutAccreditation;
	}

	public void setDebutAccreditation(Date debutAccreditation) {
		this.debutAccreditation = debutAccreditation;
	}

	public String getDiplome() {
		return this.diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getDoubleDiplome() {
		return this.doubleDiplome;
	}

	public void setDoubleDiplome(String doubleDiplome) {
		this.doubleDiplome = doubleDiplome;
	}

	public Date getFinAccreditation() {
		return this.finAccreditation;
	}

	public void setFinAccreditation(Date finAccreditation) {
		this.finAccreditation = finAccreditation;
	}

	public int getN0Annee() {
		return this.n0Annee;
	}

	public void setN0Annee(int n0Annee) {
		this.n0Annee = n0Annee;
	}

	public String getNomFormation() {
		return this.nomFormation;
	}

	public void setNomFormation(String nomFormation) {
		this.nomFormation = nomFormation;
	}

}