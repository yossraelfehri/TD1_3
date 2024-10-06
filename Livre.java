package TD1_3;

public class Livre {
	private String titre;
	private String auteur;
	private float nbPages;
	public void livre (String auteur , String titre) {
		this.auteur = auteur;
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public String getTitre() {
		return titre;
	}
	public float getNbPages() {
		return nbPages;
	}
	public void setNbPages (float nb) {
		if (nb > 20) {
			nbPages = nb;
		}else {
			System.out.println("le nombre indiqué est faible");
		}
	}
	public void setAuteur (String auteur) {
		this.auteur = auteur;
	}
	public void setTitre (String titre) {
		this.titre = titre;
	}
	public String toString(String auteur , String titre , float nbPages) {
		String ch = "Livre intitulé "+titre+" de "+auteur+", contenant "+nbPages+" pages.";
		return ch;
	}
	public void decrire() {
		System.out.println(toString(auteur,titre,nbPages));
	}
	public Livre() {
		nbPages = 0;
	}
	public Livre (String titre , float nbPages) {
		this.titre = titre;
		this.nbPages = nbPages;
	}
	public Livre (String titre , String auteur , float nbPages) {
		this.auteur = auteur;
		this.titre = titre;
		this.nbPages = nbPages;
	}
}
