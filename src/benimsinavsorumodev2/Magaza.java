package benimsinavsorumodev2;

public class Magaza {

	public static void main(String[] args) {
		
		Calisan calisanlar[] = new Calisan[7];
		calisanlar[0] = new Mudur("Elif", "Aðnar");
		((Mudur)calisanlar[0]).setToplamSatis(37000);
		calisanlar[1] = new Tezgahtar("Cem", "Yýldýz");
		
		((Tezgahtar) calisanlar[1]).setSatis(30000);
		calisanlar[2] = new Tezgahtar("Þirin", "Yýldýz");
		((Tezgahtar) calisanlar[2]).setSatis(28000);
		calisanlar[3] = new IdariPersonel("Ayþe", "Su");
		calisanlar[4] = new IdariPersonel("Mehmet", "Kiraz");
		calisanlar[5] = new Hizmetli("Ali", "Daðlý");
		
		((Hizmetli) calisanlar[5]).setMesaiSaati(50);
		calisanlar[6] = new Hizmetli("Ahmet", "Akýn");
		((Hizmetli) calisanlar[6]).setMesaiSaati(45);
		
		System.out.println("Çalýþanlarýn Maaþlarý:");
		for (int i = 0; i < calisanlar.length; ++i) {
		System.out.println(calisanlar[i].getBilgi());
		}
	}

}
