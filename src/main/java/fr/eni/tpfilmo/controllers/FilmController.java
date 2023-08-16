package fr.eni.tpfilmo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.eni.tpfilmo.bo.Film;
import fr.eni.tpfilmo.bo.Genre;
import fr.eni.tpfilmo.bo.Participant;
import fr.eni.tpfilmo.service.FilmService;
import jakarta.annotation.PostConstruct;

@Controller
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostConstruct
    public void init() {
        System.out.println("*****************  Init ******************");
        Genre g = new Genre(1L, "Action");
        Genre g1 = new Genre(2L, "Animation");

        Participant acteur = new Participant(1L, "Richard", "Attenborough");
        Participant realisateur = new Participant(1L,"Steven","Spielberg");

        Participant acteur1 = new Participant(2L, "Mark", "Rylance");
        Participant realisateur1 = new Participant(2L,"David","Cronenberg");

        Film f = new Film(1L, "Jurassic Park", 1993, 128,
                "Le film raconte l'histoire d'un milliardaire et son équipe de généticiens parvenant"
                        + " à ramener à la vie des dinosaures grâce au clonage.", g, realisateur, List.of(acteur),
                null);
        filmService.saveFilm(f);

        Film f1 = new Film(2L, "The fly", 1986, 95,
                "Il s''agit de l''adaptation cinématographique de la nouvelle éponyme de l''auteur George Langelaan."
                        , g1, realisateur1, List.of(acteur1),
                null);
        filmService.saveFilm(f1);
    }

    @GetMapping("/films/{id:[0-9]+}")
    public String details(@PathVariable Long id,Model model) {
        model.addAttribute("film",filmService.getFilmById(id));
        return "/film/details";
    }

    @GetMapping("/films")
    public String liste(Model model) {
        model.addAttribute("films",filmService.getAllFilms());
        return "/film/liste";
    }

}