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
        this.idAudio = random.nextInt(1, 150);
        this.nome = "Audio." + this.idAudio + "." + this.tipoFile;
        this.durata = random.nextInt(1, 5);
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
