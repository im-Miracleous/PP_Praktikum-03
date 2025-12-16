package LibraryApp;/*
 * PRAKTIKUM 03 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : LibraryApp.BookDemo
 * Deskripsi    : Class LibraryApp.BookDemo, yang menjalankan program dan mensimulasikan penataan buku di dalam sebuah rak buku di perpustakaan.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
 */

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();

        int choice = 0;
        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("           Library Application           ");
            System.out.println("1. Show all books");
            System.out.println("2. Add new book");
            System.out.println("3. Search book");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------------");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                bookList.showAllBooks();
            }
            else if (choice == 2) {
                System.out.print("New ISBN: ");
                String isbn = sc.nextLine();
                System.out.print("New Title: ");
                String title = sc.nextLine();
                System.out.print("New Author: ");
                String author = sc.nextLine();
                Book newBook = new Book(isbn, title, author);
                bookList.addBook(newBook);
            }
            else if (choice == 3) {
                System.out.print("Search (ISBN): ");
                String srcISBN = sc.nextLine();
                if (bookList.searchBook(srcISBN) != null) {
                    System.out.println("Book found!");
                    System.out.printf("ISBN: %s\n",  bookList.searchBook(srcISBN).getIsbn());
                    System.out.printf("Title: %s\n",  bookList.searchBook(srcISBN).getTitle());
                    System.out.printf("Author: %s\n",  bookList.searchBook(srcISBN).getAuthor());
                }
                else {
                    System.out.println("Book not found!");
                }
            }
            else if (choice == 4) {
                System.exit(0);
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}
