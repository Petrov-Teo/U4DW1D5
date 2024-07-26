package player_multimediale;

public abstract class Multimedia {
    //ATTRIBUTI
    protected String tipoFile;

    //COSTRUTTORI
    public Multimedia(String tipoFile) {
        this.tipoFile = tipoFile;
    }

    //METODI
    public void play() {

    }

    public void show() {

    }

    public String getTipoFile() {
        return tipoFile;
    }

    public void setTipoFile(String tipoFile) {
        this.tipoFile = tipoFile;
    }

    @Override
    public String toString() {
        return "Multimedia{" +
                "Tipo File='" + tipoFile + '\'' +
                '}';
    }
}



