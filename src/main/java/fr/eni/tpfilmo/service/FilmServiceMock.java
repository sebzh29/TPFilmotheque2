package fr.eni.tpfilmo.service;

import fr.eni.tpfilmo.bo.Film;
import fr.eni.tpfilmo.bo.Genre;
import fr.eni.tpfilmo.bo.Participant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmServiceMock implements FilmService{

    List<Film> lstFilms = new ArrayList<Film>();
    List<Genre> lstGenres = new ArrayList<Genre>();
    List<Participant> lstParticipants = new ArrayList<Participant>();


    @Override
    public List<Film> getAllFilms() {
        return lstFilms;
    }

    @Override
    public Film getFilmById(Long id) {
        for (Film film: lstFilms) {
            if(film.getId()==id) {
                return film;
            }
        }
        return null;
    }

    @Override
    public List<Genre> getGenres() {
        return lstGenres;
    }

    @Override
    public Genre getGenreById(Long id) {
        return null;
    }

    @Override
    public List<Participant> getParticipants() {
        return lstParticipants;
    }

    @Override
    public Participant getParticipantById(Long id) {
        return null;
    }

    @Override
    public void saveFilm(Film film) {
        lstFilms.add(film);

    }
}
