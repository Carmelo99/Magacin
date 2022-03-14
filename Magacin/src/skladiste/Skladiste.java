package skladiste;

import java.util.List;

import artikli.Artikal;
import interfejsmagacina.MagacinInterfejs;

public class Skladiste implements MagacinInterfejs {

	List<Artikal> artikli;
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		
		artikli.add(artikal);

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		
		artikli.remove(artikal);

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for(Artikal a: artikli) {
			if (a.getSifra()==sifra) return a;
		}
		return null;
	}

}
