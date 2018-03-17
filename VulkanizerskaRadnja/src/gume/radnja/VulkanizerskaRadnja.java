package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * klasa predstavlja vulkanizersku radnjui
 * @author NikolaRadivojevic
 * @version1.0
 *
 */

public class VulkanizerskaRadnja {
	/**
	 * lista gume predstavlja listu guma koje se nalaze u vulkanizerskoj radnji
	 */
	private LinkedList<AutoGuma> gume =new LinkedList<AutoGuma>();
	/**
	 * metoda unosi novu gumu u listu
	 * @param a predstavlja novu gumu koja se dodaje u listu 
	 * @throws java.lang.RuntimeException ukoliko guma vec postoji u listi
	 * @throws java.lang.NullPointerException ukoliko je uneti parametar null
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * metoda prolazi kroz listu i vraca sve gume sa zadatim nazivom u vidu liste
	 * @param markaModel predstavlja naziv gume koja treba bitipronadjena u listi
	 * @return vraca gumu koja je trazena
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for(int i=0;i<gume.size();i++) {
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		}
		return novaLista;
	}

}
