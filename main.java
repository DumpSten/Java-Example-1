package intro;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		System.out.println("Hello World !");
		// değişken isimlendirilmesi Java'da camelCase yazılır
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "Vade Süresi";
		System.out.println(ortaMetin);

		int vade = 12;
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		boolean dolarDustuMu = false;
		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emeklilik" };

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
