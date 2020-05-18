package benimsinavsorumodev2;

public class Mudur extends Calisan {
	private static final int CIPLAK_MAAS1 = 5500;
	private static final int PRIM_LIMITI = 50000;
	private int satis;
	public Mudur(String ad, String soyad){
	super(ad, soyad);
	}
	public void setToplamSatis(int satis) {
	this.satis = satis;
	}
	public int maasHesapla() {
	if (this.satis > Mudur.PRIM_LIMITI) {
	return CIPLAK_MAAS1 +
	 (this.satis - Mudur.PRIM_LIMITI) / 10; }
	return CIPLAK_MAAS1;
	}
	public String kimimBen() {
	return "Müdür";
	
	
	}
}
