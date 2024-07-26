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
    public String toString() {
        return "Video{" +
                "durata=" + durata +
                ", volume=" + volume +
                ", luminosita=" + luminosita +
                '}';
    }

    /*Se il video è riprodotto, ripete per un numero di volte pari alla durata la stampa del titolo
     * concatenato a una sequenza di punti esclamativi di lunghezza pari al volume e poi a una sequenza
     * di asterischi di lunghezza pari alla luminosità (una stampa per riga)*/
    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.printf(this.Titolo + " ");

            for (int j = 0; j < this.volume; j++) {
                System.out.printf("!");

            }
            System.out.printf(" ");
            for (int k = 0; k < this.luminosita; k++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
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
