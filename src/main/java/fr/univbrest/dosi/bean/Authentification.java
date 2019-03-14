package fr.univbrest.dosi.bean;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;


/**
 * The persistent class for the AUTHENTIFICATION database table.
 * 
 */
@Entity
@NamedQuery(name="Authentification.findAll", query="SELECT a FROM Authentification a")
public class Authentification implements Serializable {
	private static final long serialVersionUID = 1L;

	public Authentification() {
	}
	
	private int idConnection;
    private String role;
    private String loginConnection;
    private String pseudoConnection;
    private String motPasse;
    private Integer noEnseignant;
    private String noEtudiant;

    @Id
    @Column(name = "ID_CONNECTION")
    public int getIdConnection() {
        return idConnection;
    }

    public void setIdConnection(int idConnection) {
        this.idConnection = idConnection;
    }

    @Basic
    @Column(name = "ROLE")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "LOGIN_CONNECTION")
    public String getLoginConnection() {
        return loginConnection;
    }

    public void setLoginConnection(String loginConnection) {
        this.loginConnection = loginConnection;
    }

    @Basic
    @Column(name = "PSEUDO_CONNECTION")
    public String getPseudoConnection() {
        return pseudoConnection;
    }

    public void setPseudoConnection(String pseudoConnection) {
        this.pseudoConnection = pseudoConnection;
    }

    @Basic
    @Column(name = "MOT_PASSE")
    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    @Basic
    @Column(name = "NO_ENSEIGNANT")
    public Integer getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(Integer noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    @Basic
    @Column(name = "NO_ETUDIANT")
    public String getNoEtudiant() {
        return noEtudiant;
    }

    public void setNoEtudiant(String noEtudiant) {
        this.noEtudiant = noEtudiant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authentification that = (Authentification) o;
        return idConnection == that.idConnection &&
                Objects.equals(role, that.role) &&
                Objects.equals(loginConnection, that.loginConnection) &&
                Objects.equals(pseudoConnection, that.pseudoConnection) &&
                Objects.equals(motPasse, that.motPasse) &&
                Objects.equals(noEnseignant, that.noEnseignant) &&
                Objects.equals(noEtudiant, that.noEtudiant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idConnection, role, loginConnection, pseudoConnection, motPasse, noEnseignant, noEtudiant);
    }
}


