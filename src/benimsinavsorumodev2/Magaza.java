package benimsinavsorumodev2;

public class Magaza {

	public static void main(String[] args) {
		
		Calisan calisanlar[] = new Calisan[7];
		calisanlar[0] = new Mudur("Elif", "A�nar");
		((Mudur)calisanlar[0]).setToplamSatis(37000);
		calisanlar[1] = new Tezgahtar("Cem", "Y�ld�z");
		
		((Tezgahtar) calisanlar[1]).setSatis(30000);
		calisanlar[2] = new Tezgahtar("�irin", "Y�ld�z");
		((Tezgahtar) calisanlar[2]).setSatis(28000);
		calisanlar[3] = new IdariPersonel("Ay�e", "Su");
		calisanlar[4] = new IdariPersonel("Mehmet", "Kiraz");
		calisanlar[5] = new Hizmetli("Ali", "Da�l�");
		
		((Hizmetli) calisanlar[5]).setMesaiSaati(50);
		calisanlar[6] = new Hizmetli("Ahmet", "Ak�n");
		((Hizmetli) calisanlar[6]).setMesaiSaati(45);
		
		System.out.println("�al��anlar�n Maa�lar�:");
		for (int i = 0; i < calisanlar.length; ++i) {
		System.out.println(calisanlar[i].getBilgi());
		}
	}

}
