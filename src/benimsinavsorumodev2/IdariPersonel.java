package benimsinavsorumodev2;

public class IdariPersonel extends Calisan{
	private static final int MAAS = 3000;
	public IdariPersonel(String ad, String soyad){
	super(ad, soyad);
	}
	public int maasHesapla() {
	return IdariPersonel.MAAS;
	}
	public String kimimBen() {
	return "Ýdari Personel";
	}

}
