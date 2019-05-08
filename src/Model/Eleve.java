package Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Eleve {
	private  IntegerProperty id_eleve=new SimpleIntegerProperty() ;
	private  StringProperty nom= new SimpleStringProperty();
	private  StringProperty prenom= new SimpleStringProperty();
	private  StringProperty pseudo= new SimpleStringProperty();
	private  StringProperty mot_de_passe= new SimpleStringProperty();
	
	public Eleve(int id_eleve,String nom,String prenom,String pseudo,String mot_de_passe) {
		this.id_eleve=new SimpleIntegerProperty(id_eleve);
		this.nom=new SimpleStringProperty(nom);
		this.prenom=new SimpleStringProperty(prenom);
		this.pseudo=new SimpleStringProperty(pseudo);
		this.mot_de_passe=new SimpleStringProperty(mot_de_passe);
		
	}
	public IntegerProperty getId_eleve() {
		return id_eleve;
	}
	public void setId_eleve(IntegerProperty id_eleve) {
		this.id_eleve = id_eleve;
	}
	public StringProperty getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(StringProperty mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public StringProperty getNom() {
		return nom;
	}
	public void setNom(StringProperty nom) {
		this.nom = nom;
	}
	public StringProperty getPrenom() {
		return prenom;
	}
	public void setPrenom(StringProperty prenom) {
		this.prenom = prenom;
	}
	public StringProperty getPseudo() {
		return pseudo;
	}
	public void setPseudo(StringProperty pseudo) {
		this.pseudo = pseudo;
	}

}
