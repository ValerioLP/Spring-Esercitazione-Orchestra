package it.visualstudioprojects.spring_musicisti.model;

public class Batteria implements StrumentoMusicale {

    @Override
    public void suona() {
        System.out.println("BUMBUUMBUMBUMBUUUMBUMCIA'");
    }

}
