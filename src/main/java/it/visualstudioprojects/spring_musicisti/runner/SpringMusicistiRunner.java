package it.visualstudioprojects.spring_musicisti.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.visualstudioprojects.spring_musicisti.model.Musicista;
import it.visualstudioprojects.spring_musicisti.model.StrumentoMusicale;

@Component
public class SpringMusicistiRunner implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    @Autowired
    List<StrumentoMusicale> strumentiMusicali;

    @Override
    public void run(String... args) {
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
}
