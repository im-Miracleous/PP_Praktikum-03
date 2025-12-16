package CinemaApp;/*
 * PRAKTIKUM 03 "IN234 Paradigma Pemrograman" - SOAL 1
 * Nama Program : CinemaApp.Admin
 * Deskripsi    : Class CinemaApp.Admin, yang mengatur setiap operasi dalam bioskop
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
 */

public class Admin {
    private Cinema cinema;
    public Admin(Cinema cinema) {
        this.cinema = cinema;
    }

    public void addFilm(Film film) {
        if (cinema.getFilms().size() < cinema.getNumberOfStudio()) {
            cinema.getFilms().add(film);
        }
    }

    public void viewAllFilm() {
        if (cinema.getFilms().isEmpty()) {
            System.out.println("No film");
        } else if (cinema.getFilms().size() == 1) {
            System.out.println("Film Title: " + cinema.getFilms().getFirst().getTitle());
            System.out.println("Duration: " + cinema.getFilms().getFirst().getDuration());
        } else {
            // Mencetak header tabel
            System.out.printf("%-25s %s%n", "Title", "Duration");

            // Mencetak data film
            for (Film film : cinema.getFilms()) {
                System.out.printf("%-25s %d%n", film.getTitle(), film.getDuration());
            }
        }
    }

    public void viewLongestFilm() {
        if (cinema.getFilms().isEmpty()) {
            System.out.println("No film");
        }
        else {
            System.out.println("Longest Film");
            System.out.println("Title: " + cinema.getLongestFilm().getTitle());
            System.out.println("Duration: " + cinema.getLongestFilm().getDuration());
        }
    }

    public void viewShortestFilm() {
        if (cinema.getFilms().isEmpty()) {
            System.out.println("No film");
        }
        else {
            System.out.println("Shortest Film");
            System.out.println("Title: " + cinema.getShortestFilm().getTitle());
            System.out.println("Duration: " + cinema.getShortestFilm().getDuration());
        }
    }
}
