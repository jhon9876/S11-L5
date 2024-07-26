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
        this.volume--;
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }

    /*Play se riprodotta, ripete per un numero di volte pari alla durata
     * la stampa del titolo concatenato a una sequenza di punti esclamativi di lunghezza
     * pari al volume (una stampa per riga)*/
    @Override
    public void play() {

        for (int i = 0; i < this.durata; i++) {
            System.out.printf(this.Titolo + " ");

            for (int j = 0; j < this.volume; j++) {
                System.out.printf("!");

            }
            System.out.println("");
        }
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "durata=" + durata +
                ", volume=" + volume +
                '}';
    }
}
