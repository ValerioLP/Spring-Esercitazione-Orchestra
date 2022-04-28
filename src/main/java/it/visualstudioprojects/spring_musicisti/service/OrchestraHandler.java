package it.visualstudioprojects.spring_musicisti.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.visualstudioprojects.spring_musicisti.model.Musicista;
import it.visualstudioprojects.spring_musicisti.model.StrumentoMusicale;

@Component
public class OrchestraHandler {

    @Autowired
    private ApplicationContext context;

    @Autowired
    List<StrumentoMusicale> strumentiMusicali;

    public void suonaOrchestra() {
        List<Musicista> musicisti = new ArrayList<>();
        Musicista musicista;
        for (StrumentoMusicale strumento : strumentiMusicali) {
            musicista = context.getBean(Musicista.class);
            musicista.setStrumentoMusicale(strumento);
            musicisti.add(musicista);
        }
        for (Musicista m : musicisti)
            m.suona();
    }

    @PostConstruct
    public void arrivederci() {
        System.out.println("Arrivederci!");
    }
}
