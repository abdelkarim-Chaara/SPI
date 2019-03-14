package fr.univbrest.dosi.bean;

import java.io.Serializable;
import java.util.Objects;

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
	private int idCgrc;
	   private String rvDomain;
	   private String rvLowValue;
	   private String rvHighValue;
	   private String rvAbbreviation;
	   private String rvMeaning;

	   @Id
	   @Column(name = "ID_CGRC")
	   public int getIdCgrc() {
	       return idCgrc;
	   }

	   public void setIdCgrc(int idCgrc) {
	       this.idCgrc = idCgrc;
	   }

	   @Basic
	   @Column(name = "RV_DOMAIN")
	   public String getRvDomain() {
	       return rvDomain;
	   }

	   public void setRvDomain(String rvDomain) {
	       this.rvDomain = rvDomain;
	   }

	   @Basic
	   @Column(name = "RV_LOW_VALUE")
	   public String getRvLowValue() {
	       return rvLowValue;
	   }

	   public void setRvLowValue(String rvLowValue) {
	       this.rvLowValue = rvLowValue;
	   }

	   @Basic
	   @Column(name = "RV_HIGH_VALUE")
	   public String getRvHighValue() {
	       return rvHighValue;
	   }

	   public void setRvHighValue(String rvHighValue) {
	       this.rvHighValue = rvHighValue;
	   }

	   @Basic
	   @Column(name = "RV_ABBREVIATION")
	   public String getRvAbbreviation() {
	       return rvAbbreviation;
	   }

	   public void setRvAbbreviation(String rvAbbreviation) {
	       this.rvAbbreviation = rvAbbreviation;
	   }

	   @Basic
	   @Column(name = "RV_MEANING")
	   public String getRvMeaning() {
	       return rvMeaning;
	   }

	   public void setRvMeaning(String rvMeaning) {
	       this.rvMeaning = rvMeaning;
	   }

	   @Override
	   public boolean equals(Object o) {
	       if (this == o) return true;
	       if (o == null || getClass() != o.getClass()) return false;
	       CgRefCode that = (CgRefCode) o;
	       return idCgrc == that.idCgrc &&
	               Objects.equals(rvDomain, that.rvDomain) &&
	               Objects.equals(rvLowValue, that.rvLowValue) &&
	               Objects.equals(rvHighValue, that.rvHighValue) &&
	               Objects.equals(rvAbbreviation, that.rvAbbreviation) &&
	               Objects.equals(rvMeaning, that.rvMeaning);
	   }

	   @Override
	   public int hashCode() {
	       return Objects.hash(idCgrc, rvDomain, rvLowValue, rvHighValue, rvAbbreviation, rvMeaning);
	   }
	public CgRefCode() {
	}
	
	

}