package CinemaApp;/*
 * PRAKTIKUM 03 "IN234 Paradigma Pemrograman" - SOAL 1
 * Nama Program : CinemaApp.Cinema
 * Deskripsi    : Class CinemaApp.Cinema, yang menampung film-film yang akan ditayangkan
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
 */

import java.util.ArrayList;

public class Cinema {
    private Integer numberOfStudio = 10;
    private ArrayList<Film> films;

    public Cinema() {
        films = new ArrayList<>();
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public Integer getNumberOfStudio() {
        return numberOfStudio;
    }

    public Film getLongestFilm() {
        if (films.isEmpty()) {
            return null;
        }

        Film longestFilm = films.get(0);
        for (Film film : films) {
            if (film.getDuration() > longestFilm.getDuration()) {
                longestFilm = film;
            }
        }
        return longestFilm;
    }

    public Film getShortestFilm() {
        if  (films.isEmpty()) {
            return null;
        }

        Film shortestFilm = films.get(0);
        for (Film film : films) {
            if (film.getDuration() < shortestFilm.getDuration()) {
                shortestFilm = film;
            }
        }
        return shortestFilm;
    }
}
