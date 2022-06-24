package Metier;

public class Document {
	private String titre;
	private String auteur;
	
	
	 Document (String t, String a) {
		
		titre = t;
		auteur= a;
		
	}
String affiche() {
	return titre+"  de "+auteur;
}
}
