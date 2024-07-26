package riproduttoreMultimediale;

import interfaces.NonRiproducibile;

public class Immagini extends OggettiMultimediali implements NonRiproducibile {
    private int luminosita;


    public Immagini(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.printf(this.Titolo + " ");
        for (int i = 0; i < luminosita; i++) {
            System.out.printf("*");
        }
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Immagini{" +
                "luminosita=" + luminosita +
                '}';
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
