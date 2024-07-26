package riproduttoreMultimediale;

import interfaces.Riproducibile;

public class Audio extends OggettiMultimediali implements Riproducibile {

    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void abbassaVolume() {
        this.volume++;
    }

    @Override
    public void alzaVolume() {
        this.volume--;
    }
}
