package fr.eni.tpfilmo;

import fr.eni.tpfilmo.bo.Film;
import fr.eni.tpfilmo.bo.Genre;
import fr.eni.tpfilmo.bo.Participant;
import fr.eni.tpfilmo.service.FilmService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TpFilmoApplicationTests {

    @Autowired
    private FilmService filmService;

    @Test
    void testAjout() {

        Genre genre = new Genre(1L, "Action");
        Participant acteur = new Participant(1L, "Richard", "Attenborough");
        Participant realisateur= new Participant(1L, "Steven", "Seagall");

        Film film = new Film(1L,
                "Jurrassic park",
                1993,
                128,
                "Le film parle de dynosaures.....",
                genre,
                realisateur,
                List.of(acteur),
                null
                );

        filmService.saveFilm(film);
        System.out.println("*******************FILMS*****************************");
        System.out.println(film);


    }

    @Test
    void contextLoads() {
    }

}
