package Metier;

public class Bibliotheque {
	private Document[] lesDocs = new Document[10];
	int indice=0;

	public void ajouteDocument(String titre , String auteur) {
		
		lesDocs[indice++] = new Document(titre,auteur);
	}

	 public String affiche() {
	
		String retval= " ";
		for(Document d: lesDocs) {
			if(d!= null) {
				retval += d.affiche()+ "\n";
			}
			
			
		}
		return retval;
	}

}
