package fr.univbrest.dosi.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CG_REF_CODES database table.
 * 
 */
@Entity
@Table(name="CG_REF_CODES")
@NamedQuery(name="CgRefCode.findAll", query="SELECT c FROM CgRefCode c")
public class CgRefCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_CGRC", unique=true, nullable=false)
	private int idCgrc;

	@Column(name="RV_ABBREVIATION", length=240)
	private String rvAbbreviation;

	@Column(name="RV_DOMAIN", nullable=false, length=100)
	private String rvDomain;

	@Column(name="RV_HIGH_VALUE", length=240)
	private String rvHighValue;

	@Column(name="RV_LOW_VALUE", nullable=false, length=240)
	private String rvLowValue;

	@Column(name="RV_MEANING", length=240)
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