package gume;
/**
 * klasa predstavlja auto gumu
 * @author NikolaRadivojevic
 * @version1.0
 *
 */
public class AutoGuma {
	/**
	 * nazi marke i modela gume
	 */
	private String markaModel = null;
	/**
	 * precnik gume
	 */
	private int precnik = 0;
	/**
	 * sirina gume
	 */
	private int sirina = 0;
	/**
	 * visina gume
	 */
	private int visina = 0;
	/**
	 * vraca marku i model
	 * @return marku i model gume
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	/**
	 * postavlja marku i model gume
	 * @throws java.lang.RuntimeException ako je unet null ili duzina manja od 3 karaktera
	 * @param markaModel koji predstavlja marku i model gume
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
				throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	/**
	 * vraca precnik gume
	 * @return precnik gume
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * postavlja precnik gume
	 * @param precnik prosledjuje precnik gume
	 * @throws java.lang.RuntimeException ukoliko je precnik van granica 13-22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
				throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * vraca sirinu gume
	 * @return sirinu gume
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * 
	 * @param sirina prosledjuje sirinu gume
	 * @throws java.lang.RuntimeException ukoliko je sirina van opsega123-355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
				throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * vraca visinu gume
	 * @return visinu gume
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * postavlja visinu gume
	 * @param visina gume
	 * @throws java.lang.RuntimeException ukoliko je van opsega 25-95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
				throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	/**
	 * Vraca String sa svim podacima o gumi
	 * @return String sa svim podacim o gumi
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
				", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * Proverava da li su dve gume iste
	 * poredi dva objekta prema marki i modelu, precniku,visini i sirini gume
	 * @return true ako su gume iste
	 * a false u svim ostalim situacijama
	 * @param objekat klase guma
	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}
	
	
	
}
