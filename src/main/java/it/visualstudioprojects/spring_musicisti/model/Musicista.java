package it.visualstudioprojects.spring_musicisti.model;

public class Musicista {

    private StrumentoMusicale strumentoMusicale;

    public StrumentoMusicale getStrumentoMusicale() {
        return strumentoMusicale;
    }

    public void setStrumentoMusicale(StrumentoMusicale strumentoMusicale) {
        this.strumentoMusicale = strumentoMusicale;
    }

    public void ritiraStrumentoMusicale() {
        strumentoMusicale = null;
    }

    public void suona() {
        strumentoMusicale.suona();
    }
}
