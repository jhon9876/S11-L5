package riproduttoreMultimediale;

public class Video extends OggettiMultimediali {
    private int durata;
    private int volume;

    public Video(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;

    }
}
