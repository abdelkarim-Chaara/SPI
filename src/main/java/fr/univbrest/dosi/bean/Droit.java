package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DROIT database table.
 * 
 */
@Entity
@Table(name="DROIT")
@NamedQuery(name="Droit.findAll", query="SELECT d FROM Droit d")
public class Droit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DroitPK id;

	@Column(nullable=false, length=1)
	private String consultation;

	@Column(nullable=false, length=1)
	private String duplication;

	//bi-directional many-to-one association to Enseignant
	@ManyToOne
	@JoinColumn(name="NO_ENSEIGNANT", nullable=false, insertable=false, updatable=false)
	private Enseignant enseignant;

	//bi-directional many-to-one association to Evaluation
	@ManyToOne
	@JoinColumn(name="ID_EVALUATION", nullable=false, insertable=false, updatable=false)
	private Evaluation evaluation;

	public Droit() {
	}

	public DroitPK getId() {
		return this.id;
	}

	public void setId(DroitPK id) {
		this.id = id;
	}

	public String getConsultation() {
		return this.consultation;
	}

	public void setConsultation(String consultation) {
		this.consultation = consultation;
	}

	public String getDuplication() {
		return this.duplication;
	}

	public void setDuplication(String duplication) {
		this.duplication = duplication;
	}

	public Enseignant getEnseignant() {
		return this.enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Evaluation getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

}