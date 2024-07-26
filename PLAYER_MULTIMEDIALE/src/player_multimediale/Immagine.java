package player_multimediale;

import java.util.Random;

public class Immagine extends Multimedia implements Luminosita {
    //ATTRIBUTI

    private int idImmagine;
    private String nome;
    private int dimensione;
    private int luminosita;

    //COSTRUTTORI
    public Immagine() {
        super("Img");
        Random random = new Random();
        this.idImmagine = random.nextInt(250);
        this.nome = "immagine" + this.idImmagine + "." + this.tipoFile;
        this.dimensione = random.nextInt(30);
        this.luminosita = random.nextInt(10);
    }

    //METODI
    @Override
    public void alzaLuminosita() {
        if (luminosita < 10) {
            luminosita++;

        }
    }

    @Override
    public void abassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;

        }
    }

    @Override
    public void show() {
        System.out.println(nome + "*".repeat(luminosita));
    }

    public int getIdImmagine() {
        return idImmagine;
    }

    public String getNome() {
        return nome;
    }

    public int getDimensione() {
        return dimensione;
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "Tipo File='" + tipoFile + '\'' +
                ", Luminosità=" + luminosita +
                ", Dimensione=" + dimensione + "mb" +
                ", Nome='" + nome + '\'' +
                ", Id_Immagine=" + idImmagine +
                '}';
    }
}
