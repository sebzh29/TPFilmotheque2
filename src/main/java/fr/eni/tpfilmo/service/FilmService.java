package fr.eni.tpfilmo.service;

import fr.eni.tpfilmo.bo.Film;
import fr.eni.tpfilmo.bo.Genre;
import fr.eni.tpfilmo.bo.Participant;

import java.util.List;

public interface FilmService {

    List<Film> getAllFilms();
    Film getFilmById(Long id);
    List<Genre> getGenres();
    Genre getGenreById(Long id);
    List<Participant> getParticipants();
    Participant getParticipantById(Long id);
    void saveFilm(Film film);

}
