package riproduttoreMultimediale;

/*ORGANIZZARE OPPORTUNAMENTE CON CLASSI ASTRATTE, INTERFACCE E CLASSI CONCRETE IL CODICE
 * DI UN LETTORE MULTIMEDIALE CHE MEMORIZZA 5 ELEMENTI (CREATI CON VALORI LETTI DA TASTIERA)
 * IN UN ARRAY E POI CHIEDE RIPETUTAMENTE ALL'UTENTE QUALE OGGETTO ESEGUIRE (LEGGENDO UN INTERO DA 1 A 5 OPPURE
 * 0 PER FINIRE)
 * */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*VERIFICA METODO PLAY AUDIO*/
        /*Audio a1 = new Audio("hello_world", 2, 5);

        a1.play();*/
        /*VERIFICA PLAY VIDEO*/
        /*Video v1 = new Video("hello", 5, 2, 7);
        v1.play();*/
        Scanner scanner = new Scanner(System.in);
        OggettiMultimediali[] objM = new OggettiMultimediali[5];


        inserisciOggetti(scanner, objM);

        System.out.println("Inserisci un numero da 1 a 5 per eseguire il file.");
        System.out.println("Eseguire 0 per terminare");
        boolean condition = true;
        while (condition) {
            int valoreInserito = scanner.nextInt();
            switch (valoreInserito) {
                case 0: {
                    condition = false;
                    break;
                }
                case 1: {
                    playOrShow(objM, 0);
                    break;
                }
                case 2: {
                    playOrShow(objM, 1);
                    break;
                }
                case 3: {
                    playOrShow(objM, 2);
                    break;
                }
                case 4: {
                    playOrShow(objM, 3);
                    break;
                }
                case 5: {
                    playOrShow(objM, 4);
                    break;
                }
                default:
                    System.out.println("numero fuori dal range");
            }
        }


    }

    public static void playOrShow(OggettiMultimediali[] objM, int posizioneArray) {
        if (objM[posizioneArray] instanceof Immagini) {
            ((Immagini) objM[posizioneArray]).show();
        } else if (objM[posizioneArray] instanceof Audio) {
            ((Audio) objM[posizioneArray]).play();
        } else if (objM[posizioneArray] instanceof Video) {
            {
                ((Video) objM[posizioneArray]).play();
            }
        }
    }

    public static void inserisciOggetti(Scanner scanner, OggettiMultimediali[] objM) {
        System.out.println("Inserisci il nome dell'oggetto da creare tra audio, immagine e video");
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int durataRandom = rand.nextInt(1, 5);
            int volumeRandom = rand.nextInt(1, 5);
            int luminositaRandom = rand.nextInt(1, 5);

            System.out.println("Oggetto " + i);
            String elemento = scanner.nextLine();
            switch (elemento.toUpperCase()) {
                case "AUDIO": {

                    Audio a1 = new Audio("epicode", durataRandom, volumeRandom);
                    objM[i] = a1;
                    break;
                }
                case "VIDEO": {
                    Video v1 = new Video("epicode", durataRandom, volumeRandom, luminositaRandom);
                    objM[i] = v1;
                    break;
                }
                case "IMMAGINE": {
                    Immagini img1 = new Immagini("epicode", luminositaRandom);
                    objM[i] = img1;
                    break;
                }
                default: {
                    System.out.println("Nessun file multimediale creabile con quel nome");
                    System.exit(-1);
                }

            }


        }

    }
}