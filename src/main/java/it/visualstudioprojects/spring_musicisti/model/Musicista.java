package it.visualstudioprojects.spring_musicisti.model;

import javax.annotation.PostConstruct;

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

    @PostConstruct
    public void arrivederci() {
        System.out.println("Arrivederci!");
    }

}
