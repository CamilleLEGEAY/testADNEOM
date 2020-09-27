package partitions;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public List<List<Integer>> partition(List<Integer> liste, int taille) {
		List<List<Integer>> listeSousListes = new ArrayList<>();
		Integer elementSuivant = 0;

		while (elementSuivant < liste.size()) {
			List<Integer> sousListe = new ArrayList<Integer>();
			for (int i = 0; i < taille && elementSuivant != liste.size() ; i++) {
				sousListe.add(liste.get(elementSuivant));
				elementSuivant++;
			}
			listeSousListes.add(sousListe);
		}
		return listeSousListes;
	}
}
