package it.visualstudioprojects.spring_musicisti.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.visualstudioprojects.spring_musicisti.service.OrchestraHandler;

@Component
public class SpringMusicistiRunner implements CommandLineRunner {

    @Autowired
    private ApplicationContext context;

    @Override
    public void run(String... args) {
        OrchestraHandler orchestra = context.getBean(OrchestraHandler.class);
        orchestra.suonaOrchestra();
    }
}
