package CinemaApp;/*
 * PRAKTIKUM 03 "IN234 Paradigma Pemrograman" - SOAL 1
 * Nama Program : CinemaApp.Film
 * Deskripsi    : Class CinemaApp.Film, yang berisi informasi film (judul dan durasi)
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
 */

public class Film {
    private String title;
    private int duration;

    public Film(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
