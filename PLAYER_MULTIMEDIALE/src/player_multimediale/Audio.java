package player_multimediale;

import java.util.Random;

public class Audio extends Multimedia implements Volume {
    //ATTRIBUTI
    private int idAudio;
    private String nome;
    private int durata;
    private int volume;

    //COSTRUTTORI
    public Audio() {
        super("MP3");
        Random random = new Random();
        this.idAudio = random.nextInt(0, 150);
        this.nome = "Audio." + this.idAudio + "." + this.tipoFile;
        this.durata = random.nextInt(0, 5);
        this.volume = random.nextInt(10);
    }
    //METODI


    @Override
    public void play() {
      
    }

    @Override
    public void alzaVol() {
        if (volume > 10) {
            volume++;
        }
    }

    @Override
    public void abassaVol() {
        if (volume < 0) {
            volume--;
        }
    }

    public int getIdAudio() {
        return idAudio;
    }

    public String getNome() {
        return nome;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "Id_Audio=" + idAudio +
                ", Nome='" + nome + '\'' +
                ", Durata=" + durata + "min" +
                ", Volume=" + volume + "db" +
                ", Tipo File='" + tipoFile + '\'' +
                '}';
    }
}
