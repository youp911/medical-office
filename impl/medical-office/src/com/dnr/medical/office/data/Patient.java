package com.dnr.medical.office.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.dnr.kernel.data.Value;

/**
 * Entity implementation class for Entity: Patient
 * 
 * @author oussema
 */
@Entity
public class Patient extends Value {

	private String cin;
	private String nom;
	private String prenom;
	private String adresse;
	private int num_tel;
	private String sexe;
	private List<RendezVous> rendezVous;
	private static final long serialVersionUID = 1L;

	public Patient() {
		super();
	}

	@Id
	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNum_tel() {
		return this.num_tel;
	}

	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}

	public String getSexe() {
		return this.sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public List<RendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<RendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

}
