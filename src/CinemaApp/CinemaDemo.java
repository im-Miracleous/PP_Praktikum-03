package CinemaApp;/*
 * PRAKTIKUM 03 "IN234 Paradigma Pemrograman" - SOAL 1
 * Nama Program : CinemaApp.CinemaDemo
 * Deskripsi    : Class CinemaApp.CinemaDemo, yang menjalankan program dan mensimulasikan pendaftaran film untuk ditayangkan di bioskop
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
 */

import java.util.Scanner;

public class CinemaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema();
        Admin cinemaAdmin = new Admin(cinema);

        System.out.println("CinemaApp Demo");

        int choice = 0;
        while (true) {
            System.out.println("==========================================");
            System.out.println("1. Add new film");
            System.out.println("2. View all films");
            System.out.println("3. Show longest film");
            System.out.println("4. Show shortest film");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Film Title: ");
                String title = sc.nextLine();
                System.out.print("Duration: ");
                int duration = sc.nextInt();
                sc.nextLine();
                Film newFilm = new Film(title, duration);
                cinemaAdmin.addFilm(newFilm);
            } else if (choice == 2) {
                cinemaAdmin.viewAllFilm();
            } else if (choice == 3) {
                cinemaAdmin.viewLongestFilm();
            } else if (choice == 4) {
                cinemaAdmin.viewShortestFilm();
            } else if (choice == 5) {
                System.exit(0);
            } else {
                System.out.println("Wrong menu");
            }
        }
    }
}
