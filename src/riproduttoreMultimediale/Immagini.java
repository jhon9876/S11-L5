package riproduttoreMultimediale;

import interfaces.NonRiproducibile;

public class Immagini extends OggettiMultimediali implements NonRiproducibile {
    private int luminosita;

    public Immagini(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    @Override
    public void aumentaLuminosita() {
        this.luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        this.luminosita--;
    }
}
