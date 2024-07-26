import player_multimediale.Audio;
import player_multimediale.Immagine;
import player_multimediale.Multimedia;
import player_multimediale.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Multimedia[] playlist = new Multimedia[5];
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Seleziona il tipo di file per l'elemento " + (i + 1) + ":");
            System.out.println("1) Immagine");
            System.out.println("2) Video");
            System.out.println("3) Audio");

            int scelta = scanner.nextInt();


            switch (scelta) {
                case 1:
                    playlist[i] = new Immagine();
                    break;
                case 2:
                    playlist[i] = new Video(); // Esempio di durata
                    break;
                case 3:
                    playlist[i] = new Audio(); // Esempio di durata
                    break;
                default:
                    System.out.println("Scelta non valida. Inserisci 1, 2 o 3.");
                    i--; // decrementa i per ripetere l'input
                    break;
            }
        }
        System.out.println("Ecco la tua Play List");
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————");
        int elementoDaRiprodurre;
        do {
            System.out.println("Scegli l'elemento da riprodurre da 1 a 5 (digita 0 per uscire):");
            elementoDaRiprodurre = scanner.nextInt();


            if (elementoDaRiprodurre >= 1 && elementoDaRiprodurre <= 5) {
                playlist[elementoDaRiprodurre - 1].play();
            } else if (elementoDaRiprodurre != 0) {
                System.out.println("Scelta non valida. Inserisci un numero da 1 a 5 oppure 0 per uscire.");
            }
        } while (elementoDaRiprodurre != 0);

        System.out.println("Programma terminato.");
    }
}

  