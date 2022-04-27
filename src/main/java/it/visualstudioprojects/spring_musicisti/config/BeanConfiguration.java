package it.visualstudioprojects.spring_musicisti.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.visualstudioprojects.spring_musicisti.model.Batteria;
import it.visualstudioprojects.spring_musicisti.model.Chitarra;
import it.visualstudioprojects.spring_musicisti.model.Musicista;
import it.visualstudioprojects.spring_musicisti.model.StrumentoMusicale;
import it.visualstudioprojects.spring_musicisti.model.Tromba;
import it.visualstudioprojects.spring_musicisti.model.Violino;

@Configuration
public class BeanConfiguration {

    @Bean
    @Scope("prototype")
    public Musicista musicista() {
        return new Musicista();
    }

    @Bean
    public StrumentoMusicale chitarra() {
        return new Chitarra();
    }

    @Bean
    public StrumentoMusicale tromba() {
        return new Tromba();
    }

    @Bean
    public StrumentoMusicale batteria() {
        return new Batteria();
    }

    @Bean
    public StrumentoMusicale violino() {
        return new Violino();
    }
}
