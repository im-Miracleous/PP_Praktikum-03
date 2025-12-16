package LibraryApp;/*
 * PRAKTIKUM 03 "IN234 Paradigma Pemrograman" - SOAL 2
 * Nama Program : BookListt
 * Deskripsi    : Class LibraryApp.BookList, yang melakukan operasi jika ada buku yang ditambahkan, ingin mencari buku tertentu, atau sekedar melihat keseluruhan isi rak buku.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
 */

import java.util.ArrayList;

public class BookList {
    private final ArrayList<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public Book searchBook (String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books to show");
        } else {
            System.out.printf("%-12s %-25s %s%n", "ISBN", "Title", "Author");
            for  (Book book : books) {
                System.out.printf("%-12s %-25s %s%n", book.getIsbn(), book.getTitle(), book.getAuthor());
            }
        }
    }
}
