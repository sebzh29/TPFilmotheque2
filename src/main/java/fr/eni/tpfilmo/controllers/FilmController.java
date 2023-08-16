package fr.eni.tpfilmo.controllers;

import fr.eni.tpfilmo.bo.Film;
import fr.eni.tpfilmo.bo.Genre;
import fr.eni.tpfilmo.bo.Participant;
import fr.eni.tpfilmo.service.FilmService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostConstruct
    public void init() {
        System.out.println("******************************Init*************************************");
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
    }

    @GetMapping("/films/{id:[0-9]+}")
    public String details(@PathVariable Long id, Model model) {
        model.addAttribute("film", filmService.getFilmById(id));
        return ("/film/details");
    }

    @GetMapping("/films")
    public String liste(Model model) {
        model.addAttribute("films", filmService.getAllFilms());
        return ("/film/liste");
    }
}
