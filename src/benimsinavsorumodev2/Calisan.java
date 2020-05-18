package benimsinavsorumodev2;

public abstract class Calisan {
	private String ad;
	private String soyAd;
	
	public Calisan(String ad, String soyAd) {
		this.ad = ad;
		this.soyAd = soyAd;
	}
	public String getAd() {
	return ad;
	}
	public String getSoyAd() {
	return soyAd;
	}
	public abstract int maasHesapla();
	public String getBilgi() {
	return this.kimimBen() + ": " + this.ad + " " + this.soyAd +
	", bu ay " + this.maasHesapla() + " TL alacaktýr.";
	}
	public abstract String kimimBen();
	
	}

  
  
