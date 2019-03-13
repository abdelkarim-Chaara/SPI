package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cg_ref_codes database table.
 * 
 */
@Entity
@Table(name="cg_ref_codes")
@NamedQuery(name="CgRefCode.findAll", query="SELECT c FROM CgRefCode c")
public class CgRefCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_cgrc")
	private int idCgrc;

	@Column(name="rv_abbreviation")
	private String rvAbbreviation;

	@Column(name="rv_domain")
	private String rvDomain;

	@Column(name="rv_high_value")
	private String rvHighValue;

	@Column(name="rv_low_value")
	private String rvLowValue;

	@Column(name="rv_meaning")
	private String rvMeaning;

	public CgRefCode() {
	}

	public int getIdCgrc() {
		return this.idCgrc;
	}

	public void setIdCgrc(int idCgrc) {
		this.idCgrc = idCgrc;
	}

	public String getRvAbbreviation() {
		return this.rvAbbreviation;
	}

	public void setRvAbbreviation(String rvAbbreviation) {
		this.rvAbbreviation = rvAbbreviation;
	}

	public String getRvDomain() {
		return this.rvDomain;
	}

	public void setRvDomain(String rvDomain) {
		this.rvDomain = rvDomain;
	}

	public String getRvHighValue() {
		return this.rvHighValue;
	}

	public void setRvHighValue(String rvHighValue) {
		this.rvHighValue = rvHighValue;
	}

	public String getRvLowValue() {
		return this.rvLowValue;
	}

	public void setRvLowValue(String rvLowValue) {
		this.rvLowValue = rvLowValue;
	}

	public String getRvMeaning() {
		return this.rvMeaning;
	}

	public void setRvMeaning(String rvMeaning) {
		this.rvMeaning = rvMeaning;
	}

}