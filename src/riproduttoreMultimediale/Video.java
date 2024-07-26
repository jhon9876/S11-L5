package riproduttoreMultimediale;

import interfaces.NonRiproducibile;
import interfaces.Riproducibile;

public class Video extends OggettiMultimediali implements Riproducibile, NonRiproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;

    }

    @Override
    public void abbassaVolume() {
        this.volume--;
    }

    @Override
    public void alzaVolume() {
        this.volume++;
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
