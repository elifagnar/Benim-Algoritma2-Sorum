package benimsinavsorumodev2;

public class Hizmetli extends Calisan{
	private static final int SAAT_UCRETI = 50;
	private int mesaiSaati;
	public Hizmetli(String ad, String soyad){
	super(ad, soyad);
	}
	public void setMesaiSaati(int mesaiSaati) {
	this.mesaiSaati = mesaiSaati;
	}
	public int maasHesapla() {
	return this.mesaiSaati * Hizmetli.SAAT_UCRETI;
	}
	public String kimimBen() {
	return "Hizmetli";

	}
}
