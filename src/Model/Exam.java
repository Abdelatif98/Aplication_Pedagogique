package Model;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.IntegerProperty;

public class Exam {
	private IntegerProperty  id_exam= new SimpleIntegerProperty();
	private StringProperty contenu = new SimpleStringProperty();
	private IntegerProperty  id_mat= new SimpleIntegerProperty();
public Exam(int id_exam,String contenu,int id_mat) {
	this.id_exam= new SimpleIntegerProperty(id_exam);
	this.id_mat= new SimpleIntegerProperty(id_mat);
	this.contenu=new SimpleStringProperty(contenu);
}
public StringProperty getContenu() {
	return contenu;
}
public IntegerProperty getId_exam() {
	return id_exam;
}
public IntegerProperty getId_mat() {
	return id_mat;
}

}