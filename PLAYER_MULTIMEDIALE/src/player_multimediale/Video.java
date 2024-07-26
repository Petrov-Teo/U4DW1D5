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
        this.idVideo = random.nextInt(1, 150);
        this.nome = "Video" + this.idVideo + "." + this.tipoFile;
        this.durata = random.nextInt(1, 5);
        this.luminosita = random.nextInt(1, 10);
        this.volume = random.nextInt(10);
    }
    //METODI


    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(nome + "!".repeat(volume));
        }

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurata() {
        return durata;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
