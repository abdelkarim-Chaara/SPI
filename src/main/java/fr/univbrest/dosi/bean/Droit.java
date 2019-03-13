package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the droit database table.
 * 
 */
@Entity
@NamedQuery(name="Droit.findAll", query="SELECT d FROM Droit d")
public class Droit implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DroitPK id;

	private String consultation;

	private String duplication;

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

}