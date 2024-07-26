package player_multimediale;

import java.util.Random;

public class Video extends Multimedia implements Volume, Luminosita {
    //ATTRIBUTI
    private int idVideo;
    private String nome;
    private int durata;
    private int luminosita;
    private int volume;

    //COSTRUTTORI
    public Video() {
        super("MOV");
        Random random = new Random();
        this.idVideo = random.nextInt(150);
        this.nome = "Video" + this.idVideo + "." + this.tipoFile;
        this.durata = random.nextInt(5);
        this.luminosita = random.nextInt(10);
        this.volume = random.nextInt(10);
    }
    //METODI


    @Override
    public void play() {
       
    }

    @Override
    public void alzaVol() {
        volume++;
    }

    @Override
    public void abassaVol() {
        volume--;
    }

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

    public int getIdVideo() {
        return idVideo;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public int getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return "Video{" +
                "Tipo File='" + tipoFile + '\'' +
                ", Volume=" + volume + "dB" +
                ", Luminosità=" + luminosita +
                ", Durata=" + durata + "min" +
                ", Nome='" + nome + '\'' +
                ", Id_Video=" + idVideo +
                '}';
    }
}
