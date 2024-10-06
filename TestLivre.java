package TD1_3;

public class TestLivre {
	public static void main (String [] args) {
		Livre tab[] = new Livre[10];
		tab[0] = new Livre("L'alchimiste" , "Coelho" , 255);
		tab[1] = new Livre("La Tunisie" , 508);
		tab[2] = new Livre("Harry Potter" , "JK Rowling" , 0);
		for (int i=0 ; i<=2 ; i++) {
			System.out.println("Titre :"+tab[i].getTitre());
			System.out.println("Auteur :"+tab[i].getAuteur());
			System.out.println("Nb Pages :"+tab[i].getNbPages());
		}
		tab[1].setAuteur("Paulo Coelho");
		tab[2].setNbPages(461);
		for (int i=0 ; i<3 ; i++) {
			tab[i].decrire();
		}
	}	
}
